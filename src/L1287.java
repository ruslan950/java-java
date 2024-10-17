import java.util.Scanner;

public class L1287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String processedInput = processInput(input);
            System.out.println(validateAndConvert(processedInput));
        }

        scanner.close();
    }

    private static String processInput(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == ' ' || c == ',') {
                continue;
            }
            if (c == 'O' || c == 'o') {
                sb.append('0');
            } else if (c == 'l') {
                sb.append('1');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private static String validateAndConvert(String input) {
        if (input.isEmpty()) {
            return "error";
        }

        try {
            long value = Long.parseLong(input);
            if (value < 0 || value > 2147483647) {
                return "error";
            }
            return String.valueOf(value);
        } catch (NumberFormatException e) {
            return "error";
        }
    }
}

