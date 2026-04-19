package Strings;
import java.util.Scanner;

public class CapitalizeWordsDemo {

    static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0))
                        + word.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Output = " + capitalizeWords(str));
    }
}