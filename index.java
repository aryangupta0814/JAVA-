import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        //Scanner

////////
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter your name : ");
    // String name = scanner.nextLine();

    // System.out.print("Enter your age : ");
    // int age = scanner.nextInt();

    // System.out.print("What is your cgpa : ");
    // double cgpa = scanner.nextDouble();

    // System.out.print("Are you a student? (true/false) :");
    // boolean isStudent = scanner.nextBoolean() ;

    // System.out.println("Hello " + name);
    // System.out.println("You are " + age + " years old." );
    // System.out.println("Your cgpa is " + cgpa);


    // if(isStudent){
    //     System.out.println("You are enrolled as a student");
    // }
    // else{
    //     System.out.println("You are NOt enrolled Aryan ");
    // }
    // scanner.close();
////////

// ab phle integer ka output lenge jiske bbaad hame scanner.nextLine(); likhna padega 

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age : ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter your favourite color : ");
    String color = scanner.nextLine();


    System.out.println("You are " + age + " years old");
    System.out.println("You like the color " + color);
    
scanner.close();
    }
}
