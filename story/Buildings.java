package story;

import java.util.Objects;

public class Buildings {
    private int lengthOfRoof;
    private float lengthOfHole;

    public void generateLengthOfRoof() {
        lengthOfRoof = (int) (Math.random() * ((4 - 2) + 1)) + 2;
        this.lengthOfRoof = lengthOfRoof;
    }

    public void generateLengthOfHole() {
        lengthOfHole = (float) (Math.random() * ((2 - 1) + 1)) + 1;
        this.lengthOfHole = lengthOfHole;
    }

    public int getLengthRoof() {
        return lengthOfRoof;
    }

    public float getLengthHole() {
        return lengthOfHole;
    }

    @Override
    public boolean equals(Object b) {
        if (this == b) {
            return true;
        } else if (((Buildings) b) != null && ((Buildings) b).getLengthRoof() == this.getLengthRoof()) {
            Buildings c = (Buildings) b;
            return Objects.equals(this.getLengthHole(), ((Buildings) b).getLengthHole()) && Objects.equals(this.getLengthRoof(), ((Buildings) b).getLengthRoof());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.getLengthRoof(), this.getLengthHole()});
    }


    public class Windows {
        String s;

        Windows(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "В окне под номером";
        }
    }
}

