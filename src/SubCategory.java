import java.util.ArrayList;
import java.util.List;

public class SubCategory {
    protected String subName;
    private List<Product> productList = new ArrayList<>();

    SubCategory(Category mainCategory, String subName){

        this.subName = subName;
        mainCategory.AddSubCategory(this);
    }

    public void addProduct(Product o){
        productList.add(o);
    }

    public String getSubName(){
        return  subName;
    }
}
