/*This is a program designed to do several actions like calculating the total coursework results and calculating the exam results. 
The program will then give an output.*/

//Importing scanner clas from java util package
import java.util.Scanner;
//Creating a class
public class Exam{
//Main method
 public  static void main(String[]args){

    //Creating object of scanner class
    Scanner scanner = new Scanner(System.in);
   
   
    double assignment1 = 4, assignment2 = 3, assignment3 = 8, cat1 = 14, cat2 = 12;
    double courseworkResult = assignment1 + assignment2 + assignment3 + cat1 + cat2;
    double examResult = 30;
    double totalResult = courseworkResult + examResult;
    int select;
    
    do { //The do while loop ensures that the user select what he or she desires to view
        System.out.println("Main Menu");
        System.out.println("1. View coursework results");
        System.out.println("2. View exam result");
        System.out.println("3. Exit Program");
        System.out.println("You can select any of the three choices availale;");
        select = scanner.nextInt();
        //Switch case enables the user to select what he or she wants to view
        switch(select){
            //The first case will display the total coursework results out of 50
            case 1:
            System.out.println("Your total coursework result is:" + courseworkResult + "/50");
            break;
            
            //The second case will display the total exam results out of 50 and the overall total result out of 100
            case 2:
            System.out.println("Your total exam result is:" + examResult + "/50");
            System.out.println("Your overall total result is:" + totalResult + "/100");
            break;

            //The third case is an option for exiting the program
            case 3:
            System.out.println("Exit the Program");
            break;

            default:
            System.out.println("Invalid Entry");

        }
        

    }while(select != 3);
    //Closing scanner to prevent leakage
        scanner.close();

        
 }
 //Calculating the total course work done which includes three assignments and two cats
 public static int calculateCoursework(double assignment1, double assignment2, double assignment3, double cat1, double cat2){
    double[] coursework = {assignment1, assignment2, assignment2, cat1, cat2};
    int calculate = 0;
    for(int i = 0; i < 5; i++){
        if(coursework[i] > 0){
            calculate++;
        }
    }
    return calculate;
    }
    //Checking if the student has done two thirds of the course work
 public static boolean completedTwoThirdsofCoursework(int courseworkDone){
        return courseworkDone >=(5 * 2 / 3);
        
    }

}
