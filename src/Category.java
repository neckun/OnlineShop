import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Category{
    protected int id;
    protected String name;
    private List<SubCategory> listSubsCategor = new ArrayList<>();

    Category(Catalog mainCatalog,int id,String name){

        this.id = id;
        this.name = name;
        mainCatalog.addCategory(this);

    }

    public String getCategoryName(){
        return name;
    }

    public void AddSubCategory(SubCategory o){
        listSubsCategor.add(o);
    }

    public int getId() {
        return id;
    }
}
