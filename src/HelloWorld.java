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
        float newNumber = (float)3.14;
        System.out.println(newNumber);


        //#10 Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        // If the increment unary operator is added after the number, then the increment only happens after the "incremented" variable has been called again.
        //If the increment unary operator is added before the number or variable, the increment happens that same time the variable is called.

        //#11 Try to create a variable named class. What happens?
//        long class = 9;
        // An error message is received.

        //#12 Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";
//
//        System.out.println(three);

            //Both come out as errors...

        //#13 Rewrite the following expressions using the relevant shorthand assignment operators:
        int t = 4;
        t += 5;

        int u = 3;
        int w = 4;
        w *= u;

        int z = 10;
        int yr = 2;
        z /=  yr;
        yr -= z;

        //#14 What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        // Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

        //If a numerical value is smaller than what the type can hold then than there is an error, if the numerical value is much bigger than what a type can hold than it overflows.





















                }
}
