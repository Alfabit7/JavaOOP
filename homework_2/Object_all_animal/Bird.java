package homework_2.Object_all_animal;

import homework_2.Animal;

public class Bird extends Animal {
    private double flightAltitude; // Высота полета

    public Bird(double height, double weight, String colorEye, double flightAltitude) {
        super(height, weight, colorEye);
        this.flightAltitude = flightAltitude;
    }

    public Bird() {
        super(0.5, 2, "blue");
        this.flightAltitude = 15;
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и она чирикает");
    }

    public void displasFlightAltitude() {
        System.out.println("Высота полета: " + this.flightAltitude + " метров");
    }

}
