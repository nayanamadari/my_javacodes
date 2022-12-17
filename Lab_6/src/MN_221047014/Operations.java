package MN_221047014;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Operations implements StudentInterface {
    List<Student> c= new ArrayList<Student>();
    Scanner ForInt= new Scanner(System.in);
    Scanner ForString = new Scanner(System.in);
    public void AddStudent(){
        System.out.println("Enter Student ID");
        int StudentId= ForInt.nextInt();
        System.out.println("Enter student name");
        String Studentname = (ForString.nextLine());
        System.out.println("Enter Student age ");
        int Age= ForInt.nextInt();

        c.add(new Student(StudentId,Studentname,Age));
    }

    public void Display(){
        System.out.println("------------------");
        Iterator<Student> i = c.iterator();
        while (i.hasNext()){
            Student e =i.next();
            System.out.println(e);
        }
        System.out.println("--------------");
    }


}
