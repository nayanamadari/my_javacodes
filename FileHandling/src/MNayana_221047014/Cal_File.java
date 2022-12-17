package MNayana_221047014;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

interface MyOperations{
    public String add(int a, int b);
    public String subtract(int a, int b);
    public String multiply(int a, int b);
    public String division(int a, int b);
    public String min(int a, int b);
}

public class Cal_File implements MyOperations{
    public static void main(String[] args) throws InputMismatchException{
        Cal_File cal = new Cal_File();
        try {
            var sc1 = new Scanner(System.in);
            System.out.println("For addition                : 1");
            System.out.println("For subtraction             : 2");
            System.out.println("For multiply                : 3");
            System.out.println("For division                : 4");
            System.out.println("For minimum of number       : 5");
            System.out.println("Enter your choice here      :  ");
            int c = sc1.nextInt();

            System.out.println("Enter first number : ");
            char x = (char) sc1.nextInt();
            System.out.println("Enter second number: ");
            char y = (char) sc1.nextInt();
            String data = null;


            switch(c) {
                case 1:
                    data = cal.add(x, y);
                    break;
                case 2:
                    data = cal.subtract(x, y);
                    break;
                case 3:
                    data = cal.multiply(x, y);
                    break;
                case 4:
                    data = cal.division(x, y);
                    break;
                case 5:
                    data = cal.min(x, y);
                    break;
                default : System.out.println("Invalid input");
            }
            try{
                /**Creating Data file
                 File file = new File("data.txt");*/
                int i; String s = null;
                //Saving user data with file without loosing old data
                FileWriter wr = new FileWriter("data.txt", true);
                wr.write("\n");
                wr.write(data);
                wr.write("\n");
                wr.close();
                FileReader f2r = new FileReader("data.txt");
                while((i=f2r.read())!=-1) {
                    s += (char)i;
                }
                System.out.println(s);
                f2r.close();
            }
            catch(Exception e){
                System.out.println("File dosn't exist ");
            }


            //System.out.println(data);

        }
        catch(InputMismatchException e){
            // show if value is invalid.
            System.out.println("Invalid Input...");}
        catch(ArithmeticException e){
            // show when number is divided by 0.
            System.out.println("Error:Divide By ZERO");
        }

    }

    public int a;
    public int b;
    public String data;



    public String add(int a, int b) {
        try {
            data = "MyOperations - add " + a + " and " + b + " = " + (a+b)+"\n";
            System.out.println(data);

        }catch(Exception e) {
            System.out.println("Error Occuured");
            return "Error";
        }
        return data;
    }



    public String subtract(int a, int b) {
        data = "MyOperations - subtract " + a + " and " + b + " = " + (a-b)+"\n";
        System.out.println(data);
        return data;
    }



    public String multiply(int a, int b) {

        data ="MyOperations - multiply " + a + " and " + b+ " = " + (a*b)+"\n";
        System.out.println(data);
        return data;
    }

    public String division(int a, int b) {
        data ="MyOperations - multiply " + a + " and " + b+ " = " + (a/b)+"\n";
        System.out.println(data);
        return data;

    }

    public String min(int a, int b) {
        int x;
        if (a < b) {
            x = a;
        }
        else
            x = b;
        data = "MyOperations - min " + a + " and " + b+" is "+x+"\n";
        System.out.println(data);
        return data;
    }
}

