package MN_221047014;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Operations op = new Operations();

        System.out.println("please select your choice:\n 1 - Add\n 2 - Update\n 3 - Display");

        int choice;
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        choice = sc.nextInt();
        int product_id;
        String product_name;
        int product_price;

        switch(choice) {
            case 1:
                System.out.println("Enter how many enters that needs to be added: ");
                int n = sc.nextInt();
                for(int i =0;i<n;i++) {
                    System.out.println("please enter product ID\n");
                    product_id = sc.nextInt();
                    System.out.println("please enter product Name\n");
                    product_name = sc1.nextLine();
                    System.out.println("please enter product Price\n");
                    product_price = sc.nextInt();

                    op.addProduct(product_id, product_name, product_price);
                }

                break;
            case 2:
                System.out.println("Please enter the products you need to update: \n ");

                    System.out.println("please enter product ID\n");
                    product_id = sc.nextInt();
                    System.out.println("please enter product Name\n");
                    product_name = sc1.nextLine();
                    System.out.println("please enter product Price\n");
                    product_price = sc.nextInt();

                    op.upDate(product_id, product_name, product_price);

                break;

            default:
                op.Display();
        }


    }
}

