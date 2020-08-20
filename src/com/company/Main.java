package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {37.1, 26.378, -54.232, 89.7, -55.65, -9.36, -12.9, 18.3, 32.7, 51.5, -47.965, -83.96, 15.5, 1.269, 62.4};
        double total = 0;
        boolean numbersAverage = false;
        double result;
        int numbersAmount = 0;
        for (double j : numbers) {
            if (j < 0) {
                numbersAverage = true;
            }
            if (numbersAverage) {
                if (j > 0) {
                    total += j;
                    numbersAmount++;
                }
            }
        }

        result = total / numbersAmount;
        System.out.println(result);


        for (int i = 0; i < numbers.length; i++) {
            double sortingMassive = numbers[i];
            int j = i - 1;
            while (j >= 0 && sortingMassive < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = sortingMassive;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
