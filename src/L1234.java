import java.util.Scanner;

public class L1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            boolean toggleCase = true;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (toggleCase) {
                        result.append(Character.toUpperCase(c));
                    } else {
                        result.append(Character.toLowerCase(c));
                    }
                    toggleCase = !toggleCase;
                } else {
                    result.append(c);
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
