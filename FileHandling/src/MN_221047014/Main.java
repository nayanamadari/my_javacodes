package MN_221047014;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            File myObj1 = new File("C:\\Users\\nayan\\OneDrive\\Documents\\Input.txt");
            if (myObj1.createNewFile()) {
                System.out.println("File created: " + myObj1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\nayan\\OneDrive\\Documents\\Input.txt");
            myWriter.write("if have not done any mistake then not try anything new");
            myWriter.close();
            System.out.println("Input given and inserted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj2 = new File("C:\\Users\\nayan\\OneDrive\\Documents\\Output.txt");
            if (myObj2.createNewFile()) {
                System.out.println("File created: " + myObj2.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {

            FileReader f1 = new FileReader("Input.txt");


            File myObj = new File("C:\\Users\\nayan\\OneDrive\\Documents\\Input.txt");
            FileWriter myWriter = new FileWriter("C:\\Users\\nayan\\OneDrive\\Documents\\Output.txt");
            Scanner myReader = new Scanner(myObj);

            int i; String s="";
            while ((i=f1.read())!=-1)
                s+=(char)i;

            myWriter.write(s);
            myWriter.close();
            System.out.println("Input given and inserted successfully.");

            myReader.close();
            f1.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();



        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
