import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while ((line = reader.readLine()) != null) {
            try {
                int N = Integer.parseInt(line.trim());
                for (int i = 0; i < N; i++) {
                    String inputLine = reader.readLine();
                    String encryptedLine = encryptLine(inputLine);
                    System.out.println(encryptedLine);
                }
            } catch (NumberFormatException e) {
                System.err.println("Expected an integer for the number of lines. Please try again.");
            }
        }

        reader.close();
    }

    private static String encryptLine(String line) {
        StringBuilder shifted = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                shifted.append((char) (c + 3));
            } else {
                shifted.append(c);
            }
        }

        String reversed = shifted.reverse().toString();
        StringBuilder modified = new StringBuilder();
        int midIndex = reversed.length() / 2;

        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (i >= midIndex) {
                modified.append((char) (c - 1));
            } else {
                modified.append(c);
            }
        }

        return modified.toString();
    }
}
