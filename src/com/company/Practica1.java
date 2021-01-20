package com.company;
import java.util.Scanner;

public class Practica1 {

    private String paraula;

    public void setParaula(String paraula) {
        this.paraula = paraula;
    }

    public String getParaula() {
        return paraula;
    }

    public String PracticaEx1(String text) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introdueix el text:");

        paraula = reader.nextLine();

        return paraula;
    }

    public void PracticaEx2() {
        Scanner reader = new Scanner(System.in);

        System.out.println(getParaula());
    }

    public void PracticaEx3() {
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {

            if (paraula.charAt(i) != ' ' && paraula.charAt(i) != '.' && paraula.charAt(i) != ',' &&
                    paraula.charAt(i) != '?' && paraula.charAt(i) != '!' && paraula.charAt(i) != ':') {
                counter++;
            }

        }
        System.out.println("El numero lletres registrat es: " + counter);
    }

    public void PracticaEx4() {
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {
            while (paraula.charAt(i) == ' ' || paraula.charAt(i) != '.' || paraula.charAt(i) != ',' ||
                    paraula.charAt(i) != '?' || paraula.charAt(i) != '!' || paraula.charAt(i) != ':') {
                i++;
            }
            while (paraula.charAt(i) != ' ' && paraula.charAt(i) != '.' && paraula.charAt(i) != ',' &&
                    paraula.charAt(i) != '?' && paraula.charAt(i) != '!' && paraula.charAt(i) != ':') {
                counter++;
            }
        }
        System.out.println("El numero paraules registrades es: " + counter);
    }

    public void PracticaEx5() {

        String a = "a";
        int counterA = 0;
        return;
        String b = "b";
        int counterB = 0;
        return;
        String c = "c";
        int counterC = 0;
        return;
        String d = "d";
        int counterD = 0;
        return;
        String e = "e";
        int counterE = 0;
        return;
        String f = "f";
        int counterF = 0;
        return;
        String g = "g";
        int counterG = 0;
        String h = "h";
        int counterH = 0;
        String i = "i";
        int counterI = 0;
        String j = "j";
        int counterJ = 0;
        String k = "k";
        int counterK = 0;
        String l = "l";
        int counterL = 0;
        String m = "m";
        int counterM = 0;
        String n = "n";
        int counterN = 0;
        String o = "o";
        int counterO = 0;
        String p = "p";
        int counterP = 0;
        String q = "q";
        int counterQ = 0;
        String r = "r";
        int counterR = 0;
        String s = "s";
        int counterS = 0;
        String t = "t";
        int counterT = 0;
        String u = "u";
        int counterU = 0;
        String v = "v";
        int counterV = 0;
        String w = "w";
        int counterW = 0;
        String x = "x";
        int counterX = 0;
        String y = "y";
        int counterY = 0;
        String z = "z";
        int counterZ = 0;
        String point = ".";
        int counterPoint = 0;
        String comma = ",";
        int counterComma = 0;
        String interrogation = "?";
        int counterInterrogation = 0;
        String exclamation = "!";
        int counterExclamation = 0;
        String twoPoints = ":";
        int counterTwoPoints = 0;
    }

    public void PracticaEx8() {
        Scanner reader = new Scanner(System.in);
        String paraula = "";
        char[] ArrayParaula;
        char character;
        int counter = 0;

        System.out.println("Proposa una lletra: ");
        paraula = reader.nextLine();
        ArrayParaula = paraula.toCharArray();
        for (int i = 0; i < ArrayParaula.length; i++) {
            character = ArrayParaula[i];

            for (int j = 0; j < ArrayParaula.length; j++) {
                if (ArrayParaula[j] == character) {
                    counter++;
                }
            }
            System.out.println(ArrayParaula[i] + "" + counter);
            counter = 0;
        }
    }

    public void PracticaEx9() {
        Scanner reader = new Scanner(System.in);
        this.paraula = reader.nextLine();
        String paraula2 = "";
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {
            if(paraula == paraula2) {
                counter++;
            }
        }

    }
}


