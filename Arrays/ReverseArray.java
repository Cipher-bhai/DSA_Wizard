public class ReverseArray {
    public static void reverseArray(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[]args){
        int arry[]={2,5,6,8,9};
     reverseArray(arry);
    }
}
