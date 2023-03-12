package homework_2;

import homework_2.Object_all_animal.Cat;
import homework_2.Object_all_animal.Dog;

public class Program {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat.sound();
        cat.cuddle();
        System.out.println("-----------");
        Dog dog = new Dog();
        System.out.println(dog);
        dog.cuddle();
        dog.sound();

    }
}