import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog mainCatalog = new Catalog();
        ArrayList<Product> productList = new ArrayList<>();
        Client client = new Client("name",10000,-100);

        Category electroCategor = new Category(mainCatalog,0,"Electro");
        Category carCategor = new Category(mainCatalog,1,"Car");

        SubCategory homeElectroCategory = new SubCategory(electroCategor,"Home");
        SubCategory RussianCarCategory = new SubCategory(carCategor,"Russian Car");

        productList.add(ProductFactory.createProduct(TypeProduct.car,5000,"Oka",StatusProduct.BY,RussianCarCategory,200));
        productList.add(ProductFactory.createProduct(TypeProduct.car,5000,"Oka2",StatusProduct.BY,RussianCarCategory,200));
        productList.add(ProductFactory.createProduct(TypeProduct.car,5000,"Oka3",StatusProduct.BY,RussianCarCategory,200));

        productList.add(ProductFactory.createProduct(TypeProduct.electro,2000,"razetka",StatusProduct.New,homeElectroCategory,300));
        productList.add(ProductFactory.createProduct(TypeProduct.electro,2000,"razetka1",StatusProduct.New,homeElectroCategory,300));
        productList.add(ProductFactory.createProduct(TypeProduct.electro,2000,"razetka2",StatusProduct.New,homeElectroCategory,300));

        Menu menu = Menu.getInstance(productList,client);

        menu.run();
    }
}
/* TODO
    чек-лист:


 */