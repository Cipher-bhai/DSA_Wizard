// Find the sum of elements in a given array.
import java.util.*;
public class SumN {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int arr[]={1,2,3,4,5,6};
    int sum=0;
    for(int i=0;i<arr.length;i++){
         sum=arr[i]+sum;
    }
    System.out.println("Sum="+sum);
}
}