package LabArraysFirst;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int odd = 0;
        int even = 0;
        for (int symbol : numbersArr){
            if (symbol % 2 == 0){
                odd += symbol;
            }else {
                even += symbol;
            }
        }
        System.out.printf("%d", odd - even);
    }
}
