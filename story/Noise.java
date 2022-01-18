package story;

public enum Noise {
    DOG(" собака лает", 2),
    PEOPLE(" люди тихо разговаривают", 3),
    LAUGH(" ребёнок смеётся", 4),
    CRY(" ребёнок плачет", 5),
    DISHES(" кто-то звякает посудой, моя её", 6),
    PIANO(" кто-то бренчит на пианино", 7);

    private final String Russian;
    int i = 1;

    Noise(String Russian, int i) {
        this.Russian = Russian;
        this.i = i;
    }

    public String getRussianNoise() {
        return Russian;
    }

    public static Noise getNoise(int i) {
        return Noise.values()[i];
    }
}
