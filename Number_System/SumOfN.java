package Number_System;
import java.util.Scanner;
public class SumOfN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want to sum?");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of number "+sum);
        sc.close();
    }
}
