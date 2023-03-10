package homework_1;

public class Bread extends Goods {
    private String type;

    public Bread(String name, double price, double amount, String pc, String type) {
        super(name, price, amount, pc);
        this.type = type;
    }

    public Bread() {
        super("Мука", 3, 20, "кг");
        this.type = "Пшеничная";

    }

    @Override
    public String toString() {
        return String.format("%s\ntype: %s", super.toString(), type);
    }

}
