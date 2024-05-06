package com.itschool.course;

public enum Season {
    SPRING("its green outside", 1),
    SUMMER("its hot", 2),
    AUTUMN("leafs are falling", 3),
    WINTER("its snowing", 4);

    private final String description;
    private final int number;

    Season(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }
}
