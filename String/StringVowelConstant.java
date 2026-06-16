
// This program is to focused to count vowel and constant in the entered string that will show how many 

package String;

import java.util.Scanner;

public class StringVowelConstant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {

                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total vowels = " + vowelCount);
        System.out.println("Total consonants = " + consonantCount);

        sc.close();
    }
}