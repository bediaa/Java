import java.util.ArrayList;
import java.time.LocalTime;

public class Zaman {

    static int sayac1 = 0;
    static int sayac2 = 0;

    public static void zaman(ArrayList<Integer> duz, ArrayList<Integer> ters,
                             int durakSirasi, int gecikme, int hatNumarasi) {

        if (durakSirasi > Main.duraklar.size()) {
            System.out.println("\nGirdiğiniz rakam hatalı veya geçersiz.");
            System.exit(1);
        }

        int duzSayac = 0;
        int tersSayac = 0;

        int duzEkSure = (durakSirasi - 1) * gecikme;
        int tersEkSure = (Main.duraklar.size() - durakSirasi) * gecikme;

        for (int duzSaatler : duz) {
            duz.set(duzSayac, (duzSaatler + duzEkSure));
            duzSayac++;
        }

        for (int tersSaatler : ters) {
            ters.set(tersSayac, (tersSaatler + tersEkSure));
            tersSayac++;
        }

        System.out.println();

        sureHesaplayici(duz, hatNumarasi);
        sureHesaplayici(ters, hatNumarasi);

        kesisim(hatNumarasi);
    }

    public static void sureHesaplayici(ArrayList<Integer> liste, int hatNumarasi) {
        LocalTime saat = LocalTime.now();
        int saniye = saat.toSecondOfDay();

        int sayac = 0;

        for (int vakit : liste) {

            if (vakit > saniye) {
                vakit -= saniye;
                int hh = vakit / 3600;
                vakit -= hh * 3600;
                int mm = vakit / 60;
                vakit -= mm * 60;
                int ss = vakit;

                sayac++;

                if (hatNumarasi == 1) {
                    hat1(hh, mm, ss);
                } else if (hatNumarasi == 2) {
                    hat2(hh, mm, ss);
                } else {
                    hat3(hh, mm, ss);
                }

                break;
            }
        }

        if (sayac == 0) {
            liste.set(0, (liste.get(0) + 86400));
            sureHesaplayici(liste, hatNumarasi);
        }
    }

    public static void hat1(int hh, int mm, int ss) {

        String mesaj;

        if (hh == 0 && mm == 0) {
            mesaj = ss + " saniye";
        } else if (hh == 0) {
            mesaj = mm + " dakika " + ss + " saniye";
        } else {
            mesaj = hh + " saat " + mm + " dakika " + ss + " saniye";
        }

        if (sayac1 == 0) {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " OSB-Törekent - Kızılay - Koru istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1++;

        } else {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " Koru - Kızılay - OSB-Törekent istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1--;
        }
    }

    public static void hat2(int hh, int mm, int ss) {

        String mesaj;

        if (hh == 0 && mm == 0) {
            mesaj = ss + " saniye";
        } else if (hh == 0) {
            mesaj = mm + " dakika " + ss + " saniye";
        } else {
            mesaj = hh + " saat " + mm + " dakika " + ss + " saniye";
        }

        if (sayac1 == 0) {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " Şehitler - AKM istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1++;

        } else {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " AKM - Şehitler istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1--;
        }
    }

    public static void hat3(int hh, int mm, int ss) {

        String mesaj;

        if (hh == 0 && mm == 0) {
            mesaj = ss + " saniye";
        } else if (hh == 0) {
            mesaj = mm + " dakika " + ss + " saniye";
        } else {
            mesaj = hh + " saat " + mm + " dakika " + ss + " saniye";
        }

        if (sayac1 == 0) {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " AŞTİ - Dikimevi istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1++;

        } else {
            System.out.println(Main.duraklar.get(Main.girdi2 - 1).durakAdi + " durağında" +
                    " Dikimevi - AŞTİ istikametinde giden metronun gelmesine " + mesaj + " kaldı.");

            sayac1--;
        }
    }

    public static void kesisim(int hatNumarasi) {
        int sayac = 0;

        if (Main.duraklar.get(Main.girdi2 - 1).kesisimNoktasiMi && sayac2 == 0) {
            sayac2++;

            String durakAdi = Main.duraklar.get(Main.girdi2 - 1).durakAdi;

            if (hatNumarasi == 1) {
                Main.duraklar = KeciorenHatti.kecioren();

                for (KeciorenHatti durak : KeciorenHatti.kecioren()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 2;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }
                sayac = 0;
                Main.duraklar = AnkarayHatti.ankaray();

                for (AnkarayHatti durak : AnkarayHatti.ankaray()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 3;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }

            } else if (hatNumarasi == 2) {
                Main.duraklar = AnkaraMetrosuHatti.ankaraMetrosu();

                for (AnkaraMetrosuHatti durak : AnkaraMetrosuHatti.ankaraMetrosu()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 1;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }
                sayac = 0;
                Main.duraklar = AnkarayHatti.ankaray();

                for (AnkarayHatti durak : AnkarayHatti.ankaray()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 3;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }

            } else {
                Main.duraklar = AnkaraMetrosuHatti.ankaraMetrosu();

                for (AnkaraMetrosuHatti durak : AnkaraMetrosuHatti.ankaraMetrosu()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 1;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }
                sayac = 0;
                Main.duraklar = KeciorenHatti.kecioren();

                for (KeciorenHatti durak : KeciorenHatti.kecioren()) {
                    sayac++;

                    if (durakAdi.equals(durak.durakAdi)) {
                        Main.girdi1 = 2;
                        Main.girdi2 = sayac;

                        Main.girdiYonlendirici();
                    }
                }
            }
        }
    }
}