package Opps.Access_Modifire;
public class opps {
     public static void main(String[] args) {
         Pen p1 = new Pen();
          p1.setcolor("Blue");
           p1.settip(5); System.out.println("Pen color: " + p1.color);
            System.out.println("Pen tip: " + p1.tip); 
        }
     
    }
     class Pen { 
        String color;
         int tip;
          void setcolor(String newColor) {
             color = newColor;
             } 
            void settip(int newTip) { 
                tip = newTip;
             }
           
            }
           




