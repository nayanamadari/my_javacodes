package MN_221047014;

import java.io.*;
import java.util.*;

public class Operations implements ProductStore {

    @Override
    public void addProduct(int product_id, String product_name, int product_price) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try (FileWriter f = new FileWriter("\\C:\\Users\\nayan\\IdeaProjects\\Lab5_prod\\src\\MN_221047014\\names.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.print(product_id + " ");
            p.print(product_name + " ");
            p.println(product_price);
            System.out.println("Product added to file Successfully");
        } catch (IOException i) {
            i.printStackTrace();
        }


    }


    @Override
    public void upDate(int product_id, String product_name, int product_price) throws IOException {

        String oldLine = "";
        String filePath = "\\C:\\Users\\nayan\\IdeaProjects\\Lab5_prod\\src\\MN_221047014\\names.txt";
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
            String line = sc.nextLine() + System.lineSeparator();
            String[] parts = line.split(" ");
            if (Integer.parseInt(parts[0]) == product_id) {
                oldLine = line;
            }
            buffer.append(line);
        }
        String fileContents = buffer.toString();
        System.out.println("old Contents of the file:\n " + fileContents);
        sc.close();

        String newLine = product_id + " " + product_name + " " + product_price + "\n";
        //Replacing the old line with new line
        fileContents = fileContents.replaceAll(oldLine, newLine);
        //instantiating the FileWriter class
        FileWriter writer = new FileWriter(filePath);
        System.out.println("");
        System.out.println("File content after update: \n" + fileContents);
        writer.append(fileContents);
        writer.flush();

    }

    public void Display() throws IOException {

        FileReader reader = new FileReader("\\C:\\Users\\nayan\\IdeaProjects\\Lab5_prod\\src\\MN_221047014\\names.txt");

        // create properties object
        Properties p = new Properties();

        // Add a wrapper around reader object
        p.load(reader);

        String filepath = p.getProperty("path");

        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

