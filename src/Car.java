public class Car extends Product{

    private int power;


    Car(Catalog mainCatalog,int id, String name,String subName, double price, String nameProduct,int power){
        super(mainCatalog,id,name,subName,price,nameProduct);
        this.power = power;
    }

    @Override
    public void showInfo() {
        System.out.println(power);
    }
}
