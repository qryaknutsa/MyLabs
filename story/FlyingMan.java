package story;

import java.sql.SQLOutput;

class FlyingMan extends Creature implements WayOfMoving {
    private Varenie favourite;

    public FlyingMan(String name, int speed, Varenie favourite, boolean energy) {
        super(name, speed, energy);
        this.favourite = favourite;
    }

    public Varenie getFavourite() {
        return this.favourite;
    }

    public void emergence() {
        System.out.println("Появился летающий человек, " + this.getName());
    }

    public static void takeJam(Creature offered, Varenie var) {
        if (offered.getFavourite().equals(var)) {
            System.out.println(offered.getName() + " сказал: 'ДА!!!'");
            offered.setEnergy(true);
            System.out.println(offered.getName() + " набирается сил для полёта");
        } else {
            System.out.println(offered.getName() + " сказал: 'Нет! Я люблю только " + offered.getFavourite().getRussianVarenie() + "!'");
            offered.setEnergy(false);
            System.out.println(offered.getName() + "у не хватает сил для полёта");
        }
    }


    @Override
    public void move(Creature man, int z) {
        if (man.getEnergy()) {
            System.out.println(this.getName() + " летит вдоль крыши");
            while (z > 0) {
                z -= this.getSpeed();
                switch (z) {
                    case (1):
                        System.out.println("Ему осталось долететь " + z + " метр");
                        break;
                    case (2):
                        System.out.println("Ему осталось долететь " + z + " метра");
                        break;
                    case (3):
                        System.out.println("Ему осталось долететь " + z + " метра");
                        break;
                }
            }
            System.out.println(this.getName() + " долетел до края крыши");
        } else {
            System.out.println(man.getName() + " остался на месте");
        }
    }


    public static void saving(FlyingMan saving, Kid saved) {
        if (saving.getEnergy()) {
            System.out.println(saving.getName() + " спасает " + saved.getName() + "а");
            saving.laugh(saving);
            saving.encouraging(saving, saved);
            System.out.println("Happy End.");
        } else if (!saving.getEnergy()) {
            System.out.println(saving.getName() + " не полетел, поэтому он не смог спасти " + saved.getName() + "а");
            saved.death(saved);
            saving.breakdown(saving);
            System.out.println("Sad End.");
        }
    }
}