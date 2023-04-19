import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[]arr1 = new int[n];
        int count = 0;
        for(int i=n-1;i>=0;i--){
            arr1[count++] = arr[i];
        }

        for(int k:arr1){
            System.out.print(k+" ");
        }
    }
}
