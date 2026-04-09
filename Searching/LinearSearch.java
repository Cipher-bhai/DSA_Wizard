package Searching;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] =new int[10];
        System.out.println("Enter numbers :"); 
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter target number you want to search?");
        int target=sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(target==num[i]){
                System.out.print("Number found at location"+ i);
            }
            else{
                System.out.println("Number not found in the array");
            }
    }
    sc.close();
}
}
