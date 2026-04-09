package Number_System;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number ");
        int n = sc.nextInt();
        int original = n;
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            num = num + rem * rem * rem;
            n = n / 10;
        }
        if (original == num) {
            System.out.println("Number is a Armstrong");
        } else {
            System.out.println("Number is not a Armstrong");
        }
        sc.close();
    }
}
