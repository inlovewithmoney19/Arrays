package LabArraysFirst;

import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNumbers= Integer.parseInt(scanner.nextLine());
        int[] numbersArr= new int[numOfNumbers];

        for (int i = 0; i <numOfNumbers ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
             numbersArr[i] = currentNum ;
        }
        for (int i = numbersArr.length - 1 ; i >= 0 ; i--) {
            System.out.printf("%d ",numbersArr[i]);

        }
    }
}
