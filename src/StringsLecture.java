import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        char character = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String Bob = "uncle bob";
        System.out.println("Who is your favorite uncle?");
        String maybeBob = scanner.nextLine();

        System.out.println("User answered with correct answer and capitalization?: " + Bob.equals(maybeBob));
        System.out.println("Useranswered with correct answer? " + Bob.equalsIgnoreCase(maybeBob));

        //Compare the start and end of strings
        String Ale = "Ale";
        String Dad = "Aad";
        String firstLetterAle = ("" + Ale.charAt(0)).toLowerCase(Locale.ROOT);
        System.out.println("Ale and Dad start with the same letter?: " + Dad.startsWith(firstLetterAle));

        //Manipulation
        int locationOfAInDad = Dad.indexOf("a");
        System.out.println(locationOfAInDad);
    }
}
