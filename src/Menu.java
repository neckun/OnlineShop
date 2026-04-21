import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Product> productList;
    private Scanner scanner = new Scanner(System.in);


    Menu(ArrayList<Product> productList){
        this.productList = productList;
    }

    public void showMainWindow(){
        System.out.println("1: Категории");
        System.out.println("2: Товары");
    }

    public void showProductOnCategory(){
        for (Product o : productList){
            System.out.println(o.nameProduct + " " + o.getCategoryName() + " " + o.price + " " + o.showInfo());
        }
    }

    public void showCategory(){
        ArrayList<String> CategoryNames = new ArrayList<>();

        for(Product o : productList){
            if(!CategoryNames.contains(o.getCategoryName())) {
                System.out.println(o.getCategoryName());
                CategoryNames.add(o.getCategoryName());
            }
        }
    }

    public int Input(){
        int c = scanner.nextInt();
        scanner.nextLine();
        return c;
    }
}
