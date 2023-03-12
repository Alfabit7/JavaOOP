package homework_2;

import homework_2.Interfaces.Make_sound;

public abstract class Animal implements Make_sound {
    protected double height;
    protected double weight;
    protected String colorEye;

    public Animal(double height, double weight, String colorEye) {
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }

    public void sound() {
        this.makeSound(null);
    }

    @Override
    public String toString() {
        return String.format("Животное: %s\nheight: %.2f\nweight: %.2f\ncolorEye: %s", this.getClass().getSimpleName(),
                height, weight, colorEye);
    }

}
