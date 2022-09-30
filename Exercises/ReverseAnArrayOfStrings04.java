package LabArraysFirst;

import java.util.Scanner;

public class ReverseAnArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2 ; i++) {
            String currentSymbol = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i ];
            inputArr[inputArr.length -1 - i]  = currentSymbol;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
