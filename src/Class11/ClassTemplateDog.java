package Class11;
public class ClassTemplateDog {
    // State
// attributes/ properties/ fields
    String name;
    String color;
    String breed;
    double weight;
    int age;
    // These are the behaviours of a dog
// Methods functions
    void bark() {
        System.out.println("Barking..........");
    }
    void sleep() {
        System.out.println("Dog is sleeping.......");
    }
    public static void main(String[] args) {
// creating objects from a  class
//new Dog();=> it creates an object of class Dog
        ClassTemplateDog dog1= new ClassTemplateDog();
// calling a behaviour on an object
        dog1.bark();
        dog1.sleep();
    }
}