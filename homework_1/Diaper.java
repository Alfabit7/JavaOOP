package homework_1;

public class Diaper extends Bread {
    int size, minWeight, maxWeight;

    public Diaper(String name, double price, double amount, String pc, String type) {
        super(name, price, amount, pc, type);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Diaper() {
        super("Подгузники", 3, 1, "шт", "Детские");
        this.minWeight = 10;
        this.maxWeight = 30;
    }

    @Override
    public String toString() {
        return String.format("%s\nminWeight: %d\nmaxWeight: %d", super.toString(), minWeight, maxWeight);
    }

}
