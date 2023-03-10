package homework_1;

public class Egg extends Hygiene {
    public Egg(String name, double price, double amount, String pc, int quantytiInPackage) {
        super(name, price, amount, pc, quantytiInPackage);
    }

    public Egg() {
        super("Яйца", 2, 1, "шт", 30);
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
