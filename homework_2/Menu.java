package homework_2;

import java.util.Scanner;

import homework_2.Object_all_animal.Bird;
import homework_2.Object_all_animal.Cat;
import homework_2.Object_all_animal.Chicken;
import homework_2.Object_all_animal.Dog;
import homework_2.Object_all_animal.Strok;
import homework_2.Object_all_animal.Tiger;
import homework_2.Object_all_animal.Wolf;

public class Menu {

    /**
     * 
     * 
     * public static void viewConsole(Zoo arr) {
     * 
     * while (true) {
     * 
     * System.out.println(
     * "1 -Добавить животное\n2- Удалить животное по индексу\n3- Посмотреть
     * информацию о животном с номером i\n4- Заставить животное с номером i издать
     * звук\n5- Напечатать информацию о животных, которые есть на данный момент в
     * зоопарке\n6- Заставить всех животных, которые на данный момент есть в
     * зоопарке, издать звук ");
     * Scanner in = new Scanner(System.in);
     * System.out.print("Input a number: ");
     * int idx = in.nextInt();
     * switch (idx) {
     * case 1:
     * System.out.println(
     * "Выберите животное которое хотите добавить\n1 - Bird\n2- Cat\n3- Chicken\n5-
     * Tiger\n6- Wolf\n7- Dog\n8- Strok");
     * Integer ind = in.nextInt();
     * switch (ind) {
     * case 1:
     * arr.add(new Bird());
     * break;
     * case 2:
     * arr.add(new Cat());
     * break;
     * case 3:
     * arr.add(new Chicken());
     * break;
     * case 4:
     * arr.add(new Wolf());
     * break;
     * case 5:
     * arr.add(new Tiger());
     * break;
     * case 6:
     * arr.add(new Dog());
     * break;
     * case 7:
     * arr.add(new Strok());
     * break;
     * // menu(storage);
     * default:
     * break;
     * }
     * // case 2:
     * // System.out.println("Выберите животное, которое хотите удалить");
     * // int idxRemove = in.nextInt();
     * // arr.remove(idxRemove);
     * case 3:
     * System.out.println("Введите индекс нужного животного:\n");
     * int indx = in.nextInt();
     * arr.showAnimal(indx);
     * break;
     * 
     * // default:
     * // break;
     * 
     * }
     * }
     * 
     * }
     */

    public static void menu(Zoo arr) {
        while (true) {
            System.out.println(
                    "МЕНЮ\n1. Добавить новое животное\n2. Убрать животное\n3. Напечатать информацию о животном\n4. Напечатать инофрмацию о всех животных\n5. Заставить животное издать звук\n6. Заставить всех животных издать звук\n7. Выход");
            System.out.println("Введите нужный пункт меню:");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(
                            "Выберите нужный пункт:\n1. Cat\n2. Wolf\n3. Dog\n4. Tiger\n5. Chicken\n6. Stork\n7. Назад");
                    int x = in.nextInt();
                    switch (x) {
                        case 1:
                            arr.add(new Cat());
                            break;
                        case 2:
                            arr.add(new Wolf());
                            break;
                        case 3:
                            arr.add(new Dog());
                            break;
                        case 4:
                            arr.add(new Tiger());
                            break;
                        case 5:
                            arr.add(new Chicken());
                            break;
                        case 6:
                            arr.add(new Strok());
                            break;
                        // case 7:
                        // menu(storage);
                        // default:
                        // break;
                    }
                    break;
                case 2:
                    System.out.println("Введите индекс нужного животного:\n");
                    int idx = in.nextInt();
                    arr.remove(idx);
                    break;
                case 3:
                    System.out.println("Введите индекс нужного животного:\n");
                    int indx = in.nextInt();
                    arr.showAnimal(indx);
                    break;
                case 4:
                    arr.showAll();
                    break;
                case 5:
                    System.out.println("Введите индекс нужного животного:\n");
                    int index = in.nextInt();
                    arr.voice(index);
                    break;
                case 6:
                    arr.voiceAll();
                    break;
                case 7:
                    break;
                default:
                    menu(arr);
                    break;
            }
            if (choice == 7) {
                in.close();
                break;
            }
        }

    }

}
