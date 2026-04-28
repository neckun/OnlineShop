import java.util.ArrayList;
import java.util.Comparator;

public abstract class Product extends SubCategory implements Comparable<Product>{
    protected double price;
    protected String nameProduct;
    protected StatusProduct status;

    Product(Catalog mainCatalog,int id, String name,String nameSub, double price, String nameProduct, StatusProduct status){

        super(mainCatalog,id,name,nameSub);
        this.price = price;
        this.nameProduct = nameProduct;
        this.status = status;

    }

    public String getNameProduct(){
        return nameProduct;
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

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    public static final Comparator<Product> BY_NAMEProduct = Comparator.comparing(Product::getNameProduct);

    public static final Comparator<Product> BY_NAMEProduct_DESC = BY_NAMEProduct.reversed();

    public static final Comparator<Product> BY_ID_DESC = Comparator.comparingDouble(Product::getPrice).reversed();
}
