
package homework_1;

public class Hygiene extends Goods {
    int quantytiInPackage;

    public Hygiene(String name, double price, double amount, String pc, int quantytiInPackage) {
        super(name, price, amount, pc);
        this.quantytiInPackage = quantytiInPackage;
    }

    public Hygiene() {
        super("Napkins", 10, 30, "pc");
        this.quantytiInPackage = 10;
    }

    @Override
    public String toString() {
        return String.format("%s\nquantytiInPackage: %d", super.toString(), quantytiInPackage);
    }

}