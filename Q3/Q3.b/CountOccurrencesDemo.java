package Strings;
import java.util.Scanner;

public class CountOccurrencesDemo {

    static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String main = sc.nextLine();

        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        System.out.println("Occurrences = " + countOccurrences(main, sub));
    }
}