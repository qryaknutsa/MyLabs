package story;

import java.util.Objects;

abstract class Creature {
    private String name;
    private int speed;
    private boolean energy;
    private Varenie favourite;
    private float height;


    Creature(String name, int speed, boolean energy) {
        this.name = name;
        this.speed = speed;
        this.energy = energy;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getEnergy() {
        return this.energy;
    }

    public void setEnergy(boolean energy) {
        this.energy = energy;
    }

    public Varenie getFavourite() {
        return this.favourite;
    }

    public float getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Имя песронажа:" + this.getName() + ". Скорость:" + this.getSpeed();
    }

    public static void laugh(Creature obj) {
        System.out.println(obj.getName() + " смеётся");
    }

    abstract void emergence();

    public static void encouraging(Creature encouraging, Creature encouraged) {
        System.out.println(encouraging.getName() + " подбадривает " + encouraged.getName() + "a");
    }

    public static void breakdown(Creature c) {
        System.out.println(c.getName() + " очень грустит");
    }

    public static void death(Creature c) {
        System.out.println(c.getName() + " разбился");
    }


}
