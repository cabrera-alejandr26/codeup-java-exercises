public class HelloWorld {
    public static void main(String[] args){
       System.out.println("Hello, World!");

       //Exercise Problems
        //#1 Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 9;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        //#2 Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hola mi mundo!";
        System.out.println(myString);

        //#3 Change your code to assign a character value to myString. What do you notice?
        myString = "This variable has a new definition!";
        System.out.println(myString);

        //#4 Change your code to assign the value 3.14159 to myString. What happens?
        //myString = 3.14159; This causes an error
//        System.out.println(myString);

        //#5 Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;//The variable needs to be initialized.
//        System.out.println(myNumber);

        //#6 Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14; //java: incompatible types: possible lossy conversion from double to long
//        System.out.println(myNumber);

        //#7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L; //The number 123L prints out on the terminal, but it seems the last letter L is ignored and not printed.
        System.out.println(myNumber);

        //#8 Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        myNumber = 123;
        System.out.println(myNumber);

        // #9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber2;













    }
}
