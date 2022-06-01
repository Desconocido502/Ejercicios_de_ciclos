package domain;

import java.util.Scanner;

public class Ciclo41_al_50 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Determinar a cuánto es igual la suma de los elementos de la serie de 
    Fibonacci entre 0 y 100.
     */
    public static void sumaIntervaloFibonacci() {
        int num1 = 0, num2 = 1, total = 0, aux = 0;
        System.out.print("Suma de los numeros de Fibonnaci entre 0 y 100: ");
        while (num2 <= 100) {
            total += num2;
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }
        System.out.print(total + "\n");

    }

    /*
    Determinar a cuánto es igual el promedio entero de los elementos de la 
    serie de Fibonacci entre 0 y 1000.
     */
    public static void promedioIntervaloFibonacci() {
        int num1 = 0, num2 = 1, total = 0, aux = 0, cont = 0;
        while (num2 <= 1000) {
            total += num2;
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
            cont++;
        }
        System.out.println("cont: " + cont);
        int promedio = total / cont;
        System.out.println("El promedio es: " + promedio);
    }

    /*
    Determinar cuántos elementos de la serie de Fibonacci se encuentran 
    entre 1000 y 2000
     */
    public static void detElementFibo() {
        int num1 = 0, num2 = 1, aux = 0, cont = 0;
        while (num2 < 1600) {
            if (num2 > 1000 && num2 < 2000) {
                cont++;
            }
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("num1 = " + num1);
        System.out.println("Hay un total de: " + cont + " elementos.");

    }

    /*
    Leer un número y calcularle su factorial
     */
    public static void factorial() {
        int fac = 1;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();
        for (int i = numero; i >= 1; i--) {
            fac *= i;
        }
        System.out.println("\nEl factorial de " + numero + ", es: " + fac);
    }

    /*
    Leer un número y calcularle el factorial a todos los enteros comprendidos 
    entre 1 y el número leído.
     */
    public static void listaFactorial() {
        int fac = 1;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();

        System.out.println("Lista del factorial de los numeros debajo de: " + numero);
        while (numero >= 1) {

            for (int i = numero; i >= 1; i--) {
                fac *= i;
            }
            System.out.println("El factorial de " + numero + ", es: " + fac);
            fac = 1;
            numero--;
        }

    }

    /*
    Leer un número entero y calcular el promedio entero de los factoriales 
    de los enteros comprendidos entre 1 y el número leído.
     */
    public static void promlistaFactorial() {

        int fac = 1, total = 0, cont = 0, aux = 0;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();
        aux = numero;
        while (numero >= 1) {

            for (int i = numero; i >= 1; i--) {
                fac *= i;
            }
            total += fac;
            fac = 1;
            numero--;
            cont++;
        }
        int promedio = total / cont;
        System.out.println("Promedio de los factoriales comprendidos entre 1 "
                + "y " + aux + ", es: " + promedio);
    }

    /*
    Leer un número entero y calcular a cuánto es igual la sumatoria de todos 
    los factoriales de los números comprendidos entre 1 y el número leído.
     */
    public static void sumaListaFactorial() {
        int fac = 1, total = 0, cont = 0, aux = 0;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();
        aux = numero;
        while (numero >= 1) {

            for (int i = numero; i >= 1; i--) {
                fac *= i;
            }
            total += fac;
            fac = 1;
            numero--;
            cont++;
        }
        System.out.println("La suma de los factoriales entre 1 y "
                + aux + ", es: " + total + ".");
    }

    /*
    Utilizando ciclos anidados generar las siguientes parejas de enteros:
    0      1, 1      1, 2      2, 3      2, 4      3, 5      3,
    6      4, 7      4, 8      5, 9      5.
     */
    public static void parejasEnteras1() {
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(cont + "   " + i);
                cont++;
            }
        }

    }

    /*
    Utilizando ciclos anidados generar las siguientes ternas de números
            1       1       1
            2       1       2
            3       1       3
            4       2       1
            5       2       2
            6       2       3
            7       3       1
            8       3       2
            9       3       3
     */
    public static void parejasEnteras2() {
        int cont1 = 1;
        for (int i = 1; i < 2; i++) {

            for (int j = 1; j < 4; j++) {

                for (int k = 1; k < 4; k++) {
                    System.out.println(cont1 + "    " + j + "    " + k);
                    cont1++;
                }
            }
        }

    }

    /*
    Utilizando ciclos anidados generar las siguientes parejas de números.
                0       1
                1       1
                2       1
                3       1
                4       2
                5       2
                6       2
                7       2
    
     */
    public static void parejasEnteras3() {
        int cont = 0;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println(cont + "    " + i);
                cont++;
            }
        }

    }
}
