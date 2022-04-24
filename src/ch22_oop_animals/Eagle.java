package ch22_oop_animals;

public class Eagle extends Bird {
    private int clawsLength;

    public Eagle(String name, int wingspan, int clawsLength) {
        super(name, wingspan, true);
        this.clawsLength = clawsLength;
    }

    public int getClawsLength() {
        return clawsLength;
    }

    public void setClawsLength(int clawsLength) {
        this.clawsLength = clawsLength;
    }
}
