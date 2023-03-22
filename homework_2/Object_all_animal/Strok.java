package homework_2.Object_all_animal;

import homework_2.Animal;

// аист
public class Strok extends Bird {

    public Strok(double height, double weight, String colorEye, double flightAltitude) {
        super(height, weight, colorEye, flightAltitude);
    }

    public Strok() {
        super(1.2, 20, "white", 25);
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он громко трещит");
    }
}
