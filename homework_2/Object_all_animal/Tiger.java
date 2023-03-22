package homework_2.Object_all_animal;

import java.time.LocalDate;

import homework_2.Animal;
import homework_2.Wild_animal;

public class Tiger extends Wild_animal {

    public Tiger(double height, double weight, String colorEye, String habitat, LocalDate dateOfLocation) {
        super(height, weight, colorEye, habitat, dateOfLocation);

    }

    public Tiger() {
        super(120, 50, "green", "Дальневосточный Федерельный округ", LocalDate.now().minusDays(100));
    }

    @Override
    public void makeSound(Animal target) {
        System.out.println("это " + this.getClass().getSimpleName() + " и он рычит");
    }

}
