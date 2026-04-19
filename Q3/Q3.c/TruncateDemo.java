package Strings;
import java.util.Scanner;

public class TruncateDemo {

    static String truncate(String str, int length) {
        if (str.length() <= length)
            return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter length:");
        int n = sc.nextInt();

        System.out.println("Output = " + truncate(str, n));
    }
}