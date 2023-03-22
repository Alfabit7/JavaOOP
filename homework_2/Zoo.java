package homework_2;

import java.util.ArrayList;
import java.util.List;
import homework_2.Interfaces.Make_sound;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void add(Animal item) {
        this.animals.add(item);
    }

    public void remove(int idxRemove) {
        this.animals.remove(idxRemove);
    }

    public void showAnimal(int index) {
        System.out.println(this.animals.get(index));
    }

    public void showAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void voice(int index) {
        this.animals.get(index).sound();
    }

    public void voiceAll() {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

}