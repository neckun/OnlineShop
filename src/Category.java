public abstract class Category{
    protected int id;
    protected String name;

    Category(Catalog mainCatalog,int id,String name){

        mainCatalog.addCategory(this);
        this.id = id;
        this.name = name;

    }
}
