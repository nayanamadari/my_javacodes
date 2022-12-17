public class Product {
    int product_number;
    String product_name;
    int product_price;

    public Product(int product_number, String product_name, int product_price) {
        this.product_number = product_number;
        this.product_name = product_name;
        this.product_price = product_price;
    }
    public String toString(){
        String s = product_name + " " + product_number + " " + product_price;
        return s;
    }
}
