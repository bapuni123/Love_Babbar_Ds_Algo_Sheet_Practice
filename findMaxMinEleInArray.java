import java.util.Scanner;

public class findMaxMinEleInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findMaximumAndMinimum(arr,n);
    }

    public static void findMaximumAndMinimum(long[] arr, long n){
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for(int i =0;i<n;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.print("max: "+ max + " min: "+ min);
    }
}
