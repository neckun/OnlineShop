public class ProductFactory {
    public static Product createProduct(TypeProduct type, double price, String nameProduct, StatusProduct status, SubCategory subCategory, int addPar) {
        switch (type) {
            case TypeProduct.car:
                return new Car(price, nameProduct, status, subCategory,addPar);
            case TypeProduct.electro:
                return new Electro(price, nameProduct, status, subCategory,addPar);
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}