package OPPS;

public class Constructor_Ex {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(1, "Ranvijay");
        System.out.println(s2.rollno + " " + s2.name);
        System.out.println(s1.rollno + " " + s1.name);
        Student1 s3 = new Student1(s2);
        System.out.println(s3.rollno + " " + s3.name);
        
    }
}

class Student1{
    int rollno;
    String name;
    Student1(){
        rollno = 0;
        name = "Unknown";
    }
    
    Student1(int r, String n){
        rollno = r;
        name = n;
    }

    Student1(Student1 other){
        rollno = other.rollno;
        name = other.name;
    }

}

    
   
