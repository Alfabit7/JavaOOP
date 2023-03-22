package homework_2;

import java.time.LocalDate;

public abstract class Wild_animal extends Animal {
    String habitat;// среда битания
    LocalDate dateOfLocation;

    public Wild_animal(double height, double weight, String colorEye, String habitat, LocalDate dateOfLocation) {
        super(height, weight, colorEye);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }

    @Override
    public void makeSound(Animal target) {
        this.makeSound(target);
    }

    @Override
    public String toString() {
        return String.format("%s\nhabitat: %s\ndateOfLocation: %s", super.toString(), habitat, dateOfLocation);
    }

}
