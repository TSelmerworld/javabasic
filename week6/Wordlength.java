package hello;
import java.util.Scanner;

public class Wordlength {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String word = in.next();

            if (word.equals(".")) {
                break;
            }

            System.out.print(word.length() + " ");
        }
    }
}
