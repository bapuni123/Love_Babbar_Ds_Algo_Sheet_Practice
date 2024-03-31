import java.util.Scanner;

public class stringBits {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.next();
        String output = stringRes(s);
        System.out.println(output);

    }

    public static String stringRes(String str){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i=i+2){
           res.append(str.charAt(i));
        }

        return res.toString();
    }
}
