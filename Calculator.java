public class Calculator {
    public static void main(String[] args){
        Calculators cal = new Calculators();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.2,(float)2.3));
        System.out.println(cal.sum(1,2,3));
    }
}
class Calculators{
    int sum(int a,int b){
        return  a+b;
    }
    float sum(float a,float b){
        return  a+b;
    }
    int sum(int a,int b,int c ){
        return  a+b+c;
    }
}