import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String encoded = reader.readLine();
            int shift = Integer.parseInt(reader.readLine());
            String decoded = decode(encoded, shift);
            System.out.println(decoded);
        }
    }

    private static String decode(String encoded, int shift) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encoded.toCharArray()) {
            char originalChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
            decoded.append(originalChar);
        }
        return decoded.toString();
    }
}
