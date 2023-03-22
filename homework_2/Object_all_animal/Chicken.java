package homework_2.Object_all_animal;

import homework_2.Animal;

/**
 * Chicken
 */
public class Chicken extends Bird {
    public Chicken(double height, double weight, String colorEye, double flightAltitude) {
        super(height, weight, colorEye, flightAltitude);
    }

    public Chicken() {
        super(0.3, 2.2, "white", 0.5);

    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и она кудахтает");
    }

}