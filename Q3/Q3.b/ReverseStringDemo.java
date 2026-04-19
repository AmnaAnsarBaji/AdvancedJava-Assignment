package Strings;
import java.util.Scanner;

public class ReverseStringDemo {

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Reversed String = " + reverseString(str));
    }
}