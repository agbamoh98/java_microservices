package Homework.BookPack;

public class Book<T> {
     private String name,supermarket;
     private double price;
     private int numofpages;
     private T cover;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(String supermarket) {
        this.supermarket = supermarket;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumofpages() {
        return numofpages;
    }

    public void setNumofpages(int numofpages) {
        this.numofpages = numofpages;
    }

    public T getCover() {
        return cover;
    }

    public void setCover(T cover) {
        this.cover = cover;
    }

    public Book(String name, String supermarket, double price, int numofpages, T cover) {
        this.name = name;
        this.supermarket = supermarket;
        this.price = price;
        this.numofpages = numofpages;
        this.cover = cover;
    }

    public Book() {
        this.name = "";
        this.supermarket = "";
        this.price = 0;
        this.numofpages = 0;
        this.cover = null;
    }


    public String display() {
        return "Book{" +
                "name='" + name + '\'' +
                ", supermarket='" + supermarket + '\'' +
                ", price=" + price +
                ", numofpages=" + numofpages +
                ", cover=" + cover +
                '}';
    }

    public static void main(String[] args) {
        Book<String> book1=new Book<>("harry potter","amazon",19.99,207,
                "harry potter and the philosopher's stone, by J.K. Rowling");

        Book<Integer> book2=new Book<>("harry potter","amazon",19.99,207, 1984);

        System.out.println("book1 info:\n"+book1.display());
        System.out.println("book2 info:\n"+book2.display());
    }
}
