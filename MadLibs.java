import java.util.Scanner;

// Defines the public class madlibs 
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

        // Second sentence of madlib story
        String madlibstory2 = "The <adjective> <noun> went to the mall for <pluralNoun>.";
        // User is prompted to enter an adjective that will be stored under the adjective variable
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        // User is prompted to enter a noun that will be stored under the noun2 variable
        System.out.print("Enter a noun: ");
        String noun2 = scanner.nextLine();
        // User is prompted to enter a plural noun that will be stored under the pluralNoun2 variable
        System.out.print("Enter a plural noun: ");
        String pluralNoun2 = scanner.nextLine();

        // The entire story is put together using the substring method, the variables and the original madlibstory2
        madlibstory2 = madlibstory2.substring(0, 4) + adjective + madlibstory2.substring(15, 16) + noun2 + madlibstory2.substring(22, 44) + pluralNoun2 + madlibstory2.substring(56);
        // Line 2 of madlibs is printed out
        System.out.println(madlibstory2);
        
        scanner.close();
    }
}
        





