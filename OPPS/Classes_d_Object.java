package OPPS;

public class Classes_d_Object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setPrice(10);
        System.out.println(p1.getColor() + " " + p1.getPrice());

        Student s1 = new Student();
        s1.grno = 1;
        s1.name = "Ranvijay";
        s1.ErNo = 1;
        s1.age = 20;
        s1.display();
    }
}

class Pen{
    private  String color;
   private int price;

     String getColor(){
        return this.color;
     }
     int getPrice(){
        return this.price;
     }
    void setColor(String newcolor){
        color=newcolor;
    }
    void setPrice(int newprice){
        price = newprice;
    }
}


class Student {
    int grno;
    String name;
    int ErNo;
    int age ;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Grno: "+grno);
        System.out.println("ErNo: "+ErNo);
        System.out.println("Age: "+age);
    }
}