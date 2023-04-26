import java.util.Arrays;
import java.util.Scanner;

public class kthSmalletEleArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ele = kthSmallest(arr,k);
        System.out.println(ele);
    }
    public static int kthSmallest(int[] arr,int k)
    {
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
