import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog mainCatalog = new Catalog();
        ArrayList<Product> productList = new ArrayList<>();
        Client client = new Client(10000,-100);

        Category electroCategor = new Category(mainCatalog,0,"Electro");
        Category carCategor = new Category(mainCatalog,1,"Car");

        SubCategory homeElectroCategory = new SubCategory(electroCategor,"Home");
        SubCategory RussianCarCategory = new SubCategory(carCategor,"Russian Car");

        Car car1 = new Car(5000,"Oka",StatusProduct.BY,RussianCarCategory,200);
        Car car2 = new Car(5000,"Oka2",StatusProduct.BY,RussianCarCategory,200);
        Car car3 = new Car(5000,"Oka3",StatusProduct.BY,RussianCarCategory,200);

        Electro electro1 = new Electro(2000,"razetka",StatusProduct.New,homeElectroCategory,300);
        Electro electro2 = new Electro(2000,"razetka1",StatusProduct.New,homeElectroCategory,300);
        Electro electro3 = new Electro(2000,"razetka2",StatusProduct.New,homeElectroCategory,300);

        car1.addArrayProduct(productList);
        car2.addArrayProduct(productList);
        car3.addArrayProduct(productList);

        electro1.addArrayProduct(productList);
        electro2.addArrayProduct(productList);
        electro3.addArrayProduct(productList);



        Menu menu = new Menu(productList, client);

        menu.run();


    }
}
/* TODO
    чек-лист:
    Метод покупки товаров
    История покупок и финансовых операций (дата и время операции)
    функция возврата кредита
    соотвствие принципов SOLID
    1 имитебил объект
 */