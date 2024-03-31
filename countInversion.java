import java.util.Scanner;

public class countInversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n];
        for(long i=0;i<n;i++){
            arr[(int)i] = sc.nextLong();
        }
        System.out.println(inversionCount(arr,n));
    }
    static long inversionCount(long[] arr, long N) {
        // Your Code Here
        int lo = 0;
        int hi =(int)(N-1);
       return merge(arr, lo,hi);
    }

    public static long merge(long[] a, int lo, int hi){
        long count = 0;
        if(lo<hi){
            int mid = (lo+hi)/2;
            count+=merge(a,lo,mid);
            count+=merge(a,mid+1,hi);
            count+=merged2SortedArray(a,lo,mid,hi);
        }

        return count;
    }

    private static long merged2SortedArray(long[] a,int low, int mid,int high) {
        int n = mid-low+1;
        int m = high-mid;
        long[] left = new long[n];
        long[] right = new long[m];
        for(int i=0;i<n;i++){
            left[i] = a[low+i];
        }

        for(int j=0;j<m;j++){
            right[j] = a[mid+1+j];
        }

        int i=0,j=0, k = low;
        long count = 0;
        while(i<n && j<m){
            if(left[i]<=right[j]){
                a[low++] = left[i++];
            }else{
                a[low++] = right[j++];
                count+=n-i;
            }
        }
        while(i<n){
            a[low++] = left[i++];
        }

        while(j<m){
            a[low++] = right[j++];
        }

        return count;

    }
}
