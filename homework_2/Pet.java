package homework_2;

import java.time.LocalDate;

import homework_2.Interfaces.Make_sound;

public abstract class Pet extends Animal implements Make_sound {
    String name;
    String breed; // порода
    boolean vaccien;
    String colorWool; // цвет шерсти
    LocalDate dateOfBirth;

    public Pet(double height, double weight, String colorEye, String name, String breed, boolean vaccien,
            String colorWool, LocalDate dateOfBirth) {
        super(height, weight, colorEye);
        this.name = name;
        this.breed = breed;
        this.vaccien = vaccien;
        this.colorWool = colorWool;
        this.dateOfBirth = dateOfBirth;
    }

    // прижиматься
    public void cuddle() {
        System.out.println(this.getClass().getSimpleName() + " Прижимается )");
    }

    @Override
    public void makeSound(Animal target) {
        this.makeSound(target);
    }

    @Override
    public String toString() {
        return String.format("%s\nname: %s\nbreed: %s\nvaccien: %b\ncolorWool: %s\ndateOfBirth: %s", super.toString(),
                name, breed, vaccien, colorWool, dateOfBirth);
    }

}
