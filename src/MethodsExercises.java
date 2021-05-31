import java.util.Scanner;

public class MethodsExercises {
    //#1
    //Addition
    public static int addition (int x, int y) {
        return x + y;
    }

    //Subtraction
    public static int subtraction (int x, int y){
        return x - y;
    }

    //Multiplication
    public static int multiply (int x, int y){
        return x*y;
    }

    //Division
    public static int divide (int x, int y){

        return x / y;
    }

    //Modulus
    public static int mod (int x, int y){
        return x % y;
    }

    //#2
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " +  max + ": ");
        int userNum = scanner.nextInt();
//        int userInput = getInteger(1, 10);
        if(userNum < min || userNum > max){
            System.out.println("Please enter a number between " + min +  " and " +  max + "\n\n");
            return userNum;
        }else{
            System.out.println("Thank you for your number!\n\n");
             return userNum;
        }



    }

//    public static int getInteger(int min, int max) {
//        System.out.printf("Give me a number between %d and %d\n", min, max);
//        Scanner scanner = new Scanner(System.in);
//        int userNumber = scanner.nextInt();
//
//        if ((userNumber > max) || (userNumber < min)) {
//            System.out.println("Try again!");
//            return getInteger(min, max);
//        } else {
//            System.out.printf("Thank you for following directions! Your number was ");
//            return userNumber;
//        }
//    }

    //#3
    public static int factorialNum (int min, int max){
        System.out.println("Please enter a number between " + min + " & " + max + ".");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        System.out.println("Your chosen number is " + userNum + ".");
        int factorial = 1;
        System.out.println("Are you sure you want continue? [y/n]");
        String userInput = scanner.next();
        if(userInput.equals("y") || userInput.equals("yes")){
            for(int i = 1; i <= userNum; i++){
                if(userNum < min || userNum > max){
                    System.out.println("Your number is not between " + min + " & " + max + ".");
                    System.out.println("Please enter a number between " + min + " & " + max + ".");
                }
                else{
                    factorial = factorial*i;
                    if(i == userNum){
                        System.out.println("The factorial of your number !" + userNum + " is: " + factorial + "\n\n");

                    }
                    else{
                        System.out.println("Finding the factorial...");
                    }
                }
            }
        }
        else{
            System.out.println("Thank you for your time, have a great day!");
        }
            return userNum;
    }

    //#5
    public static int rollDice (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides you dice have");
        System.out.print("Sides of pair of dice: ");
        int DiceSide = scanner.nextInt();

        System.out.println("Type \"Roll\" to roll the dice, if not type in \"quit\"");
        String userInput = scanner.next();
        if(userInput.equals("Roll") || userInput.equals("roll")) {
            int max = DiceSide;
            int min = 1;
            int range = max - min + 1;
            for (int i = 0; i <= DiceSide; i++) {
                int rand = (int) (Math.random() * range) + min;
                int rand2 = (int) (Math.random() * range) + min;
                if(i == DiceSide){
                    System.out.println("Dice1 rolled a: " + rand + "\nDice2 rolled a: " + rand2);
                }
            }
        }else{
            System.out.println("Thank you for trying to play with me at least...");
        }
        return DiceSide;
    }

    //#6
    public static int gameDev101 (){
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play a game!");
        System.out.println("First, let us pick a number between 1 and 100! \n The trick here is you are going to have to guess which number it is!");
        int randNum = (int) (Math.random() * range) + min;
        System.out.println(randNum);
        System.out.println("Start guessing! When you're done, type in the number that you think we picked in the terminal!");

        for(int i = 0; true;){
//            int count = 0;
            int userInput = scanner.nextInt();
            if(userInput < randNum){
                System.out.println("HIGHER!");
                System.out.println("Number of tries:" + ++i);

            }
            else if(userInput > randNum){
                System.out.println("LOWER!");
                System.out.println("Number of tries:" + ++i);
            }
            else if(userInput == randNum){
                System.out.println("CORRECT! YOU GUESSED THE NUMBER RIGHT!\nThanks for playing!");
                System.out.println("Number of tries:" + ++i);
                break;
            }

        }
        return min;

    }


    public static void main(String[] args) {
//        int invokeAdd = addition(9,6);
//        int invokeSub = subtraction(9,6);
//        int invokeMul = multiply(10,8);
//        int invokeDiv = divide(3,3);
//        int invokeMod = mod(9,6);
//        System.out.println("Addition Method: " + invokeAdd + "\nSubtraction Method: " + invokeSub + "\nMultiplication Method: " + invokeMul + "\nDivision Method: " + invokeDiv + "\nModulus Method: " + invokeMod);
//        getInteger(1,15);
//        factorialNum(1, 10);
//        rollDice();
        gameDev101();
    }
}
