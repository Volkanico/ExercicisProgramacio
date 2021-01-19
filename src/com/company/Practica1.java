package com.company;
import java.util.Scanner;

public class Practica1 {

    private String paraula;

    public void setParaula(String paraula) {
        this.paraula = paraula;
    }

    public String getParaula(){
        return paraula;
    }

    public String PracticaEx1 (String text) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introdueix el text:");

        paraula = reader.nextLine();

        return paraula;
    }
    public void PracticaEx2 () {
        Scanner reader = new Scanner(System.in);

        System.out.println(getParaula());
    }

    public void PracticaEx3 () {
        int counter = 0;

        for(int i = 0; i < paraula.length(); i++) {

            if (paraula.charAt(i) != ' ' && paraula.charAt(i) != '.' && paraula.charAt(i) != ',' &&
                    paraula.charAt(i) != '?' && paraula.charAt(i) != '!' && paraula.charAt(i) != ':') {
                counter ++;
            }

        }
        System.out.println("El numero lletres registrat es: " + counter);
    }
    public void PracticaEx4 () {
        int counter = 0;

        for(int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != ' ' && paraula.charAt(i) != '.' && paraula.charAt(i) != ',' &&
                    paraula.charAt(i) != '?' && paraula.charAt(i) != '!' && paraula.charAt(i) != ':') {
                else if(paraula.(i) + 1)


            }
        }
        System.out.println("El numero paraules registrades es: " + counter);
    }

    public void PracticaEx5 () {
        int counter = 0;
        int numeroC = 0;
        for(int i = 0; i < paraula.length(); i++) {
        }
        switch (numeroC) {
            case 1:
                paraula.



        }
    }

}

