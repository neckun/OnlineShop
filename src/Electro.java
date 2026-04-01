public class Electro extends Product{
    private int volt;

    Electro(Catalog mainCatalog,int id, String name,String subName, double price, String nameProduct,int volt){
        super(mainCatalog,id,name,subName,price,nameProduct);
        this.volt = volt;

    }

    @Override
    public void showInfo() {
        System.out.println(volt);
    }
}
