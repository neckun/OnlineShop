import java.util.ArrayList;

public abstract class Product extends SubCategory{
    protected double price;
    protected String nameProduct;

    Product(Catalog mainCatalog,int id, String name,String nameSub, double price, String nameProduct){

        super(mainCatalog,id,name,nameSub);
        this.price = price;
        this.nameProduct = nameProduct;

    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String showInfo();

    public void addArrayProduct(ArrayList<Product> list){
        list.add(this);
    }
}
