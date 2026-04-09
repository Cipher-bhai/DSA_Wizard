package Number_System;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to find factorial.");
        int n = sc.nextInt();
        int fact = 1;
        if (n < 0) {
            System.out.println("Factorial does not exist with negative number");
        } else if (n == 0) {
            System.out.println("Factorial of 0 and 1 is 1.");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of number is " + fact);
        }
        sc.close();
    }
}
