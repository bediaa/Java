import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class AnkarayHatti extends BaseHat {

    public AnkarayHatti(String durakAdi, boolean kesisimNoktasiMi) {
        super(durakAdi, kesisimNoktasiMi);
    }

    public static ArrayList<AnkarayHatti> ankaray() {
        ArrayList<AnkarayHatti> ankarayDuraklari = new ArrayList<>();

        ankarayDuraklari.add(new AnkarayHatti("AŞTİ", false));
        ankarayDuraklari.add(new AnkarayHatti("Emek", false));
        ankarayDuraklari.add(new AnkarayHatti("Bahçelievler", false));
        ankarayDuraklari.add(new AnkarayHatti("Beşevler", false));
        ankarayDuraklari.add(new AnkarayHatti("Anadolu", false));
        ankarayDuraklari.add(new AnkarayHatti("Maltepe", false));
        ankarayDuraklari.add(new AnkarayHatti("Demirtepe", false));
        ankarayDuraklari.add(new AnkarayHatti("Kızılay", true));
        ankarayDuraklari.add(new AnkarayHatti("Kolej", false));
        ankarayDuraklari.add(new AnkarayHatti("Kurtuluş", false));
        ankarayDuraklari.add(new AnkarayHatti("Dikimevi", false));

        return ankarayDuraklari;
    }

    public static void saatler() {
        Calendar calendar = Calendar.getInstance();
        int gun = calendar.get(Calendar.DAY_OF_WEEK);

        ArrayList<Integer> duz = new ArrayList<>();
        ArrayList<Integer> ters = new ArrayList<>();

        if (gun == 1) {
            Collections.addAll(duz, 0, 900, 1800, 3000, 21600, 22020, 22500, 23100, 23700, 24300, 24900, 25500,
                    26100, 26700, 27300, 27900, 28500, 29100, 29700, 30300, 30900, 31500, 32100, 32700, 33300, 33900,
                    34500, 35100, 35700, 36300, 36900, 37500, 38100, 38700, 39300, 39900, 40500, 41100, 41700, 42300,
                    42900, 43440, 43860, 44280, 44700, 45120, 45540, 45960, 46380, 46800, 47220, 47640, 48060, 48480,
                    48900, 49320, 49740, 50160, 50580, 51000, 51420, 51840, 52260, 52680, 53100, 53520, 53940, 54360,
                    54780, 55200, 55620, 56040, 56460, 56880, 57300, 57720, 58140, 58560, 58980, 59400, 59820, 60240,
                    60660, 61080, 61500, 61920, 62340, 62760, 63180, 63600, 64020, 64440, 64860, 65280, 65700, 66120,
                    66540, 66960, 67380, 67800, 68220, 68580, 69000, 69420, 69840, 70260, 70620, 71040, 71460, 71880,
                    72300, 72720, 73140, 73560, 73980, 74400, 74820, 75300, 75900, 76500, 77100, 77700, 78300, 78900,
                    79500, 80100, 80700, 81300, 81900, 82500, 83100, 83700, 84300, 84900, 85500);

            Collections.addAll(ters, 300, 900, 2100, 3300, 21600, 22500, 23100, 23700, 24300, 24900, 25500,
                    26100, 26700, 27300, 27900, 28500, 29100, 29700, 30300, 30900, 31500, 32100, 32700, 33300, 33900,
                    34500, 35100, 35700, 36300, 36900, 37500, 38100, 38700, 39300, 39900, 40500, 41100, 41700, 42300,
                    42900, 43440, 43860, 44460, 44880, 45300, 45720, 46140, 46560, 46980, 47400, 47820, 48240, 48660,
                    49080, 49500, 49920, 50340, 50760, 51180, 51600, 52020, 52440, 52860, 53280, 53700, 54120, 54540,
                    54960, 55380, 55800, 56220, 56640, 57060, 57480, 57900, 58320, 58740, 59160, 59580, 60000, 60420,
                    60840, 61260, 61680, 62100, 62520, 62940, 63360, 63780, 64200, 64620, 65040, 65460, 65880, 66300,
                    66720, 67140, 67980, 68160, 68400, 68820, 69240, 69660, 70020, 70440, 70860, 71280, 71760, 72060,
                    72480, 72900, 73320, 73740, 74160, 74580, 75000, 75420, 75900, 76500, 77100, 77700, 78300, 78900,
                    79500, 80100, 80700, 81300, 81900, 82500, 83100, 83700, 84300, 84900, 85500, 86100);

        } else if (gun == 7) {
            Collections.addAll(duz, 0, 900, 1800, 3000, 21600, 22020, 22500, 23100, 23700, 24300, 24900, 25500,
                    26100, 26700, 27300, 27900, 28500, 28920, 29280, 29640, 30000, 30360, 30720, 31080, 31440, 31800,
                    32160, 32520, 32880, 33240, 33600, 33960, 34320, 34680, 35040, 35400, 35760, 36120, 36480, 36840,
                    37200, 37560, 37920, 38280, 38640, 39000, 39360, 39720, 40080, 40440, 40800, 41160, 41520, 41880,
                    42240, 42600, 42960, 43320, 43680, 44040, 44400, 44760, 45120, 45480, 45840, 46200, 46560, 46920,
                    47640, 47880, 48000, 48360, 48720, 49080, 49440, 49800, 50160, 50520, 50880, 51240, 51600, 51960,
                    52320, 52680, 53040, 53400, 53760, 54120, 54480, 54840, 55200, 55560, 55920, 56280, 56640, 57000,
                    57360, 57720, 58080, 58440, 58800, 59160, 59520, 59880, 60240, 60600, 60960, 61320, 61680, 62040,
                    62400, 62760, 63120, 63480, 63840, 64200, 64560, 64920, 65280, 65640, 66000, 66360, 66720, 67080,
                    67440, 67800, 68160, 68520, 68880, 69240, 69600, 69960, 70320, 70620, 71040, 71460, 71880, 72300,
                    72720, 73140, 73560, 73980, 74400, 74820, 75300, 75900, 76500, 77100, 77700, 78300, 78900, 79500,
                    80100, 80700, 81300, 81900, 82500, 83100, 83700, 84300, 84900, 85500);

            Collections.addAll(ters, 300, 900, 2100, 3300, 21600, 22500, 23100, 23700, 24300, 24900, 25500,
                    26100, 26700, 27300, 27900, 28500, 29100, 29700, 30000, 30360, 30720, 31080, 31440, 31800, 32160,
                    32520, 32880, 33240, 33600, 33960, 34320, 34680, 35040, 35400, 35760, 36120, 36480, 36840, 37200,
                    37560, 37920, 38280, 38640, 39000, 39360, 39720, 40080, 40440, 40800, 41160, 41520, 41880, 42240,
                    42600, 42960, 43320, 43680, 44040, 44400, 44760, 45120, 45480, 45840, 46200, 46560, 46920, 47640,
                    47880, 48000, 48360, 48720, 49080, 49440, 49800, 50160, 50520, 50880, 51240, 51600, 51960, 52320,
                    52680, 53040, 53400, 53760, 54120, 54480, 54840, 55200, 55560, 55920, 56280, 56640, 57000, 57360,
                    57720, 58080, 58440, 58800, 59160, 59520, 59880, 60240, 60600, 60960, 61320, 61680, 62040, 62400,
                    62760, 63120, 63480, 63840, 64200, 64560, 64920, 65280, 65640, 66000, 66360, 66720, 67080, 67440,
                    67800, 68160, 68520, 68880, 69240, 69600, 69960, 70320, 70680, 71040, 71400, 71760, 72060, 72480,
                    72900, 73320, 73740, 74160, 74580, 75000, 75420, 75900, 76500, 77100, 77700, 78300, 78900, 79500,
                    80100, 80700, 81300, 81900, 82500, 83100, 83700, 84300, 84900, 85500, 86100);

        } else {
            Collections.addAll(duz, 0, 900, 1800, 3000, 21600, 22020, 22500, 23100, 23700, 24000, 24300, 24600,
                    24900, 25380, 25740, 25980, 26280, 26520, 26760, 27060, 27300, 27540, 27840, 28080, 28320, 28620,
                    28860, 29100, 29400, 29640, 29880, 30180, 30420, 30660, 30960, 31200, 31440, 31740, 31980, 32220,
                    32520, 32880, 33240, 33600, 33960, 34320, 34680, 35040, 35400, 35760, 36120, 36480, 36840, 37200,
                    37560, 37920, 38280, 38640, 39000, 39360, 39720, 40080, 40440, 40800, 41160, 41520, 41880, 42240,
                    42600, 42960, 43200, 43500, 43800, 44100, 44400, 44700, 45000, 45300, 45600, 45900, 46200, 46500,
                    46800, 47100, 47400, 47700, 48000, 48300, 48600, 48900, 49200, 49500, 49800, 50100, 50400, 50700,
                    51000, 51300, 51600, 51900, 52200, 52500, 52800, 53100, 53400, 53700, 54000, 54300, 54600, 54900,
                    55200, 55500, 55800, 56100, 56400, 56700, 57000, 57300, 57600, 57900, 58140, 58380, 58680, 58920,
                    59160, 59460, 59700, 59940, 60240, 60480, 60720, 61020, 61260, 61500, 61800, 62040, 62280, 62580,
                    62820, 63060, 63360, 63600, 63840, 64140, 64380, 64620, 64920, 65160, 65400, 65700, 65940, 66180,
                    66480, 66720, 66960, 67260, 67500, 67740, 68040, 68280, 68520, 68820, 69060, 69300, 69600, 69840,
                    70080, 70380, 70620, 71040, 71460, 71880, 72300, 72720, 73140, 73560, 73980, 74400, 74820, 75300,
                    75900, 76500, 77100, 77700, 78300, 78900, 79500, 80100, 80700, 81300, 81900, 82500, 83100, 83700,
                    84300, 84900, 85500);

            Collections.addAll(ters, 300, 900, 2100, 3300, 21600, 22500, 23100, 23700, 24300, 24900, 25200,
                    25500, 25800, 26100, 26400, 26760, 27060, 27300, 27540, 27840, 28080, 28320, 28620, 28860, 29100,
                    29400, 29640, 29880, 30180, 30420, 30660, 30960, 31200, 31440, 31740, 31980, 32220, 32520, 32760,
                    33000, 33300, 33540, 33960, 34320, 34680, 35040, 35400, 35760, 36120, 36480, 36840, 37200, 37560,
                    37920, 38280, 38640, 39000, 39360, 39720, 40080, 40440, 40800, 41160, 41520, 41880, 42240, 42600,
                    42960, 43320, 43680, 44040, 44280, 44520, 44820, 45120, 45420, 45720, 46020, 46320, 46620, 46920,
                    47220, 47520, 47820, 48120, 48420, 48720, 49020, 49320, 49620, 49920, 50220, 50520, 50820, 51120,
                    51420, 51720, 52020, 52320, 52620, 52920, 53220, 53520, 53820, 54120, 54420, 54720, 55020, 55320,
                    55620, 55920, 56220, 56520, 56820, 57120, 57420, 57720, 58020, 58320, 58620, 58920, 59160, 59460,
                    59700, 59940, 60240, 60480, 60720, 61020, 61260, 61500, 61800, 62040, 62280, 62580, 62820, 63060,
                    63360, 63600, 63840, 64140, 64380, 64620, 64920, 65160, 65400, 65700, 65940, 66180, 66480, 66720,
                    66960, 67260, 67500, 67740, 68040, 68280, 68520, 68820, 69060, 69300, 69600, 69840, 70080, 70380,
                    70620, 70860, 71160, 71400, 71760, 72060, 72480, 72900, 73320, 73740, 74160, 74580, 75000, 75420,
                    75900, 76500, 77100, 77700, 78300, 78900, 79500, 80100, 80700, 81300, 81900, 82500, 83100, 83700,
                    84300, 84900, 85500, 86100);
        }

        Zaman.zaman(duz, ters, Main.girdi2, 90, 3);
    }
}