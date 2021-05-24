import java.util.Scanner;

public class Console_IO_Lecture {
    public static void main(String[] args){
        System.out.printf("Hello %s", "Alejandro\n");

        System.out.format("%d is %s's my favorite number",42,"Alejandro");

        //Taking in an input
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%n Hey, what's going on? %n");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n" ,userInput);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();

        System.out.printf("Your number is: %d", num + 4);
    }
}
