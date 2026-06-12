import java.util.Scanner;
public class LargestNumber {
    public static int largest(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int arry[]=new int[5];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<arry.length;i++){
            arry[i]=sc.nextInt();
        }
        System.out.println(largest(arry));
    }
}
