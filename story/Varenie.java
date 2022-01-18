package story;

public enum Varenie {
    MALINA("малиновое"),
    CHERNIKA("черничное"),
    KLUBNIKA("клубничное"),
    BRUSNIKA("брусничное");

    private final String Russian;

    Varenie(String Russian) {
        this.Russian = Russian;
    }

    public String getRussianVarenie() {
        return Russian;
    }

    public static Varenie getRandomVarenie() {
        double v = Math.random() * Varenie.values().length;
        return Varenie.values()[(int) v];
    }
}
