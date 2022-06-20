package main.java.designPattern;

public enum Armor {

    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain_mail"),
    PLATE_MAIL("plate_mail");

    private final String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "title='" + title + '\'' +
                '}';
    }
}
