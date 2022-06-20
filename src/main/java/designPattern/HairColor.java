package main.java.designPattern;

public enum HairColor {
    WHITE,
    BLACK,
    RED,
    BROWN,
    YELLOW;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
