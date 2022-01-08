import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int girdi1 = 0;
    static int girdi2 = 0;
    static ArrayList<? extends BaseHat> duraklar = new ArrayList<>();

    public static void main(String[] args) {
        mesajlar();

        girdi1 = girdiAlici(girdi1);

        hatSecici(girdi1);

        girdi2 = girdiAlici(girdi2);

        girdiYonlendirici();
    }

    public static void mesajlar() {
        System.out.println("""
                                
                Hoş geldiniz. Metronun ne zaman geleceğini öğrenmek için lütfen bulunduğunuz hatta ait rakamı giriniz.
                                
                Ankara Metrosu hattı için : 1
                Keçiören hattı için : 2
                Ankaray hattı için : 3
                """);
    }

    public static int girdiAlici(int girdi) {
        int sayac = 0;

        Scanner scanner = new Scanner(System.in);

        while (sayac == 0) {
            try {
                girdi = scanner.nextInt();
                sayac++;
            } catch (Exception exception) {
                System.out.println("\nLütfen geçerli bir sayı giriniz.\n");
                scanner.next();
            }
        }

        return girdi;
    }

    public static void hatSecici(int girdi) {
        int sayac = 0;

        switch (girdi) {
            case 1 -> {
                System.out.println("\nLütfen Ankara Metrosu hattına ait duraklardan hangisinde olduğunuzu seçiniz.\n");

                for (AnkaraMetrosuHatti durak : AnkaraMetrosuHatti.ankaraMetrosu()) {
                    sayac++;
                    System.out.println(durak.durakAdi + " durağı için : " + sayac);
                }

                System.out.println();
                duraklar = AnkaraMetrosuHatti.ankaraMetrosu();
            }
            case 2 -> {
                System.out.println("\nLütfen Keçiören hattına ait duraklardan hangisinde olduğunuzu seçiniz.\n");

                for (KeciorenHatti durak : KeciorenHatti.kecioren()) {
                    sayac++;
                    System.out.println(durak.durakAdi + " durağı için : " + sayac);
                }

                System.out.println();
                duraklar = KeciorenHatti.kecioren();
            }
            case 3 -> {
                System.out.println("\nLütfen Ankaray hattına ait duraklardan hangisinde olduğunuzu seçiniz.\n");

                for (AnkarayHatti durak : AnkarayHatti.ankaray()) {
                    sayac++;
                    System.out.println(durak.durakAdi + " durağı için : " + sayac);
                }

                System.out.println();
                duraklar = AnkarayHatti.ankaray();
            }
            default -> {
                System.out.println("\nGirdiğiniz rakam hatalı veya geçersiz.");
                System.exit(1);
            }
        }
    }

    public static void girdiYonlendirici() {
        if (girdi1 == 1) {
            AnkaraMetrosuHatti.saatler();

        } else if (girdi1 == 2) {
            KeciorenHatti.saatler();

        } else {
            AnkarayHatti.saatler();
        }
    }
}