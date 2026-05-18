public class Car extends Product{

    private int power;


    Car(double price, String nameProduct,StatusProduct status,SubCategory subCategory,int power){
        super(price,nameProduct,status,subCategory);
        this.power = power;
    }

    @Override
    public String showInfo() {
        return Integer.toString(power);
    }
}
