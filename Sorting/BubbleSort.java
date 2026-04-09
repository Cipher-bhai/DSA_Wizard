package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter numbers in the array");

        // Loop for input elements in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements before sorted elements are:");
        // Loop for the print the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // Loop for the Sorting the elements in the Ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements after sorting :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
