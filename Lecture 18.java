package arrays;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        // Input the size
        int n = sc.nextInt();
        // create the array
        int arr[] = new int[n]; // Corrected from Int to int

        // Take the elements as input
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Corrected from sc.close to sc.close()
    }
}
