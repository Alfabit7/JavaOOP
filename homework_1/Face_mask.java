package homework_1;

public class Face_mask extends Goods {
    String sizeMask;

    public Face_mask(String name, double price, double amount, String pc) {
        super(name, price, amount, pc);
        this.sizeMask = sizeMask;
    }

    public Face_mask() {
        super("Маска", 0.5, 1, "шт");
        this.sizeMask = "Small";
    }

    @Override
    public String toString() {
        return String.format("%s\nsizeMask: %s", super.toString(), sizeMask);

    }

}
