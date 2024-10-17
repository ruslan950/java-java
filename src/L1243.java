import java.util.Scanner;

public class L1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            System.out.println(classifyDifficulty(line));
        }

        scanner.close();
    }

    private static int classifyDifficulty(String line) {
        String[] words = line.split("\\s+");
        int totalLength = 0;
        int wordCount = 0;

        for (String word : words) {
            if (isValidWord(word)) {
                if (word.endsWith(".")) {
                    word = word.substring(0, word.length() - 1);
                }
                totalLength += word.length();
                wordCount++;
            }
        }

        int averageLength = (wordCount == 0) ? 0 : totalLength / wordCount;

        if (averageLength <= 3) {
            return 250;
        } else if (averageLength >= 4 && averageLength <= 5) {
            return 500;
        } else {
            return 1000;
        }
    }

    private static boolean isValidWord(String word) {
        if (word.isEmpty()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isLetter(c) && !(i == word.length() - 1 && c == '.')) {
                return false;
            }
        }
        return true;
    }
}
