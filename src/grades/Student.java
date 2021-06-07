package grades;

import java.util.ArrayList;

public class Student {
//Private Properties
private static String studentName;
private static ArrayList<Integer> grades = new ArrayList<>();


    Student(String name){
        this.studentName = name;
        boolean isEmpty = grades.isEmpty();
        System.out.println("Your array empty status: " + isEmpty);
    }

        // returns the student's name
    public static String getName(){
        return studentName;
    }
    // adds the given grade to the grades property
    public static void addGrade(int grade){
     grades.add(grade);
        System.out.println("this is your new arrayList: " + grades);
    }
    // returns the average of the students grades
    public static double getGradeAverage(){
        double sum = 0;
        for( int num : grades) {
            sum = sum + num;
        }
        return sum/grades.size();
    }

public static void main(String[] args) {
    addGrade(56);
    addGrade(67);
    addGrade(78);
    Student test = new Student("john");
    System.out.println(getName());
    System.out.println(getGradeAverage());
}
}
