public class Electro extends Product{
    private int volt;

    Electro(Catalog mainCatalog,int id, String name,String subName, double price, String nameProduct,int volt){
        super(mainCatalog,id,name,subName,price,nameProduct);
        this.volt = volt;

    }

    @Override
    public String showInfo() {
        return Integer.toString(volt);
    }
}
