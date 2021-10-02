package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 2;
        numbers[1] = 69;
        numbers[2] = -69;
        numbers[3] = 420;
        numbers[4] = 14;
        numbers[5] = 20;
        numbers[6] = 230;
        numbers[7] = 150;
        numbers[8] = 45;
        numbers[9] = 8;

        System.out.println("Before Bubble");
        printArrayElements(numbers);

        System.out.println("Before Selection");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter Bubble");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter Selection");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }


    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}