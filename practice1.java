import java.util.Scanner;

public class  practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /// for checking even or odd   ques 1
        // int num;

        // System.out.print("Enter the Number : ");
        // num = scanner.nextInt();

        // if (num % 2 == 0) {
        //     System.out.println("even");
            
        // }
        // else{
        //     System.out.println("odd");

        // }


        // for checking voting eligibility   ques 2

        // int age;

        // System.out.print("Enter your Age :");
        // age = scanner.nextInt();

        // if (age >= 18) {
        //     System.out.println("Eligible to vote");
        // }
        // else{
        //    System.out.println( "Not eligible to vote");
        // }


        /// for checking no. is positive , negative or zero   ques 3
         
        // int number;

        // System.out.print("Enter the number : ");
        // number = scanner.nextInt();

        // if (number > 0 ) {
        //     System.out.println("Number " + number + " is positive.") ;
            
        // }
        // else if (number < 0 ) {
        //     System.out.println("Number " + number  + " is negative.") ;
            
        // }
        // else{
        //     System.out.println(" Number is zero.");
        // }


        /// Leap year checker Ques 4
        
        int year;

        System.out.print("Enter the YEAR : ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {

                System.out.println("Year " + year + "is Leap Year. ");
            }
            else{
                System.out.println("Year " + year + "is not a Leap Year. ");
            }
        }
        else{
            if (year / 100 == 0 &&  year / 400 == 0) {
                System.out.println("Year " + year + "is Leap Year. ");
  }
        }

        scanner.close();


    }
}