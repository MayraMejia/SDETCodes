package Class24;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;


    public Cat(String name, String breed, int age, double weight) {

            setName(name);
            setBreed(breed);
            setAge(age);
            setWeight(weight);
        }


   public void setName(String name) {
        if (name.length() > 20) {
            System.out.println("Name can't be more than 20 letters. Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        } else {
            this.name = name;
        }

    }

    public void setBreed(String breed) {
        if (breed.length() > 20) {
            System.out.println("Breed can't be more than 20 letters. Please try again");
        } else if (breed.isEmpty()) {
            System.out.println("Breed can't be empty Please try again");
        } else {
            this.breed = breed;
        }

    }

    public void setAge(int age) {
        if (age > 21) {
            System.out.println("Please enter correct age ");
        } else {
            this.age = age;
        }
    }

   public  void setWeight(double weight) {
        if (weight > 100) {
            System.out.println("Please enter an accurate weight for a cat ");
        } else {

            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

   public  int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
    }


    public static void main(String[] args) {

    Cat mimi = new Cat("mimi","caca",24,65);
     mimi.printInfo();
    }

}