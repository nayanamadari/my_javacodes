package MN_221047014;

import java.io.Serializable;

public class Product implements Serializable {
    int product_id;
    int product_price;
    String product_name;

    public int getProduct_id() {
        return product_id;
    }

    public Product(int product_id,  String product_name, int product_price) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_name = product_name;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void display_product()
    {
        System.out.println(this.product_id + " "+ this.product_name + " " + this.product_price);
    }



}
