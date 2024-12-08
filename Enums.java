package com.Enum;

import java.util.EmptyStackException;

public class Enums {

    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.err.println("Today is Tuesday!");
                break;
            case WEDNESDAY:
                System.err.println("Today is Wednesday!");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday!");
            case FRIDAY:
                System.out.println("Today is Friday!");
                break;
            case SUNDAY:
                System.err.println("Today is Suday");
                break;
            default:
                throw new EmptyStackException();

        }
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}
