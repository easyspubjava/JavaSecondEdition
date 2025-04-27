package utils;

public enum GradeType {

    ABTYPE(0), SABTYPE(1);

    private int value;

    GradeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
