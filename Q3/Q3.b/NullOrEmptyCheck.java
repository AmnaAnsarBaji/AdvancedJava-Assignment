package Strings;

import java.util.Scanner;

public class NullOrEmptyCheck {

    // User defined function
    static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("String is null or contains only whitespace.");
        } else {
            System.out.println("Valid String: " + input);
        }

        sc.close();
    }
}