package Strings;
import java.util.Scanner;

public class WordCountDemo {

    static int countWords(String str) {
        if (str.trim().isEmpty())
            return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Word Count = " + countWords(str));
    }
}