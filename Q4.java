import java.util.Scanner;

public class DuplicateCharactersWithoutHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine().trim();
        System.out.println("Duplicate characters:");
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != ' ') {
                for (int j = i + 1; j < inputString.length(); j++) {
                    if (currentChar == inputString.charAt(j)) {
                        System.out.println(currentChar);
                        break;
                    }
                }
                inputString = inputString.replace(currentChar, ' ');
            }
        }

        scanner.close();
    }
}
