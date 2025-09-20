public class overriding {
    public static void main(String[] args){
        Deer dr = new Deer();
        dr.eat();
        

    }
}

class Animal{
    void eat(){
        System.out.print("Eat anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.print("Eat grass");
    }
}
