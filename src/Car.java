public class Car extends Product{

    private int power;


    Car(Catalog mainCatalog,int id, String name,String subName, double price, String nameProduct,StatusProduct status,int power){
        super(mainCatalog,id,name,subName,price,nameProduct,status);
        this.power = power;
    }

    @Override
    public String showInfo() {
        return Integer.toString(power);
    }
}
