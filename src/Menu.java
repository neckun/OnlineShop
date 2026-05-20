import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Menu instance;
    private ArrayList<Product> productList;
    private Scanner scanner;
    private Client client;

    public Menu(){}

    private Menu(ArrayList<Product> productList, Client client) {

        this.productList = productList;
        this.client = client;
        this.scanner = new Scanner(System.in);
    }

    public static Menu getInstance(ArrayList<Product> productList, Client client) {
        if (instance == null){
            instance = new Menu(productList, client);
        }
        return instance;
    }

    public void run() {
        while (true) {
            showMainWindow();
            int choice = input();

            switch (choice) {
                case 1:
                    showCategories();
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    buyProduct();
                    break;
                case 4:
                    client.showHistory();
                    break;
                case 5:
                    repayCredit();
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    public int input() {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число.");
            scanner.next();
        }
        int c = scanner.nextInt();
        scanner.nextLine();
        return c;
    }

    private void showMainWindow() {
        System.out.println("\n--- Главное меню ---");
        System.out.println("1: Просмотреть категории");
        System.out.println("2: Просмотреть все товары");
        System.out.println("3: Купить товар");
        System.out.println("4: История операций");
        System.out.println("5: Погасить кредит");
        System.out.println("0: Выход");
        System.out.print("Ваш выбор: ");
    }

    private void showCategories() {
        System.out.println("\n--- Категории ---");
        ArrayList<String> categoryNames = new ArrayList<>();

        for (Product p : productList) {
            String name = p.subCategory.getSubName();
            if (!categoryNames.contains(name)) {
                System.out.println(name);
                categoryNames.add(name);
            }
        }
    }

    private void showAllProducts() {
        System.out.println("\n--- Список товаров ---");
        for (Product p : productList) {
            System.out.println(p.getNameProduct());
        }
    }

    private void buyProduct() {
        System.out.println("\n--- Покупка товара ---");
        if (productList.isEmpty()) {
            System.out.println("Товары отсутствуют.");
            return;
        }

        System.out.print("Введите точное название товара для покупки: ");
        String productName = scanner.nextLine();

        for (Product p : productList) {
            if (p.getNameProduct().equalsIgnoreCase(productName)) {
                if (client.buy(p)) {
                    System.out.println("Товар '" + p.getNameProduct() + "' успешно куплен за " + p.getPrice());
                } else {
                    System.out.println("Недостаточно средств для покупки товара '" + p.getNameProduct() + "'.");
                }
                return;
            }
        }
        System.out.println("Товар с названием '" + productName + "' не найден.");
    }

    private void repayCredit() {
        System.out.println("\n--- Погашение кредита ---");
        System.out.print("Введите сумму для погашения кредита: ");

        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount > 0) {
                client.repayCredit(amount);
                System.out.println("Погашено: " + amount);
            } else {
                System.out.println("Сумма должна быть положительной.");
            }
        } else {
            System.out.println("Неверный ввод. Введите число.");
            scanner.next();
        }
    }
}