package story;

class Kid extends Creature implements WayOfMoving, Checking {
    public Kid(String name, int speed, float height, boolean energy) {
        super(name, speed, energy);
    }

    public void emergence() {
        System.out.println("Появился ребёнок, " + this.getName());
    }

    public static void offerJam(Varenie varenie, Kid offering, FlyingMan offered) {
        System.out.println(offering.getName() + " спросил у " + offered.getName() + "а: 'Будешь " + varenie.getRussianVarenie() + " варенье?'");
        offered.takeJam(offered, varenie);
    }

    @Override
    public void move(Creature kid, int z) {
        System.out.println(this.getName() + " идёт по крыше");
        while (z > 0) {
            z -= this.getSpeed();
            switch (z) {
                case (1):
                    System.out.println("Ему осталось пройти " + z + " метр");
                    break;
                case (2):
                    System.out.println("Ему осталось пройти " + z + " метра");
                    break;
                case (3):
                    System.out.println("Ему осталось пройти " + z + " метра");
                    break;
            }
        }
        System.out.println(this.getName() + " дошёл до края крыши");
    }

    @Override
    public int checking(Creature obj) {
        int t = (int) (Math.random() * ((1 - 0) + 1)) + 0;
        switch (t) {
            case (1):
                obj.setEnergy(true);
                System.out.println(obj.getName() + " поел утром, поэтому у него есть силы для прыжка");
                return 1;
            case (0):
                obj.setEnergy(false);
                System.out.println(obj.getName() + " не поел утром, поэтому у него нет сил для прыжка");
                return 0;
        }
        return 123456789;
    }

    public int jump(float z, Kid kid) {
        System.out.println(this.getName() + " прыгает");
        if (z < kid.getHeight()) {
            System.out.println(this.getName() + " перепрыгнул");
            Kid.laugh(this);
            return 1;
        } else if (z > kid.getHeight()) {
            System.out.println(this.getName() + "не перепрыгнул");
            return 0;
        }
        return 1234567;
    }

    public static boolean falling(Kid kid, float z) {
        if (kid.checking(kid) == 0 || kid.jump(z, kid) == 0) {
            System.out.println(kid.getName() + " боится");
            System.out.println(kid.getName() + " падает");
        }
        return true;
    }

}
