package MN_221047014;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
   public static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        StudentInterface Student = new Operations();
        Scanner MenuInput = new Scanner(System.in);
        int ch = 0;
        do{
            System.out.println("1->ADD");
            System.out.println("2->Display");
            System.out.println("3->Updated");
        }while (ch!=0);
        ch = MenuInput.nextInt();
        switch (ch){
            case 1: Student.AddStudent();
                   logger.info("added the student to list");
                break;
            case 2 :Student.Display();
                    logger.info("displayed the list");
                    break;
            default:
                System.out.println("enter the option");

        }
    }
}