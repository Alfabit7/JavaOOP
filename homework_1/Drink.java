package homework_1;

public class Drink extends Goods {
    protected double volume;

    public Drink(String name, double price, double amount, String pc, double volume) {
        super(name, price, amount, pc);
        this.volume = volume;
    }

    public Drink() {
        super("fanta", 0.5, 10, "ml");
        this.volume = 330;
    }

    @Override
    public String toString() {
        return String.format("%s\nvolume: %.2f", super.toString(), volume);
    }

}
