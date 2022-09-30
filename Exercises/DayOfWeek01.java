package LabArraysFirst;

import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeekArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"} ;

        int currentDay = Integer.parseInt(scanner.nextLine());

        if (currentDay >=1 && currentDay <=7){
            System.out.println(daysOfWeekArr[currentDay - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
