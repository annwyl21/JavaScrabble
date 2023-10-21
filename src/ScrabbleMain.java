import java.util.Scanner;

public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore scorer = new ScrabbleScore();
        System.out.println("Enter word or - to Quit:");
        Scanner scanner = new Scanner(System.in); // new instance of Scanner class
        String word = scanner.next();
        while (!word.equals("-")) {
            System.out.println(word + " Score: " + scorer.getScrabbleScore(word));
            System.out.println("Enter word or - to Quit:");
            word = scanner.next();

        }
    }
}
