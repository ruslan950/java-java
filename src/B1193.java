import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= N; i++) {
            String[] caseData = reader.readLine().split(" ");
            String value = caseData[0];
            String base = caseData[1];
            int decimalValue;

            switch (base) {
                case "dec":
                    decimalValue = Integer.parseInt(value);
                    break;
                case "bin":
                    decimalValue = Integer.parseInt(value, 2);
                    break;
                case "hex":
                    decimalValue = Integer.parseInt(value, 16);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported base");
            }

            String hexValue = Integer.toHexString(decimalValue);
            String binValue = Integer.toBinaryString(decimalValue);

            System.out.println("Case " + i + ":");
            if (base.equals("dec")) {
                System.out.println(hexValue + " hex");
                System.out.println(binValue + " bin");
            } else if (base.equals("bin")) {
                System.out.println(decimalValue + " dec");
                System.out.println(hexValue + " hex");
            } else if (base.equals("hex")) {
                System.out.println(decimalValue + " dec");
                System.out.println(binValue + " bin");
            }
            System.out.println();
        }
    }
}