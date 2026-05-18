public class Electro extends Product{
    private int volt;

    Electro(double price, String nameProduct,StatusProduct status,SubCategory subCategory,int volt){
        super(price,nameProduct,status,subCategory);
        this.volt = volt;

    }

    @Override
    public String showInfo() {
        return Integer.toString(volt);
    }
}
