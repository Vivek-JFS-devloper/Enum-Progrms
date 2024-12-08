package com.Enum;

public class EnumRepretantion {

    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        System.out.println("Day " + day);
        System.out.println("Day.values() " + Day.values().toString());
        System.out.println("Day.valueof('Friday') " + Day.valueOf("SUNDAY"));
        System.out.println("Day.Valueof('SUMDAY).ordinal() " + Day.valueOf("SUNDAY").ordinal());

    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
