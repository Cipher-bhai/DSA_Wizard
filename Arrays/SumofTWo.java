public class SumofTWo {
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5,5};
        int arr2[]={6,8,9,10,4,6};
        int sum[]= new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }

        System.out.println("Sum of Arrays:");

        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+ " " );
        }

  }
}
