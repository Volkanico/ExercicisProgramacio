package com.company;
import java.util.Scanner;

public class Practica1 {

    private static String paraula;
    private static Scanner reader = new Scanner(System.in);
    public void setParaula(String paraula) {
        this.paraula = paraula;
    }
    public String getParaula() {
        return paraula;
    }

    public static String PracticaEx1() {
        System.out.println("Introdueix el text:");
        paraula = reader.nextLine();
        return paraula;
    }
    public static void PracticaEx2() {
        System.out.println(paraula); }

    public static void PracticaEx3() {
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != ' ' && paraula.charAt(i) != '.' && paraula.charAt(i) != ',' &&
                    paraula.charAt(i) != '?' && paraula.charAt(i) != '!' && paraula.charAt(i) != ':') {
                counter++;
            }
        }
        System.out.println("El numero lletres registrat es: " + counter);
    }
    public static void PracticaEx4(){
        int counter = 0;
        for (int i = 0; i < paraula.length(); i++){
            if (paraula.charAt(i) != ' '|| paraula.charAt(i) != '.'|| paraula.charAt(i) != ','|| paraula.charAt(i) != '?'|| paraula.charAt(i) != '!'||  paraula.charAt(i) != ':') {
                if (i + 1 < paraula.length()) {
                    if (paraula.charAt(i + 1) == ' '|| paraula.charAt(i + 1) == '.'|| paraula.charAt(i + 1) == ','|| paraula.charAt(i + 1) == '?'|| paraula.charAt(i + 1) == '!'|| paraula.charAt(i + 1) == ':') {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter + 1);
    }
    public static int[] PracticaEx5() {
        Scanner reader = new Scanner(System.in);

        int counters[] = new int [30];
        for(int i1 = 0; i1 < paraula.length(); i1++) {
            if(paraula.charAt(i1) == 'a') { counters[0]++; }
            if(paraula.charAt(i1) == 'b') { counters[1]++; }
            if(paraula.charAt(i1) == 'c') { counters[2]++; }
            if(paraula.charAt(i1) == 'd') { counters[3]++; }
            if(paraula.charAt(i1) == 'e') { counters[4]++; }
            if(paraula.charAt(i1) == 'f') { counters[5]++; }
            if(paraula.charAt(i1) == 'g') { counters[6]++; }
            if(paraula.charAt(i1) == 'h') { counters[7]++; }
            if(paraula.charAt(i1) == 'i') { counters[8]++; }
            if(paraula.charAt(i1) == 'j') { counters[9]++; }
            if(paraula.charAt(i1) == 'k') { counters[10]++; }
            if(paraula.charAt(i1) == 'l') { counters[11]++; }
            if(paraula.charAt(i1) == 'm') { counters[12]++; }
            if(paraula.charAt(i1) == 'n') { counters[13]++; }
            if(paraula.charAt(i1) == 'o') { counters[14]++; }
            if(paraula.charAt(i1) == 'p') { counters[15]++; }
            if(paraula.charAt(i1) == 'q') { counters[16]++; }
            if(paraula.charAt(i1) == 'r') { counters[17]++; }
            if(paraula.charAt(i1) == 's') { counters[18]++; }
            if(paraula.charAt(i1) == 't') { counters[19]++; }
            if(paraula.charAt(i1) == 'u') { counters[20]++; }
            if(paraula.charAt(i1) == 'v') { counters[21]++; }
            if(paraula.charAt(i1) == 'w') { counters[22]++; }
            if(paraula.charAt(i1) == 'x') { counters[23]++; }
            if(paraula.charAt(i1) == 'y') { counters[24]++; }
            if(paraula.charAt(i1) == 'z') { counters[25]++; }
            if(paraula.charAt(i1) == ':') { counters[26]++; }
            if(paraula.charAt(i1) == '.') { counters[27]++; }
            if(paraula.charAt(i1) == ',') { counters[28]++; }
            if(paraula.charAt(i1) == '?') { counters[29]++; }
            if(paraula.charAt(i1) == '!') { counters[30]++; }
        }
        return counters;
    }
    public static void PracticaEx6() {

        char ActualCharacter = ' ';
        char MostRepeat = ' ';
        int counter = 0;
        int maxCounter = 0;
        for(int i = 0; i < paraula.length(); i++) {
            if(paraula.charAt(i) == ' ') {
                ActualCharacter = paraula.charAt(i);
                for(int j = 0; j < paraula.length(); i++) {
                    if(paraula.charAt(i) == ActualCharacter) {
                        counter++;
                    }
                }
                if(counter > maxCounter) {
                    maxCounter = counter;
                    MostRepeat = ActualCharacter;
                }
                counter = 0;
            }
        }
        for(int j = 0; j < paraula.length(); j++) {
            if(ActualCharacter != ' ') {
                ActualCharacter = paraula.charAt(j);
            }
                if(MostRepeat == paraula.charAt(j + 1))
                    counter++;
            }
        System.out.println("El caracter " + MostRepeat + " ha aparecido " + counter + " veces");
    }
    public static void PracticaEx7() {
        String ActualWord;
        String MostRepeat;
        int counter = 0;
        for( int i = 0; i < paraula.length(); i++) {
            if(paraula.charAt(i) != ' ') {
            }
        }
    }
    public static void PracticaEx8 (){

        int counter = 0;
        System.out.print("¿Qué letra quieres? ");
        char character = reader.next().charAt(0);

        for (int i = 0; i < paraula.length(); i++){

            if (paraula.charAt(i) == character) {
                counter++;
            }
        }
        System.out.println("Se repite " + counter +  " veces.");
    }
    public static void PracticaEx9() {
        String paraulaActual = "";
        String Word = reader.nextLine();
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != ' ') {
                paraulaActual += paraula.charAt(i);
            } else {
                if (paraulaActual.equals(paraula)) {
                    counter++;
                }
                paraulaActual = "";
            }
        }
    }
    public static void menu(){

        System.out.println("Elige una de estas opciones: " +
                "\n 1. Cambiar el texto. " +
                "\n 2. Ver el texto actual." +
                "\n 3. Cuantas letras tiene el texto. " +
                "\n 4. Cuantas palabras tiene el texto." +
                "\n 5. Número de apariciones de cada carácter." +
                "\n 6. El carácter más repetido y el número de apariciones." +
                "\n 7. La palabra más repetiday el número de apariciones." +
                "\n 8. Introducir un carácter y ver cuantas veces se repite." +
                "\n 9. Introducir una palabra y ver cuantas veces se repite. " +
                "\n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                Practica1.PracticaEx1();
                Practica1.menu();
                break;
            case 2:
                Practica1.PracticaEx2();
                Practica1.menu();
                break;
            case 3:
                Practica1.PracticaEx3();
                Practica1.menu();
                break;
            case 4:
                Practica1.PracticaEx4();
                Practica1.menu();
                break;
            case 5:
                Practica1.PracticaEx5();
                Practica1.menu();
                break;
            case 6:
                Practica1.PracticaEx6();
                Practica1.menu();
                break;
            case 7:
                Practica1.PracticaEx7();
                Practica1.menu();
                break;
            case 8:
                Practica1.PracticaEx8();
                Practica1.menu();
                break;
            case 9:
                Practica1.PracticaEx8();
                Practica1.menu();
                break;
        }

    }
}


