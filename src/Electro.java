public class Electro extends Product{
    private int volt;

    Electro(Catalog mainCatalog,int id, String name,String subName, double price, String nameProduct, StatusProduct status,int volt){
        super(mainCatalog,id,name,subName,price,nameProduct, status);
        this.volt = volt;

    }

    @Override
    public String showInfo() {
        return Integer.toString(volt);
    }
}
