package homework_2.Object_all_animal;

import java.time.LocalDate;

import homework_2.*;

public class Dog extends Pet {
    private boolean dogTraining;

    public Dog(double height, double weight, String colorEye, String name, String breed, Boolean vaccien,
            String colorWool,
            LocalDate dateOfBirth, boolean dogTraining) {
        super(height, weight, colorEye, name, breed, vaccien, colorWool, dateOfBirth);
        this.dogTraining = dogTraining;
    }

    public Dog() {
        super(40, 12, "Черные", "Мухтар", "Овчарка", true, "black", LocalDate.now().minusMonths(32));
        this.dogTraining = true;
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он гавкает");
    }

    @Override
    public String toString() {
        return String.format("%s\ndogTraining: %s", super.toString(), dogTraining);
    }

    public void workout() {
        System.out.println("Идет дрессировка");
    }

}
