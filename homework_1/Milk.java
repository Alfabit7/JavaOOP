package homework_1;

import java.time.LocalDate;

public class Milk extends Foods {
    double fatness;

    public Milk(String name, double price, double amount, String pc, LocalDate EXP) {
        super(name, price, amount, pc, EXP);
        this.fatness = fatness;
    }

    public Milk() {
        super("Молоко", 15, 10, "шт", LocalDate.now().plusDays(3));
        this.fatness = 4;
    }

    @Override
    public String toString() {
        return String.format("%s\nfatness: %.2f", super.toString(), fatness);
    }

}
