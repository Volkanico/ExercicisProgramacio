package com.company;
import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println(paraula);
    }

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
        int counter = 1;
        for (int i = 0; i < paraula.length(); i++){
            if (paraula.charAt(i) != ' '|| paraula.charAt(i) != '.'|| paraula.charAt(i) != ','|| paraula.charAt(i) != '?'|| paraula.charAt(i) != '!'||  paraula.charAt(i) != ':') {
                if (i + 1 < paraula.length()) {
                    if (paraula.charAt(i + 1) == ' '|| paraula.charAt(i + 1) == '.'|| paraula.charAt(i + 1) == ','|| paraula.charAt(i + 1) == '?'|| paraula.charAt(i + 1) == '!'|| paraula.charAt(i + 1) == ':') {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    public static void PracticaEx5() {
        Scanner reader = new Scanner(System.in);
        paraula = reader.nextLine();

        int counters[] = new int[35];
        for (int i1 = 0; i1 < paraula.length(); i1++) {
            if (paraula.charAt(i1) == 'a') {
                counters[0]++;
            }
            if (paraula.charAt(i1) == 'b') {
                counters[1]++;
            }
            if (paraula.charAt(i1) == 'c') {
                counters[2]++;
            }
            if (paraula.charAt(i1) == 'd') {
                counters[3]++;
            }
            if (paraula.charAt(i1) == 'e') {
                counters[4]++;
            }
            if (paraula.charAt(i1) == 'f') {
                counters[5]++;
            }
            if (paraula.charAt(i1) == 'g') {
                counters[6]++;
            }
            if (paraula.charAt(i1) == 'h') {
                counters[7]++;
            }
            if (paraula.charAt(i1) == 'i') {
                counters[8]++;
            }
            if (paraula.charAt(i1) == 'j') {
                counters[9]++;
            }
            if (paraula.charAt(i1) == 'k') {
                counters[10]++;
            }
            if (paraula.charAt(i1) == 'l') {
                counters[11]++;
            }
            if (paraula.charAt(i1) == 'm') {
                counters[12]++;
            }
            if (paraula.charAt(i1) == 'n') {
                counters[13]++;
            }
            if (paraula.charAt(i1) == 'o') {
                counters[14]++;
            }
            if (paraula.charAt(i1) == 'p') {
                counters[15]++;
            }
            if (paraula.charAt(i1) == 'q') {
                counters[16]++;
            }
            if (paraula.charAt(i1) == 'r') {
                counters[17]++;
            }
            if (paraula.charAt(i1) == 's') {
                counters[18]++;
            }
            if (paraula.charAt(i1) == 't') {
                counters[19]++;
            }
            if (paraula.charAt(i1) == 'u') {
                counters[20]++;
            }
            if (paraula.charAt(i1) == 'v') {
                counters[21]++;
            }
            if (paraula.charAt(i1) == 'w') {
                counters[22]++;
            }
            if (paraula.charAt(i1) == 'x') {
                counters[23]++;
            }
            if (paraula.charAt(i1) == 'y') {
                counters[24]++;
            }
            if (paraula.charAt(i1) == 'z') {
                counters[25]++;
            }
            if (paraula.charAt(i1) == ':') {
                counters[26]++;
            }
            if (paraula.charAt(i1) == '.') {
                counters[27]++;
            }
            if (paraula.charAt(i1) == ',') {
                counters[28]++;
            }
            if (paraula.charAt(i1) == '?') {
                counters[29]++;
            }
            if (paraula.charAt(i1) == '!') {
                counters[30]++;
            }
        }
        System.out.println(
                "\n La a apareix" + counters[0] + " vegades. " +
                "\n La b apareix" + counters[1] + " vegades. " +
                "\n La c apareix" + counters[2] + " vegades. " +
                "\n La d apareix" + counters[3] + " vegades. " +
                "\n La e apareix" + counters[4] + " vegades. " +
                "\n La f apareix" + counters[5] + " vegades. " +
                "\n La g apareix" + counters[6] + " vegades. " +
                "\n La h apareix" + counters[7] + " vegades. " +
                "\n La i apareix" + counters[8] + " vegades. " +
                "\n La j apareix" + counters[9] + " vegades. " +
                "\n La k apareix" + counters[10] + " vegades. " +
                "\n La l apareix" + counters[11] + " vegades. " +
                "\n La m apareix" + counters[12] + " vegades. " +
                "\n La n apareix" + counters[13] + " vegades. " +
                "\n La o apareix" + counters[14] + " vegades. " +
                "\n La p apareix" + counters[15] + " vegades. " +
                "\n La q apareix" + counters[16] + " vegades. " +
                "\n La r apareix" + counters[17] + " vegades. " +
                "\n La s apareix" + counters[18] + " vegades. " +
                "\n La t apareix" + counters[19] + " vegades. " +
                "\n La u apareix" + counters[20] + " vegades. " +
                "\n La v apareix" + counters[21] + " vegades. " +
                "\n La w apareix" + counters[22] + " vegades. " +
                "\n La x apareix" + counters[23] + " vegades. " +
                "\n La y apareix" + counters[24] + " vegades. " +
                "\n La z apareix" + counters[25] + " vegades. " +
                "\n Els : apareixen" + counters[26] + " vegades. " +
                "\n El . apareix" + counters[27] + " vegades. " +
                "\n La , apareix" + counters[28] + " vegades. " +
                "\n El ? apareix" + counters[29] + " vegades. " +
                "\n La ! apareix" + counters[30] + " vegades. ");
    }


    public static void PracticaEx6() {

        char ActualCharacter = ' ';
        char MostRepeat = ' ';
        int counter = 0;
        int maxCounter = 0;
        for(int i = 0; i < paraula.length(); i++) {
            if(paraula.charAt(i) != ' ') {
                ActualCharacter = paraula.charAt(i);
                for(int j = 0; j < paraula.length(); j++) {
                    if(paraula.charAt(j) == ActualCharacter) {
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
        System.out.println("El caracter " + MostRepeat + " apareix " + maxCounter + " pics");
    }
    public static void PracticaEx7(){

        String[] splited  = paraula.split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int maxCounter = 0;
        int counter = 1;
        String word = splited[0];
        String curr = splited[0];

        for (int i = 1; i < splited.length; i++) {
            if (splited[i].equals(curr)){
                counter++;
            }
            else {
                counter = 1;
                curr = splited[i];
            }
            if (maxCounter<counter){
                maxCounter = counter;
                word = splited[i];
            }
        }
        System.out.println("La paraula mes repetida es "+ word + " y se repite " + maxCounter + " veces.");
    }
    public static void PracticaEx8 (){
        int counter = 0;
        System.out.print("Escriu la lletra que vols cercar: ");
        char character = reader.next().charAt(0);

        for (int i = 0; i < paraula.length(); i++){

            if (paraula.charAt(i) == character) {
                counter++;
            }
        }
        System.out.println("Es repeteix " + counter +  " pics.");
    }
    public static void PracticaEx9() {
        int counter = 0;
        System.out.print("Escriu la paraula que vols cercar: ");
        String Word = reader.nextLine();

        String paraulaActual = "";

        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) != ' ') {
                paraulaActual += paraula.charAt(i); }
            if (paraulaActual.equals(Word)) {
                    counter++;
                }
        }
        System.out.println("Es repeteix " + counter + " pics.");
    }

    public static void menu(){

        System.out.println("Elegeix una de les opcions següents: " +
                "\n 1. Introduir text nou: " +
                "\n 2. Veure el text actual:" +
                "\n 3. Contar quantes lletres te aquest text: " +
                "\n 4. Contar quantes paraules te aquest text: " +
                "\n 5. Numero d'aparicions de cada caracter: " +
                "\n 6. El caracter mes repetit i el seu numero d'aparicions: " +
                "\n 7. La paraula mes repetit i el seu numero d'aparicions:" +
                "\n 8. Introduir un caracter y veure quantes vegades es repteix: " +
                "\n 9. Introduir una paraula y veure cuantas vegades es repteix: " +
                "\n 10. Per sortir: ");
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
                Practica1.PracticaEx9();
                Practica1.menu();
                break;
            case 10:
                break;
        }
    }
}


