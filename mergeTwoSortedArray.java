import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr1 = new int[m];
        int [] arr2 = new int[n];
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        mergeArray(arr1,arr2,m,n);
        System.out.println("after merge sort");
        for(int i=0;i<m;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static void mergeArray(int[] arr1, int [] arr2,int m, int n){
        int k;
        for(int i=0;i<m;i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }


            int first = arr2[0];
            for (k = 1; k < n && arr2[k] < first; k++) {
                arr2[k - 1] = arr2[k];
            }

            arr2[k - 1] = first;
        }

    }
}
