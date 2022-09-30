package LabArraysFirst;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumberArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondNumberArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int diffIndex = 0;
        boolean isDifferent = false;
        for (int i = 0; i < firstNumberArr.length; i++) {

            int firstNum = firstNumberArr[i];
            int secondNum = secondNumberArr[i];
            if (firstNum == secondNum){
                sum +=firstNum;
            }else {
                isDifferent = true;
                diffIndex = i;
                break;
            }
        }

        if (!isDifferent){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
        }
    }
}
