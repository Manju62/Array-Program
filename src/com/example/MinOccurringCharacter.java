package com.example;

public class MinOccurringCharacter {
    public static void main(String[] args) {
        String str = "manjjjjuaa";

        int[] arr = new int[127];

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        int minOccurrence = Integer.MAX_VALUE;
        char minChar = ' ';

        // Find the character with the minimum occurrence
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] != 0 && arr[str.charAt(i)] < minOccurrence) {
                minOccurrence = arr[str.charAt(i)];
                minChar = str.charAt(i);
            }
        }

        System.out.println("Character with minimum occurrence: " + minChar);
    }
}

