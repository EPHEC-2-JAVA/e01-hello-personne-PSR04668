package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {

    private int base;
    private String nbr;
    private Scanner sc = new Scanner(System.in);


    public void ToBase() {
        do {
            System.out.println("Entrer un nombre : ");
            nbr = sc.next();
            System.out.println("Entrer une base : ");
            base = sc.nextInt();
            if (!nbr.equals("0") && base != 0) {
                System.out.println(Integer.parseInt(nbr, base));
            }


        } while (!nbr.equals("0") && base != 0);
    }


}


