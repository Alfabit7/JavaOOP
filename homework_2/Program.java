package homework_2;

import java.text.Bidi;

import homework_2.Object_all_animal.Bird;
import homework_2.Object_all_animal.Cat;
import homework_2.Object_all_animal.Chicken;
import homework_2.Object_all_animal.Dog;
import homework_2.Object_all_animal.Strok;
import homework_2.Object_all_animal.Tiger;
import homework_2.Object_all_animal.Wolf;
import homework_2.Zoo;
import homework_2.Menu;

public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Menu.menu(zoo);

    }

}