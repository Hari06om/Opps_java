public class hierarchial {
    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.color = "Brown";
        System.out.println("Mammal:");
        dog.eat();
        dog.breath();
        dog.walk();
        System.out.println("\nColor: " + dog.color);

        Fish goldfish = new Fish();
        goldfish.color = "Gold";
        System.out.println("\n\nFish:");
        goldfish.eat();
        goldfish.breath();
        goldfish.swim();
        System.out.println("\nColor: " + goldfish.color);

        Bird sparrow = new Bird();
        sparrow.color = "Grey";
        System.out.println("\n\nBird:");
        sparrow.eat();
        sparrow.breath();
        sparrow.fly();
        System.out.println("\nColor: " + sparrow.color);
    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("Eats");
    }
    void breath() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.print("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.print("Swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.print("Fly");
    }
}
