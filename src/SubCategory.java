public abstract class SubCategory extends Category{
    protected String subName;

    SubCategory(Catalog mainCatalog,int id,String name, String subName){

        super(mainCatalog,id,name);
        this.name = subName;

    }
}
