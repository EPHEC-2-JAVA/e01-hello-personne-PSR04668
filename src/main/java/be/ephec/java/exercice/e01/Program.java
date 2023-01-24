package be.ephec.java.exercice.e01;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("Quel est votre nom ?");
        p1.lastName = sc.nextLine();
        System.out.println("Quel est votre prénom ?");
        p1.firstName = sc.nextLine();
        System.out.println("Quel est votre age ?");
        p1.age = sc.nextInt();
        p1.display();

    }
}
