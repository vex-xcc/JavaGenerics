
import java.util.Scanner;

public class Main {

    static Scanner input =new Scanner(System.in);



    public static void main(String[] args) {


        School<InterMediateStudent>  interMediateSchool = new School<>();
        School<PrimaryStudent>  primarySchool = new School<>();

        System.out.println("Pleas inter Number of Student you Need to Register");
        int num = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= num ; i++){

            System.out.println("Pleas inter the student Name");
            String name = input.nextLine();
            System.out.println("Pleas inter the student Age");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Pleas inter the student Email Address");
            String emailAddress = input.nextLine();
            PrimaryStudent primaryStudent =new PrimaryStudent(name,age,emailAddress);
            InterMediateStudent InterMediateStudent =new InterMediateStudent(name,age,emailAddress);
            System.out.println("Pleas inter the student level Press\n 1- for primary School Student" +
                                " \n 2- for InterMediate School Student ");
            int level = input.nextInt();
            input.nextLine();
            if(level == 1){
                primarySchool.addStudent(primaryStudent);
            }else if(level == 2){
                interMediateSchool.addStudent(InterMediateStudent);
            }
            primarySchool.numberOfStudent(primaryStudent);
            interMediateSchool.numberOfStudent(InterMediateStudent);

        }

    }
}
