import java.util.Scanner;
import java.util.HashSet;

public class L1551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        for (int i = 0; i < N; i++) {
            String sentence = scanner.nextLine();
            System.out.println(categorizeSentence(sentence));
        }

        scanner.close();
    }

    private static String categorizeSentence(String sentence) {
        HashSet<Character> uniqueLetters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                uniqueLetters.add(c);
            }
        }

        int uniqueCount = uniqueLetters.size();

        if (uniqueCount == 26) {
            return "frase completa";
        } else if (uniqueCount >= 13) {
            return "frase quase completa";
        } else {
            return "frase mal elaborada";
        }
    }
}
