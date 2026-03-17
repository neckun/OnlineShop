public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Хлеб",100);
        Product product2 = new Product(2,"Каша",150);

        System.out.println(product1.getTitle());
        System.out.println(product2.getTitle());
    }
}