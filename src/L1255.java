import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class L1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < N; t++) {
            String line = sc.nextLine().toLowerCase();
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                }
            }
            int maxFrequency = 0;
            for (int freq : frequencyMap.values()) {
                if (freq > maxFrequency) {
                    maxFrequency = freq;
                }
            }

            StringBuilder result = new StringBuilder();
            for (char c : frequencyMap.keySet()) {
                if (frequencyMap.get(c) == maxFrequency) {
                    result.append(c);
                }
            }

            char[] resultArray = result.toString().toCharArray();
            java.util.Arrays.sort(resultArray);
            System.out.println(new String(resultArray));

        }
    }
}
