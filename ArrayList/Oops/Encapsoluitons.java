// public package Oops;/

class Encapsoluitons {
 public static class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // changed return type to void
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // changed return type to void
        this.name = name;
    }
}
   
    
    public static void main(String[] args) {
        System.out.println("Encapsulation Concepts");
        //NOTE - // Encapsulation is the process of hiding the implementation details of an object from the outside world and only exposing the necessary information through public methods.

        Person p = new Person();
         p.setAge(20);
        p.setName("Ranvijay");
       
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
        

    }
}

    // package Oops;
    
    
