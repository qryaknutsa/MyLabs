package story;

import java.util.Scanner;

public class Main {

    static void checkOfCondition() throws WeatherException {
        int weather, time;
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Выбирите погоду (1 - солнце, 2 - дождь, 3 - туман, 4 - сильный ветер, 5 - немного облачно): ");
        weather = in.nextInt();
        System.out.print("Введите время в точности до часа: ");
        time = in.nextInt();
        if (weather != 1 & weather != 5) {
            throw new WeatherException("Погода не подходит для прогулок по крышам. ");
        }
        if (time > 18 | time < 9) {
            throw new TimeException("Родители дома, поэтому нельзя погулять по крышам.");
        }

    }

    public static void main(String[] args) throws WeatherException {
        Main main = new Main();
        try {
            checkOfCondition();
        } catch (TimeException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (WeatherException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println(" ");
        Kid m = new Kid("Малыш", 1, 1.5f, false);
        FlyingMan k = new FlyingMan("Карлсон", 2, Varenie.MALINA, false);
        m.emergence();
        k.emergence();

        System.out.println(" ");
        for (int i = 0; i < Noise.values().length; i++) {
            Buildings b = new Buildings();
            final Noise noise = Noise.getNoise(i);
            Buildings.Windows w = b.new Windows(" собака лает");
            Noisable n = new Noisable() {
                @Override
                public String makeNoise(Buildings.Windows windows, Noise noise, Integer t) {
                    return windows + " " + t.toString() + noise.getRussianNoise() + ", издаёт шум.";
                }
            };
            System.out.println(n.makeNoise(w, noise, i + 1));
        }
        System.out.println(" ");

        final Varenie varenie = Varenie.getRandomVarenie();
        Kid.offerJam(varenie, m, k);

        System.out.println(" ");


        Buildings[] b = new Buildings[10];
        for (int i = 0; i < 5; i++) {
            b[i] = new Buildings();
            b[i].generateLengthOfHole();
            b[i].generateLengthOfRoof();
            k.move(k, b[i].getLengthRoof());

            m.move(m, b[i].getLengthRoof());


            if (m.falling(m, b[i].getLengthHole())) {
                k.saving(k, m);
                break;
            } else m.move(m, b[i].getLengthRoof());
        }
    }
}
