package homework_1;

public class Children_product extends Goods {
    private int minAge;
    private boolean hypoallergenic;

    public Children_product(String name, double price, double amount, String pc, int minAge, Boolean hypoallergenic) {
        super(name, price, amount, pc);
        this.hypoallergenic = hypoallergenic;
        this.minAge = 2;

    }

    public Children_product() {
        super("bear", 15, 3, "pc");
        this.hypoallergenic = false;
        this.minAge = 2;

    }

    @Override
    public String toString() {
        return String.format("%s\nminAge: %d\nhypoallergenic: %s", super.toString(), minAge, hypoallergenic,
                super.toString());
    }

}
