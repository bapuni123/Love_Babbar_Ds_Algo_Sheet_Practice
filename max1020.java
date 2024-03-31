import java.sql.SQLOutput;
import java.util.Scanner;

public class max1020 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int returnValue = maxValue(a,b);
        System.out.println(returnValue);
        
    }
    public static int maxValue(int a, int b) {

        int max = 0,min = 0;
        if(a>b){
            max =a;
            min =b;
        }
        if(b>a){
            max =b;
            min = a;
        }

        if(max>=10 && max<=20){
            return max;
        }

        if(min>=10 && min<=20){
            return min;
        }

        return 0;
    }

}
