
public class InheritanceDemo {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
        shark.color = "Gray";
        shark.fins = 2;
        System.out.println("Shark color: " + shark.color);
        System.out.println("Shark fins: " + shark.fins);
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

class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swims in water");
    }
}