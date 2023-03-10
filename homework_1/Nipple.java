package homework_1;

public class Nipple extends Goods {
    public Nipple(String name, double price, double amount, String pc) {
        super(name, price, amount, pc);
    }

    public Nipple() {
        super("Соска", 0.2, 2, "шт");
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
