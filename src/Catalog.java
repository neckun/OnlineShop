public abstract class Catalog {
    protected int id;
    protected String title;
    protected double price;

    public Catalog (){};

    public Catalog(int id, String title, double price){
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
