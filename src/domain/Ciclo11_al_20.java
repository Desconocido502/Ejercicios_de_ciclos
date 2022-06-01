package domain;

import java.util.Scanner;

public class Ciclo11_al_20 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    public static void listaEntreDosDigitos() {

        System.out.print("Ingrese un numero entero(dos digitos):");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("Se necesita un digito mas.");
        } else if (numero > 9 && numero < cien) {

            int dgt1 = numero / diez;
            int dgt2 = numero % diez;

            if (dgt1 > dgt2) {
                int aux = dgt2;
                dgt2 = dgt1;
                dgt1 = aux;
            }

            System.out.println("Se muestra una lista de numeros comprendida "
                    + "entre " + dgt1 + " y " + dgt2 + ": ");

            for (int i = (dgt1 + 1); i < dgt2; i++) {
                System.out.print("|");
                System.out.print(i + "|");
            }
            System.out.println("");

        } else {
            System.out.println("La cantidad de digitos necesarios "
                    + "ha sido excedida.");
        }
    }

    /*
    Leer un número entero de 3 dígitos y determinar si tiene el dígito 1
     */
    public static void encontrarUnoEnLista() {
        int dgt1, dgt2, dgt3;
        System.out.print("Ingrese un numero entero(tres digitos):");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 99 && numero < mil) {

            dgt1 = numero / cien;
            dgt2 = (numero / diez) % diez;
            dgt3 = numero % diez;
            System.out.println("dgt1 = " + dgt1);
            System.out.println("dgt2 = " + dgt2);
            System.out.println("dgt3 = " + dgt3);

            int[] num = {dgt1, dgt2, dgt3};

            for (int i = 0; i < 3; i++) {
                if (num[i] == 1) {
                    System.out.println("El digito en la posicion " + i + " es igual a 1.");
                }
            }
            System.out.println("");

        } else {
            System.out.println("La cantidad de digitos necesaria ha sido superada.");
        }
    }

    /*
    Leer un entero y mostrar todos los múltiplos de 5 comprendidos entre 1 
    y el número leído.
     */
    public static void mostrarListaMultiplos5() {
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("Se muestra la lista de numeros multiplos de 5,"
                + " entre 1 y " + numero + ":");
        for (int i = 1; i < numero; i++) {
            if ((i % 5) == 0) {
                System.out.print(" |");
                System.out.print(i + "|");
            }
        }
        System.out.println("");

    }

    /*
    Mostrar en pantalla los primeros 20 múltiplos de 3.
     */
    public static void mostrar20MultiplosDe3() {

        System.out.println("Se muestra una lista de los 20 multiplos de 3: ");
        for (int i = 1; i <= 60; i++) {
            if ((i % 3) == 0) {

                System.out.print(" |");
                System.out.print(i + "|");

                if (i == 30) {
                    System.out.println("");
                }

            }
        }
        System.out.println("");
    }

    /*
    Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3.
     */
    public static void sumar20MultiplosDe3() {
        int acum = 0;

        for (int i = 1; i <= 60; i++) {
            if ((i % 3) == 0) {
                acum += i;
            }
        }
        System.out.println("Se muestra la suma de los primeros 20 multiplos de 3: ");
        System.out.print(acum + "\n");
    }

    /*
    Mostrar en pantalla el promedio entero de los n primeros múltiplos de 3 
    para un número n leído.
     */
    public static void sumarProm20MultiplosDe3() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int acum = 0, cont = 0;

        for (int i = 1; i <= numero; i++) {
            if ((i % 3) == 0) {
                acum += i;

                cont++;
            }
        }
        int res = acum / cont;
        System.out.println("El promedio de los primeros " + cont + " numeros multiplos de 3 es: " + res);

    }

    /*
    Promediar los x primeros múltiplos de 2 y determinar si ese promedio es 
    mayor que los y primeros múltiplos de 5 para valores de x y y leídos.
     */
    public static void promedioMultiplo2Y5() {
        int prom1, prom2;
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = entrada.nextInt();

        prom1 = promedio(num1, 2);//Se le manda el numero ingresado, y el multiplo.
        prom2 = promedio(num2, 5);
        System.out.println("prom1 = " + prom1);
        System.out.println("prom2 = " + prom2);

        if (prom1 > prom2) {
            System.out.println("El promedio de los numeros multiplos de 2 es mayor "
                    + "al promedio de los numeros multiplos de 5.");
        } else {
            System.out.println("El promedio de los numeros multiplos de 5 es mayor "
                    + "al promedio de los numeros multiplos de 2.");
        }

    }

    //Se calcula el promedio, complemento de promedioMultiplo2Y5.
    public static int promedio(int numero, int multiplo) {
//      Se le pasan el numero tope, y el multiplo que se desea.  
        int promedio;
        int acum = 0, cont = 0;

        for (int i = 1; i <= numero; i++) {
            if ((i % multiplo) == 0) {
                acum += i;

                cont++;
            }
        }
        promedio = acum / cont;
        return promedio;
    }

    /*
    Leer dos números enteros y mostrar todos los múltiplos de 5 comprendidos 
    entre el menor y el mayor.
     */
    public static void mostrarRangoMultiplo5() {

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        System.out.println("Lista de multiplos de 5 comprendidos entre: " + num1 + " y " + num2 + ": ");
        for (int i = num1; i < num2; i++) {

            if ((i % 5) == 0) {
                System.out.print(" |");
                System.out.print(i + "|");

            }
        }
        System.out.println("");

    }

    /*
     Leer un número entero y determinar si es primo.
     */
    public static void isPrimo() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int acum = 0;
        for (int i = 1; i <= numero; i++) {
            int residuo = numero % i;
            if (residuo == 0) {
                acum++;
            }

        }

        if (acum == 2) {
            System.out.println("El " + numero + " es primo.");
        } else {
            System.out.println("El " + numero + " no es primo.");
        }

    }

    /*
    Leer un número entero y determinar cuántos dígitos tiene.
     */
    public static void contDigitos() {
        int contDigitos, aux;
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        aux = numero;
        contDigitos = 0;
        while (numero != 0) {
            //System.out.println("numero = " + numero);
            numero /= diez;
            contDigitos++;
        }
        System.out.println("El numero: " + aux + " posee: " + contDigitos + " digitos.");

    }

}
