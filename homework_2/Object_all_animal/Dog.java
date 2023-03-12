package homework_2.Object_all_animal;

import java.time.LocalDate;

import homework_2.*;

public class Dog extends Pet {

    public Dog(double height, double weight, String colorEye, String name, String breed, Boolean vaccien,
            String colorWool,
            LocalDate dateOfBirth) {
        super(height, weight, colorEye, name, breed, vaccien, colorWool, dateOfBirth);
    }

    public Dog() {
        super(40, 12, "Черные", "Мухтар", "Овчарака", true, "black", LocalDate.now());
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он гавкает");
    }

}
