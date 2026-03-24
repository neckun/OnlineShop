import java.util.ArrayList;

public abstract class Product extends Catalog{
    protected double price;
    protected String nameProduct;

    Product(){};

    Product(int id, String title, double price, String nameProduct){
        super(id,title);
        this.price = price;
        this.nameProduct = nameProduct;

        if(list.containsKey(title)){
            ArrayList<Product> newArr = list.get(title);
            newArr.add(this);

            list.replace(title,newArr);
        }
        else{
            ArrayList<Product> newArr = new ArrayList<>();
            newArr.add(this);

            list.put(title,newArr);
        }
    }

    @Override
    public double calculatePrice(int count) {
        return count * price;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
