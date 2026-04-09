package Number_System;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        // 1.Logical AND operation
        int and = x & y;
        System.out.println("Bitwise AND result=" + and);

        // 2.Logical OR operation

        int or = x | y;
        System.out.println("Bitwise OR result=" + or);

        // 3.Logical NOT operation
        int not = ~x;
        System.out.println("Bitwise NOT result=" + not);

        // 4.Leftshift operation
        int Leftshift = x << 2;
        System.out.println("Leftshift Result=" + Leftshift);

        int Rightshift = y >> 2;
        System.out.println("Rightshift Result=" + Rightshift);

        // 5.Logical XOR Operation
        int xor = x ^ y;
        System.out.println("XOR operation Result=" + xor);

        sc.close();

    }
}
