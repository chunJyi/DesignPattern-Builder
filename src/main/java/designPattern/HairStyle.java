package main.java.designPattern;

public enum HairStyle {

    BALD("bald"),
    SHORT("short"),
    LONG("long");

   private final String title;

    HairStyle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "HairStyle{" +
                "title='" + title + '\'' +
                '}';
    }
}
