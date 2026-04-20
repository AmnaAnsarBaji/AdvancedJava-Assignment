/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package Strings;
import java.util.Scanner;

public class NumericDemo {

    static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        if (isNumeric(str))
            System.out.println("Contains only numbers");
        else
            System.out.println("Not numeric");
    }
}
