package domain;

import java.util.Scanner;

public class Ciclo21_al_30 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer un número entero y determinar a cuánto es igual la suma de sus dígitos.
     */
    public static void sumaDigitos() {
        int entero = 1, residuo, temp = 0, suma = 0;
        System.out.print("Ingrese el primer numero entero: ");
        int numero = entrada.nextInt();

        while (entero != 0) {

            residuo = numero % diez;
            entero = numero / diez;
            numero = entero;
            suma = residuo + temp;
            temp = suma;
        }
        System.out.println("La suma de los digitos es: " + suma);
    }

    /*
    Leer un número entero y determinar cuántas veces tiene el dígito 1.
     */
    public static void determinarDigitoUno() {
        int entero = 1, residuo, cont = 0;
        System.out.print("Ingese un numero entero: ");
        int numero = entrada.nextInt();

        while (numero != 0) {
            residuo = numero % diez; //Siempre se obtiene el ultimmo digito del numero
            System.out.println("residuo: " + residuo);
            numero /= diez; //Se divide entre 10 para llevar el nuevo numero.
            if (residuo == 1) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " veces que se repite el uno en el numero.");
    }

    /*
    Leer un número entero y determinar si la suma de sus dígitos es también 
    un número primo.
     */
    public static void determinarSumaPrimo() {
        int acum = 0, cont = 0, ultDigt, total = 0, temp = 0;
        System.out.print("Digite un numero entero: ");
        int numero = entrada.nextInt();

        int aux = numero;
        while (numero != 0) {

            ultDigt = numero % diez;
            numero /= diez;
            total = ultDigt + temp;
            temp = total;
        }

        for (int i = 1; i <= total; i++) {
            int residuo = total % i;
            if (residuo == 0) {
                acum++;
            }
        }

        if (acum == 2) {
            System.out.println("La suma de los digitos de " + aux + ", es: " + total + ".");
        } else {
            System.out.println("La suma de los digitos de " + aux + " no da un numero primo.");
        }

    }

    /*
    Leer un número entero y determinar a cuánto es igual la suma de sus 
    dígitos pares.
     */
    public static void determinarSumaPares() {
        int ultDgt, temp = 0, suma = 0, aux;
        System.out.print("Digite un numero entero: ");
        int numero = entrada.nextInt();

        aux = numero;
        while (numero != 0) {

            ultDgt = numero % diez;
            numero /= diez;

            if ((ultDgt % 2) == 0) {
                suma = ultDgt + temp;
                temp = suma;
            }

        }
        System.out.println("La suma de " + aux + " para sus digitos pares es:" + suma);
    }

    /*
    Leer un número entero y determinar a cuánto es igual el promedio entero 
    de sus dígitos.
     */
    public static void promedioSumaDigitos() {
        int ultDgt, cont = 0, suma = 0, temp = 0, promedio;
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        while (numero != 0) {

            ultDgt = numero % diez;
            numero /= diez;
            suma = ultDgt + temp;
            temp = suma;
            cont++;
        }

        promedio = suma / cont;
        System.out.println("El promedio de los digitos del numero es:" + promedio);
    }

    /*
    Leer un número entero y determinar cuál es el mayor de sus dígitos.
     */
    public static void detMayorDgt() {
        int aux, penDgt;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();

        aux = numero % diez;

        while (numero != 0) {

            numero /= diez;
            penDgt = numero % diez;
            //aux = ultDgt;
            if (penDgt > aux) {
                System.out.println(penDgt + " > " + aux);
                aux = penDgt;
            }

        }
        System.out.println("El digito mayor es: " + aux);

    } //Nos costo

    /*
    Leer 2 números enteros y determinar cuál de los dos tiene mayor cantidad 
    de dígitos.
     */
    public static void determinarCantDigitosMayor() {

        System.out.print("Ingrese el primer numero entero:");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero:");
        int num2 = entrada.nextInt();

        int cantidadDgt1 = contDigitos2(num1);
        int cantidadDgt2 = contDigitos2(num2);

        if (cantidadDgt1 > cantidadDgt2) {
            System.out.println("El numero 1 tiene mas digitos que el numero 2.");
        } else {
            System.out.println("El numero 2 tiene mas digitos que el numero 1.");
        }

    }

    //Complemento de determinarCantDigitosMayor
    public static int contDigitos2(int numero) {
        int contDigitos, aux;
        aux = numero;
        contDigitos = 0;
        while (numero != 0) {
            //System.out.println("numero = " + numero);
            numero /= diez;
            contDigitos++;
        }
        return contDigitos;
    }

    /*
    Leer 2 números enteros y determinar cual de los dos tiene mayor cantidad 
    de dígitos primos
     */
    public static void determinarCantDgtPrimo() {

        System.out.print("Ingrese el primer numero entero:");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero:");
        int num2 = entrada.nextInt();

        int cantidadDgt1 = contDigitosPrimos(num1);
        int cantidadDgt2 = contDigitosPrimos(num2);

        if (cantidadDgt1 > cantidadDgt2) {
            System.out.println("El numero 1 tiene mas digitos primos que el numero 2.");
        } else {
            System.out.println("El numero 2 tiene mas digitos primos que el numero 1.");
        }
    }

    //complemento de determinarCantDgtPrimo
    public static int contDigitosPrimos(int numero) {
        int cantPrimos = 0, ultDgt, acum = 0;
        while (numero != 0) {

            ultDgt = numero % diez;

            for (int i = 1; i <= ultDgt; i++) {
                int residuo = ultDgt % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            if (acum == 2) {
                cantPrimos++;
            }
            numero /= diez;
            acum = 0; //para impedir que el acum se llene de mas
        }

        return cantPrimos;
    }

    /*
    Leer un número entero y determinar a cuánto es igual el primero 
    de sus dígitos.
     */
    public static void determinarPrimerNumero() {
        int cont = 0, aux;
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        aux = numero;
        int primDgt = 0;
        //Se usa el metodo para saber cuantos digitos tiene se
        //va guardando en cont y se manda al while de abajo.
        while (numero != 0) {
            cont++;
            numero /= diez;
        }

        while (aux != 0) {
            aux /= diez;
            cont--;
            if (cont == 1) {
                primDgt = aux;
            }
        }

        System.out.println("Pimer digito: " + primDgt);

    }

    /*
    Leer un número entero y mostrar todos sus componentes numéricos osea
    aquellos para quienes el sea un múltiplo.
     */
    public static void mostrarMultiploNumerico() {

        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();
        //No entendi ni madres como esta eso.

    }

    
}
