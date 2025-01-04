class Example_static_variable {
    static int a = 10;

    Example_static_variable(){
        a++;
        System.out.println(a);
    }
    
}

class Example_static_Method_main {
    static void show(){
        System.out.println("Hello World");
    }
}

class Example_static_block {
    static int  count;
    static{
        count = 10;
        System.out.println(count);
        System.out.println("Static block is called");
    }
}
public class Static_keyword {
    

    public static void main(String[] args) {
        // Static keyword in Java
        // Static keyword is used for memory management mainly.
        // It is used to create a single copy of a variable or method that belongs to a class
        // The static keyword is used in the declaration of a method, variable, or a block and nested class.

        // Static variable
        Example_static_variable obj1 =new Example_static_variable();
    }
}
