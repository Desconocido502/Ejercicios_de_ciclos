package domain;

import java.util.Scanner;

public class Ciclo1_al_10 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído.
     */
    public static void mostarRangoNum() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print("|");
            System.out.print(i + "|");
        }
        System.out.println("");
    }

    /*
    Leer un número entero y mostrar todos los pares comprendidos entre 1 y el número leído.
     */
    public static void listaPares() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {

            if ((i % 2) == 0) {
                System.out.print(" |");
                System.out.print(i + "|");
            }

        }
        System.out.println("");
    }

    /*
    Leer un número entero y mostrar todos los divisores exactos del número 
    comprendidos entre 1 y el número leído.
     */
    public static void listaDivisorExacto() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("\nLista de divisores exactos: ");
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                System.out.print(" |");
                System.out.print(i + "|");
            }

        }
        System.out.println("");
    }

    /*
    Leer dos números y mostrar todos los enteros comprendidos entre ellos.
     */
    public static void rangoEntreNumeros() {

        System.out.print("Ingrese un numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        System.out.println("Lista de numeros entre: " + num1 + " y " + num2 + ": ");
        for (int i = (num1 + 1); i < num2; i++) {
            System.out.print(" |");
            System.out.print(i + "|");
        }
        System.out.println("");
    }

    /*
    Leer dos números y mostrar todos los números terminados en 4 comprendidos
    entre ellos.
     */
    public static void rangoNumerosMultiploCuatro() {

        System.out.print("Ingrese un numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = entrada.nextInt();

        if (num1 < 0) {
            num1 *= (-1);
        }
        if (num2 < 0) {
            num2 *= (-1);
        }

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        int dgt;
        System.out.println("Lista de numeros entre: " + num1 + " y " + num2 + ": ");
        for (int i = (num1 + 1); i < num2; i++) {
            dgt = i - i / diez * diez;
            if (dgt == 4) {
                System.out.print(" |");
                System.out.print(i + "|");
            }
        }
        System.out.println("");
    }

    /*
    Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos 
    entre 1 y cada uno de los dígitos.
     */
    public static void listaTresDigitos() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 99 && numero < mil) {

            int dgt1 = numero / cien;
            int dgt2 = (numero / diez) % diez;
            int dgt3 = numero % diez;

            System.out.println("");
            imprimirNum(dgt1);

            imprimirNum(dgt2);

            imprimirNum(dgt3);

        } else {
            System.out.println("La cantidad de digitos necesarios ha sido superada.");
        }
    }

    public static void imprimirNum(int num) {
        System.out.println("Lista de numeros entre: " + 1 + " y " + num + ":");
        for (int i = 2; i < num; i++) {
            System.out.print(" |");
            System.out.print(i + "|");
        }
        System.out.println("\n------------------------------");
        System.out.println("");
    }

    /*
    Mostrar en pantalla todos los enteros comprendidos entre 1 y 100.
     */
    public static void mostrarNumCien() {

        System.out.println("Se muestran los numeros del 1 al 100: ");
        int i = 1;
        while (i <= 100) {
            System.out.print(" |");
            System.out.print(i + "|");
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50) {
                System.out.println("");
            }
            if (i == 60 || i == 70 || i == 80 || i == 90) {
                System.out.println("");
            }
            i++;
        }
        System.out.println("");

    }

    /*
    Mostrar en pantalla todos los pares comprendidos entre 20 y 200.
     */
    public static void paresEntre20Y200() {
        System.out.println("Se muestra una lista de numeros pares entre 20 y 200: ");
        int i = 21;
        while (i < 200) {

            if ((i % 2) == 0) {
                System.out.print(" |");
                System.out.print(i + "|");

                if (i == 46 || i == 72 || i == 98 || i == 120 || i == 142 || i == 164 || i == 186) {
                    System.out.println("");
                }

            }
            i++;
        }
        System.out.println("");
    }

    /*
    Mostrar en pantalla todos los números terminados en 6 comprendidos 
    entre 25 y 205
     */
    public static void ListaTerminaEn6() {

        System.out.println("Se muestra una lista de numeros que terminan en 6, entre 25 y 205: ");
        int i = 25, dgt;
        while (i < 205) {
            dgt = i - i / diez * diez;
            if (dgt == 6) {
                System.out.print(" |");
                System.out.print(i + "|");
            }

            if (i == 116) {
                System.out.println("");
            }

            i++;
        }
        System.out.println("");

    }

    /*
    Leer un número entero y determinar a cuánto es igual la suma de todos 
    los enteros comprendidos entre 1 y el número leído.
     */
    public static void sumaListaIntervalo() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int acum = 0, cont = 2;
        while (cont < numero) {
            acum += cont;
            System.out.println("acum: " + acum);
            cont++;
        }
        System.out.print("\nLa suma de los numeros comprendidos entre 1 y " + numero + " ,es igual a: ");
        System.out.print(acum + "\n");
    }

    /*
    Leer un número entero de dos dígitos y mostrar en pantalla todos los 
    enteros comprendidos entre un dígito y otro.
     */
    
}
