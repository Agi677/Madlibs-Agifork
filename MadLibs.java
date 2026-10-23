import java.util.Scanner;

public class MadLibs {

    public static String getWord(Scanner scanner, String wordType) {
        // Asks user for a type of word(noun, verb, etc.)
        System.out.print("Enter a " + wordType + ": ");
        // Returns the user input
        return scanner.nextLine();
    }

public static void main(String[] args) {
    // Set up the scanner to read user input from the keyboard.
    // We'll use this same scanner throughout the whole program.
    Scanner scanner = new Scanner(System.in);

    // Ask the user for the first batch of words using our helper method.
    // Each word gets saved into its own variable for later use in the story.
    String noun1 = getWord(scanner, "noun");
    String pluralNoun1 = getWord(scanner, "plural noun");
    String number1 = getWord(scanner, "number");

    // The base template string that we will slice up.
    // We leave room here to slot in the user's answers.
    String template = "I went to the animal ; the and the beasts were there.";

    // Condenses the template and stitch it back together with the user's words.
    // This builds the finished first sentence.
    String madlibstory = template.substring(0, 21) + noun1
            + template.substring(21, 28) + pluralNoun1
            + template.substring(28, 37) + number1
            + template.substring(37);

        System.out.println("Madlib 2");
        // Second sentence of madlib story
        String madlibstory2 = "The <adjective> <noun> went to the mall for <pluralNoun>.";
        // User is prompted to enter an adjective using the getWord function
        String adjective2 = getWord(scanner, "adjective");
        // User is prompted to enter a noun using the getWord function
        String noun2 = getWord(scanner, "noun");
        // User is prompted to enter a plural noun using the getWord function
        String pluralNoun2 = getWord(scanner, "plural noun");

        // The entire story is put together using the substring method, the variables and the original madlibstory2
        madlibstory2 = madlibstory2.substring(0, 4) + adjective2
                + madlibstory2.substring(15, 16) + noun2
                + madlibstory2.substring(22, 44) + pluralNoun2
                + madlibstory2.substring(56);

        // Line 2 of madlibs is printed out
        System.out.println(madlibstory2);

        System.out.println("\nNew Madlib");

        String adjective3 = getWord(scanner, "adjective");
        String noun3 = getWord(scanner, "noun");
        String adverb3 = getWord(scanner, "adverb");

        // Template sentence 3
        String template2 = "Once upon a time in a  land, a   grew.";

String fullMadLibStory = template2.substring(0, 22) + adjective3
                + template2.substring(22, 31) + noun3
                + template2.substring(30, 31) + adverb3
                + template2.substring(32);

        System.out.println("\nCompleted Mad Lib:");
        System.out.println(fullMadLibStory);

        scanner.close();
        
    }
}
        




