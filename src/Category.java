import java.util.Comparator;

public abstract class Category implements Comparable<Category>{
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

    @Override
    public int compareTo(Category other) {
        return this.name.compareTo(other.name);
    }

    public static final Comparator<Category> BY_NAME = Comparator.comparing(Category::getCategoryName);

    public static final Comparator<Category> BY_NAME_DESC = BY_NAME.reversed();

    public static final Comparator<Category> BY_ID_DESC = Comparator.comparingInt(Category::getId).reversed();

}
