
public class InheritanceDemo {
    public static void main(String[] args) {
      Dog dobby = new Dog();
      dobby.legs =4;
      System.out.print(dobby.legs);
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


class Mammals extends Animal{
    int legs;
}

class  Dog extends Mammals{
    String breed;
}
