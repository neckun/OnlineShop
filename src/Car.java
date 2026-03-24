public class Car extends Product{

    private int power;

    Car(){};

    Car(int id, String title, double price, String nameProduct,int power){
        super(id,title,price,nameProduct);
        this.power = power;
    }

}
