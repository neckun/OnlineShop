import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog mainCatalog = new Catalog();
        ArrayList<Product> productList = new ArrayList<>();
        Menu menu = new Menu(productList);



        Car car1 = new Car(mainCatalog,0,"Cars","RusCar",5000,"Oka",StatusProduct.BY,200);
        Car car2 = new Car(mainCatalog,1,"Cars","RusCar",5000,"Oka2",StatusProduct.BY,200);
        Car car3 = new Car(mainCatalog,2,"Cars","RusCar",5000,"Oka3",StatusProduct.BY,200);

        Electro electro1 = new Electro(mainCatalog,3,"Electro","home",2000,"razetka",StatusProduct.New,300);
        Electro electro2 = new Electro(mainCatalog,4,"Electro","home",2000,"razetka1",StatusProduct.New,300);
        Electro electro3 = new Electro(mainCatalog,5,"Electro","home",2000,"razetka2",StatusProduct.New,300);

        car1.addArrayProduct(productList);
        car2.addArrayProduct(productList);
        car3.addArrayProduct(productList);

        electro1.addArrayProduct(productList);
        electro2.addArrayProduct(productList);
        electro3.addArrayProduct(productList);



        Formater formatter = (text, value) -> text + " : " + value;

        productList.forEach(p -> System.out.println(formatter.format(p.nameProduct,p.id)));

        menu.showMainWindow();


        while (true){

            int c = menu.Input();

            switch (c){
                case 1:
                    menu.showCategory();
                    break;
                case 2:
                    menu.showProductOnCategory();
                    break;
            }

            break;

        }


    }
}
/* TODO
    Добавить в проект enum +
    добавить функц. интерфейс (создать свой)
    Разработать коллеции +
    в main вызвать абстракнтый метод через лямбду +
 */