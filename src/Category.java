import java.util.Comparator;

public abstract class Category{
    protected int id;
    protected String name;

    Category(Catalog mainCatalog,int id,String name){

        this.id = id;
        this.name = name;
        mainCatalog.addCategory(this);

    }

    public String getCategoryName(){
        return name;
    }

    public int getId() {
        return id;
    }
}
