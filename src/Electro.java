public class Electro extends Product{
    private int volt;

    Electro(){};

    Electro(int id, String title, double price, String nameProduct,int volt){
        super(id,title,price,nameProduct);
        this.volt = volt;

    }
}
