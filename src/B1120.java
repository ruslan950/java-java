import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = reader.readLine()).equals("0 0")) {
            String[] parts = line.split(" ");
            char faultyDigit = parts[0].charAt(0);
            String number = parts[1];

            String modifiedNumber = number.replace(Character.toString(faultyDigit), "");
            if (modifiedNumber.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Long.parseLong(modifiedNumber));
            }
        }
    }
}
