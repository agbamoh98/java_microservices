package Homework.ProductPack;

public class Product {
    private String name;
    private double price;
    private static final double VAT=0.17;

    public Product() {
        this.name="";
        this.price=0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String display() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPriceIncludingVat(){
        return price+price*VAT;
    }


    public static void main(String[] args) {
        Product product1=new Product("milk",6.02);
        System.out.println(product1.getPriceIncludingVat());
    }
}
