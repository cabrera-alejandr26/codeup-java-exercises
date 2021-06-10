import java.util.Scanner;

//Class blueprint!
public class Person {
    //Set a private String
    private String Name;

    //The constructor
    public Person(String n){
        this.Name = n;
    }

    public String getName(){
//TODO: return the person's name
    return Name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        Name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName());
    }

    public static void main(String[] args) {
        //Made a new object
        Person newName = new Person("Alex");

        //Setting up scanner
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResp = userInput.next();
        //Setting the name
        newName.setName(userResp);
        //Printing out the new name:
        System.out.println("The new name is " + newName.getName());

        //Saying hello
        newName.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);



//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }


}


