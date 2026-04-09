package Searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter numbers: ");
        for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }
        boolean found=false;
        int step=0;
        int low=0;
        int high=arr.length-1;
        System.out.println("Enter a number you want to search?");
        int target = sc.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            step++;
            if(target==arr[mid]){
                System.out.println("Elements found at  "+ mid);
                found=true;
                break;
            }else if(target<arr[mid]){
                   high=mid-1;
            }else{
              low=mid+1;
            }
        }
        if(found==false){
            System.out.println("Elements does not found in the array");
        }
        System.out.println("Number step to take to find the elements"+step);
        sc.close();
    }
}
