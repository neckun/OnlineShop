public class Main {
    public static void main(String[] args) {
        Catalog mainCatalog = new Catalog();

        Car car1 = new Car(mainCatalog,0,"Cars","RusCar",5000,"Oka",200);
        Car car2 = new Car(mainCatalog,1,"Cars","RusCar",5000,"Oka",200);
        Car car3 = new Car(mainCatalog,2,"Cars","RusCar",5000,"Oka",200);

        Electro electro1 = new Electro(mainCatalog,3,"Electro","home",2000,"razetka",300);
        Electro electro2 = new Electro(mainCatalog,4,"Electro","home",2000,"razetka1",300);
        Electro electro3 = new Electro(mainCatalog,5,"Electro","home",2000,"razetka2",300);

        mainCatalog.showCategory();
    }
}

/*
TODO:
 Добавить SubCategory. Два метода, абстракные, addCategory и ShowCategory.
 Создать класс Catalog (хранит список основных категорий.
 Добавить два счётчика, один - кол-во главных категорий, второй - кол-во саб-категорий
 */