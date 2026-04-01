import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog mainCatalog = new Catalog();
        ArrayList<Product> productList = new ArrayList<>();

        Car car1 = new Car(mainCatalog,0,"Cars","RusCar",5000,"Oka",200);
        Car car2 = new Car(mainCatalog,1,"Cars","RusCar",5000,"Oka",200);
        Car car3 = new Car(mainCatalog,2,"Cars","RusCar",5000,"Oka",200);

        Electro electro1 = new Electro(mainCatalog,3,"Electro","home",2000,"razetka",300);
        Electro electro2 = new Electro(mainCatalog,4,"Electro","home",2000,"razetka1",300);
        Electro electro3 = new Electro(mainCatalog,5,"Electro","home",2000,"razetka2",300);

        mainCatalog.showCategory();

        car1.addArrayProduct(productList);
        car2.addArrayProduct(productList);
        car3.addArrayProduct(productList);

        electro1.addArrayProduct(productList);
        electro2.addArrayProduct(productList);
        electro3.addArrayProduct(productList);

        for(Product o : productList){
            o.showInfo();
        }

    }
}

/*
TODO:
 в product - showInfo abstract;
 во все наследники написать ShowInfo;
 созданные объекты добавить в список
 добавить метод AddProduct и загрузить в список
 Вывести список объектов
 */