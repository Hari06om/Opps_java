public class Abstract {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.eat();
        dg.walk();

        Chiken ck = new Chiken();

        ck.eat();
        ck.walk();

    }
}

abstract class Animal
{
    void eat(){
        System.out.println("Eats every animal");
    }
    
    abstract void walk();
}

class Dog extends Animal{
    void walk(){
        System.out.println("every animal walk ");

    }
}
class Chiken extends Animal{
    void walk(){
        System.out.println("Chiken walk on 2 legs ");

    }
}
