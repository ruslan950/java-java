import java.util.Scanner;

public class L1332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            System.out.println(identifyNumber(word));
        }

        scanner.close();
    }

    private static int identifyNumber(String word) {
        if (isSimilar(word, "one")) return 1;
        if (isSimilar(word, "two")) return 2;
        if (isSimilar(word, "three")) return 3;
        return -1; // This line should theoretically never be reached
    }

    private static boolean isSimilar(String word, String target) {
        if (word.length() != target.length()) return false;

        int countDifferences = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                countDifferences++;
                if (countDifferences > 1) return false;
            }
        }
        return true;
    }
}
