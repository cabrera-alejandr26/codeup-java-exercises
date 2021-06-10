package grades;

import java.util.ArrayList;

public class Student {
//Private Properties
private  String studentName;
public   ArrayList<Integer> grades = new ArrayList<>();


   Student(String name){
        this.studentName = name;
//        boolean isEmpty = grades.isEmpty();
//        System.out.println("Your array empty status: " + isEmpty);
    }

        // returns the student's name
    public  String getName(){
        return studentName;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade){
     grades.add(grade);
//        System.out.println("this is your new arrayList: " + grades);
    }


    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for( int num : grades) {
            sum = sum + num;
        }
        return sum/grades.size();
    }

public static void main(String[] args) {
    Student test = new Student("john");
    test.addGrade(56);
    test.addGrade(67);
    test.addGrade(78);

    System.out.println(test.getName());
    System.out.println(test.getGradeAverage());
    System.out.println(test.grades);
}
}
