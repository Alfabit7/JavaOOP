package homework_1;
// import javax.print.DocFlavor.STRING;

// import javax.print.attribute.standard.MediaSize.Other;

public class Goods {
    protected String name;
    protected double price;
    protected double amount;
    protected String pc;

    public Goods(String name, double price, double amount, String pc) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.pc = pc;
    }

    public Goods() {
        this.name = "Product_name";
        this.price = 10.0;
        this.amount = 1.0;
        this.pc = "PC";
    }

    @Override
    public String toString() {
        return String.format("name: %s\nprice: %.2f\namount: %.2f\npc: %s", name, price, amount, pc);

    }
    // Goods.getClass.getSimpleName(),
}
