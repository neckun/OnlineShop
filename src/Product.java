public class Product {
    private int id;
    private String title;
    private double price;

    public Product (){};

    public Product(int id, String title, double price){
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
