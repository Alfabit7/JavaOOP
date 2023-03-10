package homework_1;

public class Soda extends Drink {
    boolean isSoda;

    public Soda(String name, double price, double amount, String pc, double volume) {
        super(name, price, amount, pc, volume);
        this.isSoda = isSoda;
    }

    public Soda() {
        super("Soda", 15, 150, "шт", 330);
        this.isSoda = true;
    }

    @Override
    public String toString() {
        return String.format("%s\nisSoda: %s", super.toString(), isSoda);
    }
}
