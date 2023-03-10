package homework_1;

public class Toilet_paper extends Goods {
    int layers;

    public Toilet_paper(String name, double price, double amount, String pc) {
        super(name, price, amount, pc);
        this.layers = layers;
    }

    public Toilet_paper() {
        super("Туалетная бумага", 0.2, 1, "шт");
        this.layers = 3;
    }

    @Override
    public String toString() {
        return String.format("%s\nlayers: %s", super.toString(), layers);
    }
}
