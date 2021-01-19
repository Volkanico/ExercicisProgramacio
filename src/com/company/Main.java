package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        boolean exit = false;

        System.out.println("Introdueix un text nou: ");
        System.out.println("Llegeix el text escrit: ");
        System.out.println("Compta el numero de lletres: ");
        System.out.println("Compta el numero de paraules: ");
        System.out.println("Numero d'aparicions per caracter: ");
        System.out.println("El caracter mes repetit i el numero d’aparicions: ");
        System.out.println("La paraula mes repetida i el numero d'aparicions: ");
        System.out.println("Introduir per teclat un caracter i dir quantes vegades apareix: ");
        System.out.println("Introduir per teclat una paraula i dir quantes vegades apareix: ");

        while(!exit){
            num = sc.nextInt();
            if(num == 1) {
                exit = true;

            }


        }

        Practica1 p1 = new Practica1();
        p1.PracticaEx2();
    }
}
