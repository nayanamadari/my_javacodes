import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        int product =-1;
        Scanner s= new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        File file = new File("product.txt");
        ArrayList<Product> al = new ArrayList<Product>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        if(file.isFile()){
            ois = new ObjectInputStream(new ObjectInputStream(file));
            al = (ArrayList<Product>)ois.readObject();
            ois.close();
        }
        do{
            System.out.println("1.ADD");
            System.out.println("2.DISPLAY");
            System.out.println("0.EXIT");
            product = s.nextInt();
        }while (product!=0);

        switch (s) {
            case 1 -> {
                System.out.println("Enter how many product you need to add");
                int n = s.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("enter product number");
                    int product_number = s.nextInt();
                    System.out.println("enter product name");
                    String product_name = s1.nextLine();
                    System.out.println("enter product price");
                    int product_price = s.nextInt();
                    al.add(new Product(product_number, product_name, product_price));
                }
            }
            case 2 -> System.out.println(al);
        }
    }
}