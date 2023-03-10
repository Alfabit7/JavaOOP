package homework_1;

import java.time.LocalDate;

public class Foods extends Goods {

    private LocalDate EXP;// expiration срок годности

    public Foods(String name, double price, double amount, String pc, LocalDate EXP) {
        super(name, price, amount, pc);
        this.EXP = EXP;
    }

    public Foods() {
        super("product_name", 10, 10, "pc");
        this.EXP = LocalDate.now().plusDays(3);
    }

    @Override
    public String toString() {
        return String.format("%s\nEXP: %s", super.toString(), EXP);

    }

}
