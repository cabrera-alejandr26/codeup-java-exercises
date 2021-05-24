import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        //#1
        double pi = 3.14159;
        System.out.printf("The variable pi with the value: " + pi + ", will be formatted... %n");

        System.out.format("The new formatted value of the variable pi is: %.2f%n", pi);


        //EXPLORE THE SCANNER CLASS
        //#1  Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //  What happens if you input something that is not an integer?

        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        int num = scanner.nextInt();

        System.out.printf("Your number is: %d%n", num);

        //#2 Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?

        System.out.println("Please pick your three favorite words and type them in the console log: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("Your three favorite words are: %n-%S %n-%S %n-%S%n", word1 ,word2 ,word3);


        //#3 Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        // Do you capture all the words?
        System.out.println("Please enter your favorite sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();


        System.out.printf("This is a nice sentence: %s%n%n",sentence);

        //CALCULATE THE PERIMETER AND AREA OF CODEUP CLASSROOMS
        System.out.println("Today we are going to measure the dimensions of your room by the lenght and width. \nAfter that we will find the perimeter.");
        System.out.println("Lets start with your height, what is your rooms height?");
        Float height = scanner.nextFloat();
        System.out.format("Your height dimension is: %.2f%n", height);
        System.out.println("And your room's width?");
        Float width = scanner.nextFloat();
        System.out.format("Your width dimension is: %.2f%n", width);
        Float peri = (height * 2) + (width * 2);
        Float area = height * width;
        System.out.printf("Your room's perimeter is: %.2f%n", peri);
        System.out.printf("Your room's area is: %.2f%n", area);

        //BONUS





    }
}
