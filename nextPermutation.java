import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class nextPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        String[] a = in.readLine().trim().split("\\s+");
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
       List<Integer> ans;
        ans = NextPermutation(N,arr);
        StringBuilder out = new StringBuilder();
        for(int i=0;i<N;i++){
            out.append(ans.get(i)).append(" ");
        }
        System.out.println(out);
    }
    static List<Integer> NextPermutation(int N, int[] arr){
        // code here
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<N;i++){
            a.add(arr[i]);
        }
        int s = a.size();

        int index = -1;

        for(int i=s-2;i>=0;i--){
            if(a.get(i)<a.get(i+1)){
                index = i;
                break;
            }

        }

        if(index ==-1){
            Collections.reverse(a);
            return a;
        }

        for(int i=s-1;i>index;i--){
            if(a.get(i)>a.get(index)){
                int temp = a.get(i);
                a.set(i,a.get(index));
                a.set(index,temp);
                break;
            }
        }

        List<Integer> sublist = a.subList(index+1,s);
        Collections.reverse(sublist);
        return a;
    }
}
