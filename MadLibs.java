import java.util.Scanner;

public class MadLibs {

    
    public static String getWord(Scanner scanner, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String noun1 = getWord(scanner, "noun");
        String pluralNoun1 = getWord(scanner, "plural noun");
        String number1 = getWord(scanner, "number");

        String madlibstory = "I went to the animal " + noun1 + "; the " + pluralNoun1 + " and the " + number1 + " beasts were there.";
        System.out.println(madlibstory);

        scanner.close();

    }
}
