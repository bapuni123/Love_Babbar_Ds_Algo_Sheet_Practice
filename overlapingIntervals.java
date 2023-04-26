import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class overlapingIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().trim().split(" ");
        int[][] Intervals = new int[n][2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            Intervals[i][0] = Integer.parseInt(s[j]);
            j++;
            Intervals[i][1] = Integer.parseInt(s[j]);
            j++;
        }
        int[][] ans = overlappedInterval(Intervals);
        for (int[] an : ans) {
            for (j = 0; j < an.length; j++) {
                System.out.print(an[j] + " ");
            }
        }
        System.out.println();
    }

    public static int[][] overlappedInterval(int[][] Intervals) {
        // Code here
        Arrays.sort(Intervals, Comparator.comparingInt(a -> a[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(Intervals[0]);

        for (int i = 1; i < Intervals.length; i++) {

            int startPoint2 = Intervals[i][0];
            int endPoint2 = Intervals[i][1];

            int[] poparray = stack.pop();
            int startPoint1 = poparray[0];
            int endPoint1 = poparray[1];

            int endMax = Math.max(endPoint1, endPoint2);

            if (endPoint1 >= startPoint2) {

                int[] merge = new int[]{startPoint1, endMax};
                stack.add(merge);

            } else {
                stack.add(poparray);
                stack.add(Intervals[i]);
            }
        }

        int[][] output = new int[stack.size()][2];
        for (int i = output.length - 1; i >= 0; i--) {
            int[] poparray = stack.pop();
            output[i][0] = poparray[0];
            output[i][1] = poparray[1];
        }

        return output;
    }
}



