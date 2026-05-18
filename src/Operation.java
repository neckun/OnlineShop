import java.util.Date;

public class Operation {
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount, Date date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {

        String sumColor = (amount < 0) ? "\u001B[31m" : "\u001B[32m";
        String resetColor = "\u001B[0m";

        return String.format("%s | %s | Сумма: %s%.2f%s",
                date.toString(),
                type,
                sumColor,
                Math.abs(amount),
                resetColor);
    }
}