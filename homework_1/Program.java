package homework_1;

/**
 * pProgram
 */
public class Program {
    public static void main(String[] args) {
        Drink drink = new Drink();
        Foods food = new Foods();
        Hygiene hygiene = new Hygiene("Napkins", 10, 30, "pc", 10);
        Children_product children = new Children_product();
        Milk milk = new Milk();
        Soda soda = new Soda();
        Bread bread = new Bread();
        Egg egg = new Egg();
        Face_mask mask = new Face_mask();
        Toilet_paper paper = new Toilet_paper();
        Diaper diaper = new Diaper();
        Nipple nipple = new Nipple();
        outputInfo(food);
        outputInfo(drink);
        outputInfo(hygiene);
        outputInfo(children);
        outputInfo(milk);
        outputInfo(soda);
        outputInfo(bread);
        outputInfo(egg);
        outputInfo(mask);
        outputInfo(paper);
        outputInfo(diaper);
        outputInfo(nipple);

    }

    public static void outputInfo(Object obj) {
        System.out.println(obj);
        System.out.println("------------");

    }

}