package homework_2.Object_all_animal;

import java.sql.Date;
import java.time.LocalDate;

import homework_2.Animal;
import homework_2.Pet;

public class Cat extends Pet {
    boolean wool;

    public Cat(double height, double weight, String colorEye, String name, String breed, boolean vaccien,
            String colorWool, LocalDate dateOfBirth, boolean wool) {
        super(height, weight, colorEye, name, breed, vaccien, colorWool, dateOfBirth, wool);
        this.wool = wool;
    }

    public Cat() {
        super(30, 7, "green", "Барсик", "Вислоухий", true, "gray", LocalDate.now(), true);
    }

    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он мяукает");
    }

}