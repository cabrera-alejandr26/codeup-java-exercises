import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. Loop basics:
        // a.While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //b. do-while
//        int x = 0;
//
////        do{
////            int x1 = 2;
////            System.out.println(x + x1);
////
////        }while(x <= 100);
//
//        int p = 100;
//        int num = 5;
//
//        do{
//            System.out.println(p - num);
//
//        }while(p < 100);

        //c. Refactor the previous two exercises to use a for loop instead.

//        for(int i = 0; i <= 100; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        for( int r = 100; r >= -10; r--){
//           if( r % 5 == 0){
//               System.out.println(r);
//           }
//        }
//
//        for(long w = 2; w <= 10; w++ ){
//
//            if(w % 2 ==0){
//
//                System.out.println(w*w);
//            }
//
//        }

        //Slack Problem
        Scanner scanner = new Scanner(System.in);

        final int correctP = 12345;
        for(int p = 0; p <= 2; p++){
            System.out.println("Please enter the pasword:");
            String userInput = scanner.nextLine();
            if(p == 2 & Integer.parseInt(userInput) != correctP ){
                System.out.println("Sorry but you have been locked out!\n");
            }
            else if(Integer.parseInt(userInput) != correctP){
                System.out.println("Incorrect try again!\n");
            }
            else{
                System.out.println("Correct, welcome back!\n");
                break;
            }

        }

        System.out.println("What number would you like to go up to?");
        String userInput = scanner.nextLine();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int t = 0; t <= Integer.parseInt(userInput); t++){
            int squared = (t*t);
            int cubed = (t *t *t);
            System.out.println(t + "      | " + squared + "       |" + cubed);
        }

        //4. Convert given number grades into letter grades.

        for (; true; ) {
            System.out.println("Please enter grade number:");
            String input = scanner.nextLine();

            if(Integer.parseInt(input) <= 87 | Integer.parseInt(input) >= 80 ){
                System.out.println("Your grade is an B!");
                System.out.println("Would you like to continue?");
                input = scanner.nextLine();
                if(input.equals("y") | input.equals("yes")){
                    continue;

                }else{
                    System.out.println("Thank you for choosing our grading system, have a great day!");
                    break;
                }
            }
            if(Integer.parseInt(input) <= 100 | Integer.parseInt(input) >= 88 ){
            System.out.println("Your grade is an A!");
            System.out.println("Would you like to continue?");
            input = scanner.nextLine();
            if(input.equals("y") | input.equals("yes")){
                    continue;

            }else{
                System.out.println("Thank you for choosing our grading system, have a great day!");
                break;
            }
            }
        }

    }
}
