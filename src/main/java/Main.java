import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        SentenceConverter converter = new SentenceConverter();
        System.out.println(converter.reverseWords(length));
    }
}