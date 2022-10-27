package Class11;

public class ClassTemplatePerson {
    String name;
    int age;
    double weight;
    boolean isFunny;
    double height;
    boolean losingHairs;
    void study() {
        if(name.equals("Anna")) {
            System.out.println("I study hard");
        }else if(name.equals("Roman")) {
            System.out.println("I will keep on deleting the messages and will not let any one study");
        }else {
            System.out.println("i try to study but things don't make much sense");
        }
    }
    public static void main(String[] args) {
        ClassTemplatePerson person1=new ClassTemplatePerson();
        person1.name="Roman";
        person1.study();
        System.out.println("***********");
        ClassTemplatePerson person2=new ClassTemplatePerson();
        person2.name="Yusuf";
        person2.study();
    }
}