package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> finalGrades = new HashMap<>();

        //Jimmy's Grades:
        Student Jimmy = new Student("Jimmy");
        Jimmy.addGrade(45);
        Jimmy.addGrade(78);
        Jimmy.addGrade(89);
        finalGrades.put("jimmy-boi09", Jimmy);

        System.out.printf(finalGrades.get("jimmy-boi09").getName() + "'s average grade is: %.2f\n",finalGrades.get("jimmy-boi09").getGradeAverage());

        //Javier's Grades:

        Student Javier = new Student("Javier");
        Javier.addGrade(89);
        Javier.addGrade(93);
        Javier.addGrade(85);
        finalGrades.put("Javi-Script3", Javier);

        System.out.printf(finalGrades.get("Javi-Script3").getName() + "'s average grade is: %.2f\n",finalGrades.get("Javi-Script3").getGradeAverage());

        //Jay's Grades
        Student Jay = new Student("Jay");
        Jay.addGrade(80);
        Jay.addGrade(89);
        Jay.addGrade(96);
        finalGrades.put("blue-jay78", Jay);

        System.out.printf(finalGrades.get("blue-jay78").getName() + "'s average grade is: %.2f \n",finalGrades.get("blue-jay78").getGradeAverage()); //Jimmy's Grades:

        Student David = new Student("David");
        David.addGrade(98);
        David.addGrade(92);
        David.addGrade(89);
        finalGrades.put("David_Code_00", David);

        System.out.printf(finalGrades.get("David_Code_00").getName() + "'s average grade is: %.2f \n",finalGrades.get("David_Code_00").getGradeAverage());

        System.out.println("\nHello,\n here is a list of the GitHub usernames of our students:\n ");
        System.out.println("jimmy-boi09" + " || " + "Javi-Script3" + " || " + "blue-jay78" + " || " + "David_Code_00");

        Scanner scanner = new Scanner(System.in);
//        String user = scanner.nextLine();
//        System.out.println(user);

        for(;true;){
            System.out.println("\nWould you like to look up a Github user?");
            String userAnswer = scanner.next();
            if(userAnswer.equals("yes") | userAnswer.equals("y")){
                System.out.println("\nWhich student would you like to see information on?\n");
                String userInput = scanner.next();
                switch (userInput){
                    case "jimmy-boi09":
                        System.out.printf(finalGrades.get("jimmy-boi09").getName() + "'s average grade is: %.2f\n",finalGrades.get("jimmy-boi09").getGradeAverage());
                        break;
                    case "Javi-Script3":
                        System.out.printf(finalGrades.get("Javi-Script3").getName() + "'s average grade is: %.2f\n",finalGrades.get("Javi-Script3").getGradeAverage());
                        break;
                    case "blue-jay78":
                        System.out.printf(finalGrades.get("blue-jay78").getName() + "'s average grade is: %.2f\n",finalGrades.get("blue-jay78").getGradeAverage());
                        break;
                    case "David_Code_00":
                        System.out.printf(finalGrades.get("David_Code_00").getName() + "'s average grade is: %.2f\n",finalGrades.get("David_Code_00").getGradeAverage());
                        break;

                    default:
                        System.out.println("That is not a valid username...");
                        break;
                }
            }
            else{
                System.out.println("Thank you for your time! Goodbye!");
                break;
            }


//            if(userInput.equals("jimmy-boi09") | userInput.equals("Javi-Script3") | userInput.equals("blue-jay78") | userInput.equals("David_Code_00")){
//                System.out.println("cool!");
//
//            }
//            else{
//                System.out.println("That user does not exist...");
//            }
        }
    }
}
