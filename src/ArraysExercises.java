import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Persons = new String[3];


        Person Name1 = new Person();
        Person Name2 = new Person();
        Person Name3 = new Person();
    for(int i = 0; i <= 2; i++ ){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a name!");
        String userResp = userInput.next();
        if(i == 0){
            Name1.setName(userResp);
            String n1 = Name1.getName();
            Persons[0] = n1;

        }
        else if(i == 1){
            Name2.setName(userResp);
            String n2 = Name2.getName();
            Persons[1] = n2;
        }
        else if(i == 2){
            Name3.setName(userResp);
            String n3 = Name3.getName();
            Persons[2] = n3;

        }
    }

    for(String names : Persons){
        System.out.println("-------");
        System.out.println(names);
    }
//        System.out.println(Arrays.toString(Persons));




    }
}
