//NOTE - // Inheritance is the process by which one object can inherit the properties, methods, and behavior of another object.
//OBJECT: A class is a blueprint for creating objects, which are instances of that class. An object is a specific instance of a class, and it has its own unique state and behavior.
public class Inheritance {
    public static class Animal{
        public void eat(){
            System.out.println("Eating...");
        }
    }

    public static class Dog extends Animal{
        public void bark(){
            System.out.println("Barking...");
        }
    } 
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        
    }
}
