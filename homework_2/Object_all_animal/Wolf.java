package homework_2.Object_all_animal;

import java.time.LocalDate;

import homework_2.Animal;
import homework_2.Wild_animal;

public class Wolf extends Wild_animal {
    boolean leader;

    public Wolf(double height, double weight, String colorEye, String habitat, LocalDate dateOfLocation,
            boolean leader) {
        super(height, weight, colorEye, habitat, dateOfLocation);
        this.leader = leader;
    }

    public Wolf() {
        super(90, 30, "gray", "Лес", LocalDate.now().minusMonths(17));
        this.leader = true;
    }

    @Override
    public String toString() {
        return String.format("%s\nleader: %s", super.toString(), leader);
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он воет");
    }

}
