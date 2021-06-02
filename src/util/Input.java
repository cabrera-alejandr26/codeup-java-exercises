package util;

import java.util.Scanner;

//Class blueprint
public class Input {
    //Initializing variable scanner
    private Scanner scanner;


    //The constructor
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
        //equalsIgnoreCase ignores wether a string is upper or lowercase
        //You can use && and || symbols within a return method
        return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.printf("Give a number between %d and %d", min, max);
        int userNum = scanner.nextInt();

        if(userNum >= min && userNum <= max){
            return userNum;
        }
        else{
            System.out.println("Invalid Number!");
            return getInt(min, max);
        }
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(double Min, double Max){
        System.out.printf("Give a decimal number between %f and %f", Min, Max);
        double userDouble = scanner.nextDouble();

        if(userDouble >= Min && userDouble <= Max){
            return userDouble;
        }else{
            System.out.println("Invalid Number!");
            return getDouble(Min,Max);
        }
    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }

}
