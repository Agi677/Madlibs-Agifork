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

        String template = "I went to the animal ; the  and the  beasts were there.";

        String madlibstory = template.substring(0, 21) + noun1 
                + template.substring(21, 28) + pluralNoun1 
                + template.substring(28, 37) + number1 
                + template.substring(37);

        System.out.println(madlibstory);

        scanner.close();
    }
}
