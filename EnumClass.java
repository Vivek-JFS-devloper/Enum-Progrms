package com.Enum;

public class EnumClass {

    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Descriptions " + today.getDescription());

        for (Day day : Day.values()) {
            System.err.println(day.getDescription());
            // System.err.println("Index " + Day.valueOf("SUNDAY").ordinal());
        }
        System.out.println("Name " + Day.valueOf("SUNDAY").getDescription().intern());
    }

}

enum Day {
    MONDAY("Start of work week"),
    FRIDAY("Almost weekend"),
    SUNDAY("Holiday");

    private String description;

    private Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
