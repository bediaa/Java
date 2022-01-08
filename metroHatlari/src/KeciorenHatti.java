import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class KeciorenHatti extends BaseHat {

    public KeciorenHatti(String durakAdi, boolean kesisimNoktasiMi) {
        super(durakAdi, kesisimNoktasiMi);
    }

    public static ArrayList<KeciorenHatti> kecioren() {
        ArrayList<KeciorenHatti> keciorenDuraklari = new ArrayList<>();

        keciorenDuraklari.add(new KeciorenHatti("Şehitler", false));
        keciorenDuraklari.add(new KeciorenHatti("Dutluk", false));
        keciorenDuraklari.add(new KeciorenHatti("Kuyubaşı", false));
        keciorenDuraklari.add(new KeciorenHatti("Mecidiye", false));
        keciorenDuraklari.add(new KeciorenHatti("Belediye", false));
        keciorenDuraklari.add(new KeciorenHatti("Meteoroloji", false));
        keciorenDuraklari.add(new KeciorenHatti("Dışkapı", false));
        keciorenDuraklari.add(new KeciorenHatti("ASKİ", false));
        keciorenDuraklari.add(new KeciorenHatti("AKM", true));

        return keciorenDuraklari;
    }

    public static void saatler() {
        Calendar calendar = Calendar.getInstance();
        int gun = calendar.get(Calendar.DAY_OF_WEEK);

        ArrayList<Integer> duz = new ArrayList<>();
        ArrayList<Integer> ters = new ArrayList<>();

        if (gun == 1) {
            Collections.addAll(duz, 0, 720, 1440, 2160, 3000, 21600, 22140, 22680, 23220, 23760, 24300, 24840,
                    25380, 25920, 26460, 27000, 27540, 28080, 28620, 29160, 29700, 30240, 30780, 31320, 31860, 32400,
                    32940, 33480, 34020, 34560, 35100, 35640, 36180, 36720, 37260, 37800, 38340, 38880, 39420, 39960,
                    40500, 41040, 41580, 42120, 42660, 43200, 43740, 44280, 44820, 45360, 45900, 46440, 46980, 47520,
                    48060, 48600, 49140, 49680, 50220, 50760, 51300, 51840, 52380, 52920, 53460, 54000, 54540, 55080,
                    55620, 56160, 56700, 57240, 57780, 58320, 58860, 59400, 59940, 60480, 61020, 61560, 62100, 62640,
                    63180, 63720, 64260, 64800, 65340, 65880, 66420, 66960, 67500, 68040, 68580, 69120, 69660, 70200,
                    70740, 71280, 71820, 72360, 72900, 73440, 73980, 74520, 75060, 75600, 76140, 76680, 77220, 77760,
                    78300, 78840, 79380, 79920, 80460, 81000, 81540, 82080, 82800, 83520, 84240, 84960, 85680);

            Collections.addAll(ters, 360, 1080, 1800, 2520, 3360, 4500, 21600, 22140, 22680, 23220, 23760,
                    24300, 24840, 25380, 25920, 26460, 27000, 27540, 28080, 28620, 29160, 29700, 30240, 30780, 31320,
                    31860, 32400, 32940, 33480, 34020, 34560, 35100, 35640, 36180, 36720, 37260, 37800, 38340, 38880,
                    39420, 39960, 40500, 41040, 41580, 42120, 42660, 43200, 43740, 44280, 44820, 45360, 45900, 46440,
                    46980, 47520, 48060, 48600, 49140, 49680, 50220, 50760, 51300, 51840, 52380, 52920, 53460, 54000,
                    54540, 55080, 55620, 56160, 56700, 57240, 57780, 58320, 58860, 59400, 59940, 60480, 61020, 61560,
                    62100, 62640, 63180, 63720, 64260, 64800, 65340, 65880, 66420, 66960, 67500, 68040, 68580, 69120,
                    69660, 70200, 70740, 71280, 71820, 72360, 72900, 73440, 73980, 74520, 75060, 75600, 76140, 76680,
                    77220, 77760, 78300, 78840, 79380, 79920, 80460, 81000, 81540, 82080, 82620, 83160, 83880, 84600,
                    85320, 86040);

        } else if (gun == 7) {
            Collections.addAll(duz, 0, 720, 1440, 2160, 3000, 21600, 22140, 22680, 23220, 23760, 24300, 24840,
                    25380, 25920, 26460, 27000, 27540, 28080, 28620, 29160, 29700, 30240, 30780, 31320, 31860, 32400,
                    32940, 33480, 34020, 34560, 35100, 35640, 36180, 36720, 37260, 37800, 38340, 38880, 39420, 39960,
                    40500, 41040, 41580, 42120, 42660, 43200, 43740, 44280, 44820, 45360, 45900, 46440, 46980, 47520,
                    48060, 48600, 49140, 49680, 50220, 50760, 51300, 51840, 52380, 52920, 53460, 54000, 54540, 55080,
                    55620, 56160, 56700, 57240, 57780, 58320, 58860, 59400, 59940, 60480, 61020, 61560, 62100, 62640,
                    63180, 63720, 64260, 64800, 65340, 65880, 66420, 66960, 67500, 68040, 68580, 69120, 69660, 70200,
                    70740, 71280, 71820, 72360, 72900, 73440, 73980, 74520, 75060, 75600, 76140, 76680, 77220, 77760,
                    78300, 78840, 79380, 79920, 80460, 81000, 81540, 82080, 82800, 83520, 84240, 84960, 85680);

            Collections.addAll(ters, 360, 1080, 1800, 2520, 3360, 4500, 21600, 22140, 22680, 23220, 23760,
                    24300, 24840, 25380, 25920, 26460, 27000, 27540, 28080, 28620, 29160, 29700, 30240, 30780, 31320,
                    31860, 32400, 32940, 33480, 34020, 34560, 35100, 35640, 36180, 36720, 37260, 37800, 38340, 38880,
                    39420, 39960, 40500, 41040, 41580, 42120, 42660, 43200, 43740, 44280, 44820, 45360, 45900, 46440,
                    46980, 47520, 48060, 48600, 49140, 49680, 50220, 50760, 51300, 51840, 52380, 52920, 53460, 54000,
                    54540, 55080, 55620, 56160, 56700, 57240, 57780, 58320, 58860, 59400, 59940, 60480, 61020, 61560,
                    62100, 62640, 63180, 63720, 64260, 64800, 65340, 65880, 66420, 66960, 67500, 68040, 68580, 69120,
                    69660, 70200, 70740, 71280, 71820, 72360, 72900, 73440, 73980, 74520, 75060, 75600, 76140, 76680,
                    77220, 77760, 78300, 78840, 79380, 79920, 80460, 81000, 81540, 82080, 82620, 83160, 83880, 84600,
                    85320, 86040);

        } else {
            Collections.addAll(duz, 0, 720, 1440, 2160, 3000, 21600, 22140, 22680, 23220, 23760, 24120, 24480,
                    24840, 25200, 25560, 25920, 26280, 26640, 27000, 27360, 27720, 28080, 28440, 28800, 29160, 29520,
                    29880, 30240, 30600, 30960, 31320, 31680, 32040, 32400, 32940, 33480, 34020, 34560, 35100, 35640,
                    36180, 36720, 37260, 37800, 38340, 38880, 39420, 39960, 40500, 41040, 41580, 42120, 42660, 43200,
                    43740, 44280, 44820, 45360, 45900, 46440, 46980, 47520, 48060, 48600, 49140, 49680, 50220, 50760,
                    51300, 51840, 52380, 52920, 53460, 54000, 54540, 54900, 55260, 55620, 55980, 56340, 56700, 57060,
                    57420, 57780, 58140, 58500, 58860, 59220, 59580, 59940, 60300, 60660, 61020, 61380, 61740, 62100,
                    62460, 62820, 63180, 63540, 63900, 64260, 64620, 64980, 65340, 65700, 66060, 66420, 66780, 67140,
                    67500, 67860, 68220, 68580, 68940, 69300, 69660, 70200, 70740, 71280, 71820, 72360, 72900, 73440,
                    73980, 74520, 75060, 75600, 76140, 76680, 77220, 77760, 78300, 78840, 79380, 79920, 80460, 81000,
                    81540, 82080, 82800, 83520, 84240, 84960, 85680);

            Collections.addAll(ters, 360, 1080, 1800, 2520, 3360, 4500, 21600, 22140, 22680, 23220, 23760,
                    24300, 24840, 25200, 25560, 25920, 26280, 26640, 27000, 27360, 27720, 28080, 28440, 28800, 29160,
                    29520, 29880, 30240, 30600, 30960, 31320, 31680, 32040, 32400, 32940, 33480, 34020, 34560, 35100,
                    35640, 36180, 36720, 37260, 37800, 38340, 38880, 39420, 39960, 40500, 41040, 41580, 42120, 42660,
                    43200, 43740, 44280, 44820, 45360, 45900, 46440, 46980, 47520, 48060, 48600, 49140, 49680, 50220,
                    50760, 51300, 51840, 52380, 52920, 53460, 54000, 54540, 55080, 55620, 55980, 56340, 56700, 57060,
                    57420, 57780, 58140, 58500, 58860, 59220, 59580, 59940, 60300, 60660, 61020, 61380, 61740, 62100,
                    62460, 62820, 63180, 63540, 63900, 64260, 64620, 64980, 65340, 65700, 66060, 66420, 66780, 67140,
                    67500, 67860, 68220, 68580, 68940, 69300, 69660, 70200, 70740, 71280, 71820, 72360, 72900, 73440,
                    73980, 74520, 75060, 75600, 76140, 76680, 77220, 77760, 78300, 78840, 79380, 79920, 80460, 81000,
                    81540, 82080, 82620, 83160, 83880, 84600, 85320, 86040);
        }

        Zaman.zaman(duz, ters, Main.girdi2, 94, 2);
    }
}