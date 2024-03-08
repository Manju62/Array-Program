package com.example;
public class MaxOccurringValue {
    public static void main(String[] args) {
        int[] array = {4,7, 7, 2, 7, 4, 9, 2, 7, 4};

        // Find the maximum occurring value in the array
        int maxCount = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        // Print the result
        System.out.println("Value " + maxValue + " occurs " + maxCount + " times.");
    }
}
