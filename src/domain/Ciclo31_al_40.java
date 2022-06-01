package domain;

import java.util.Scanner;

public class Ciclo31_al_40 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer números hasta que digiten 0 y determinar a cuánto es igual el
    promedio de los números terminados en 5.
     */
    public static void leerPromedioCinco() {
        int total = 0, cont = 0, promedio;
        System.out.print("Digite numeros y termine con 0:");
        int numero = entrada.nextInt();

        while (numero != 0) {
            int ultDgt = numero % diez;
            System.out.println("ultdgt: " + ultDgt);
            if (ultDgt == 5) {
                total += numero;
                cont++;
            }
            System.out.print("Digite un numero:");
            numero = entrada.nextInt();
        }
        promedio = total / cont;
        System.out.println("El promedio de los numeros terminados en 5 es: " + promedio);
    }

    /*
    Leer números hasta que digiten 0 y determinar a cuanto es igual el 
    promedio entero de los número primos leídos.
     */
    public static void leerPromedioPrimo() {
        int acum = 0, contP = 0, total = 0, promedio;
        System.out.print("Digite numeros y termine con 0:");
        int numero = entrada.nextInt();

        while (numero != 0) {

            for (int i = 1; i <= numero; i++) {
                int dgt = numero % i;
                if (dgt == 0) {
                    acum++;
                }
            }
            System.out.println("acum: " + acum);
            if (acum == 2) {
                contP++;
                total += numero;
                acum = 0;
            } else {
                acum = 0;
            }

            System.out.print("Digite un numero:");
            numero = entrada.nextInt();
        }
        promedio = total / contP;
        System.out.println("El promedio entero de los numeros leidos es: " + promedio);

    }

    /*
    Si 32768 es el tope superior para los números enteros cortos, determinar
    cuál es el número primo mas cercano por debajo de él.
     */
    public static void calcularMayorPrimoEntero() {

        int num, indicador, cuentaMultiplos, aux = 0;
        num = 32768;
        indicador = 0;
        while (indicador == 0) {

            cuentaMultiplos = 0;
            aux = 1;
            while (aux <= num) {
                if (((num % aux) == 0)) {
                    cuentaMultiplos++;
                }
                aux++;
            }

            if (cuentaMultiplos == 2) {
                indicador = 1;
                aux = num;
            }
            num--;
        }
        System.out.println("El ultimo primo es: " + aux);

    }

    /*
    Generar los números del 1 al 10 utilizando un ciclo que vaya de 10 a 1.
     */
    public static void mostrarDigitosDel1Al10() {

        System.out.println("Se muestran los numeros del 10 al 1.");
        for (int i = 10; i > 0; i--) {
            System.out.print(" |");
            System.out.print(i + "|");
        }
        System.out.println("");
    }

    /*
    Leer dos números enteros y determinar a cuánto es igual el producto 
    mutuo del primer dígito de cada uno.
     */
    public static void productoMutuo() {

        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        while (num1 > 10) {
            num1 /= diez;
        }

        while (num2 > 10) {
            num2 /= diez;
        }

        int producto = num1 * num2;
        System.out.println("El producto de los primer digito"
                + " de los numeros es: " + producto);

    }

    /*
    Mostrar en pantalla la tabla de multiplicar del número 5.
     */
    public static void tablaDel5() {

        System.out.println("Tabla de multiplicar del 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 + "X" + i + " = " + (i * 5));
        }

    }

    /*
    Generar todas las tablas de multiplicar del 1 al 10.
     */
    public static void mostrarTablasDeMultiplicar() {
        int c = 1;
        while (c <= 10) {
            System.out.println("\nSe muestra la tabla del " + c + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(c + "X" + i + " = " + (i * c));
            }
            c++;
        }

    }

    /*
    Leer un número entero y mostrar en pantalla su tabla de multiplicar.
     */
    public static void mostrarTablaMulN() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("\nSe muestra la tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "X" + i + " = " + (i * numero));
        }
    }

    /*
    Se define la serie de Fibonacci como la serie que comienza con los dígitos 1
    y 0 y va sumando progresivamente los dos últimos elementos de la serie, así:
    
    0  1  1  2  3  5  8  13  21  34.......
    Utilizando el concepto de ciclo generar la serie de Fibonacci hasta llegar o 
    sobrepasas el número 10000.
     */
    public static void listaFibonacci() {
        int num1 = 0, num2 = 1, aux;

        System.out.print("|" + 0 + "|");
        while (num2 < 1000) {
            System.out.print(" |");
            System.out.print(num2 + "|");
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("");

    }

    /*
    Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci.
     */
    public static void comprobarNumlistaFibonacci() {
        int num1 = 0, num2 = 1, aux;
        System.out.print("Ingrese un numero entero de dos digitos: ");
        int numero = entrada.nextInt();
        while (num2 < 1000) {

            if (numero == num2) {
                System.out.println("El numero ingresado pertenece a la lista de"
                        + " Fibonacci.");
            }
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
        }

    }

}
