package be.ephec.java.exercice.e03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle test = new Triangle();
        System.out.println("Veuillez encoder un chiffre");
        test.nombre = sc.nextInt();
        int [][] triangle = test.triangle(test.nombre);
        for (int [] i : triangle){
            for (int  j : i) {
                if(j > 0)

                    System.out.print(j + "");
            }
            System.out.println();
        }

    }
}
