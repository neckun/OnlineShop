import java.util.ArrayList;
import java.util.Date;

public class Client {
    private double debitBalance;
    private double creditLimit;
    private ArrayList<Operation> history;


    public Client(double initialDebit, double creditLimit) {
        this.debitBalance = initialDebit;
        this.creditLimit = creditLimit;
        this.history = new ArrayList<>();
    }


    public double getDebitBalance() {
        return debitBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public boolean buy(Product product) {
        double price = product.getPrice();

        if (price <= 0) {
            System.out.println("Ошибка: Цена товара должна быть положительной.");
            return false;
        }

        if (debitBalance >= price) {
            debitBalance -= price;
            addToHistory("Покупка", -price);
            System.out.println("Оплата произведена с дебетового счета.");
            return true;
        } else if (canSpendFromCredit(price)) {
            double amountFromDebit = debitBalance;
            double amountFromCredit = price - amountFromDebit;

            debitBalance = 0;
            creditLimit -= amountFromCredit;

            addToHistory("Покупка (дебет)", -amountFromDebit);
            addToHistory("Покупка (кредит)", -amountFromCredit);
            System.out.println("Оплата: " + amountFromDebit + " с дебета и " + amountFromCredit + " с кредита.");
            return true;
        } else {
            System.out.println("Недостаточно средств на дебетовом и кредитном счетах.");
            return false;
        }
    }

    private boolean canSpendFromCredit(double price) {
        return (debitBalance + Math.abs(creditLimit)) >= price;
    }

    public void repayCredit(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для погашения должна быть положительной.");
            return;
        }

        double currentDebt = Math.abs(creditLimit);

        if (amount <= currentDebt) {

            creditLimit += amount;
        } else {

            double leftover = amount - currentDebt;
            creditLimit = 0;
            debitBalance += leftover;
            addToHistory("Пополнение (дебет)", leftover);
        }
        addToHistory("Погашение кредита", amount);
        System.out.println("Кредит погашен на сумму: " + amount);
    }

    public void showHistory() {
        System.out.println("\n--- История операций ---");
        if (history.isEmpty()) {
            System.out.println("История операций пуста.");
        } else {
            for (Operation op : history) {
                System.out.println(op);
            }
        }
    }

    private void addToHistory(String type, double amount) {
        history.add(new Operation(type, amount, new Date()));
    }
}