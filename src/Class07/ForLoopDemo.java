package Class07;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
        System.out.println(" -------------------------- ");
// print numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" -------------------------- ");
// print numbers from 30 to 10
        for(int i=30; i>=10; i--) {
            System.out.print(i+" ");
        }
        System.out.println(" -------------------------- ");
//what is the output
        for(int i=0; i<=10; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println(" -------------------------- ");
//what is the output
        for(int i=10; i<=25; i+=5) {
            System.out.print(i+" ");
        }
        System.out.println(" -------------------------- ");
//what is the output
        int sum=0;
        for(int i=1; i<=6; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
