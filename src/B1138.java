import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("0 0")) {
            String[] parts = input.split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            int[] digitCount = new int[10];

            for (int num = A; num <= B; num++) {
                countDigits(num, digitCount);
            }

            // Print the digit counts
            StringBuilder result = new StringBuilder();
            for (int count : digitCount) {
                result.append(count).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }

    private static void countDigits(int num, int[] digitCount) {
        while (num > 0) {
            digitCount[num % 10]++;
            num /= 10;
        }
    }
}