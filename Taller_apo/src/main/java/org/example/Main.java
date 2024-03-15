package org.example;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
        /*Desarrolle un método recursivo que permita revertir un String de entrada. Por ejemplo si el String de entrada es: 
        Abecedario
        En la consola se debe imprimir
        oiradecebA*/
        System.out.println("Escriba algo para invertirlo");
        String cadena = scanner.nextLine();
        

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertirCadena(cadena));

        /*
         * Desarrolle a partir del ejercicio del punto 1 un método prom, que permita sacar el promedio del arreglo.
            El método debe devolver un double. 
            Defina las entradas del método para resolver el problema.
            Por ejemplo si el arreglo de entrada es
            [1, 2, 3, 4, 5 , 6]
            En la consola debe imprimir
            Resultado: 3.5

         */
        System.out.println("Arreglo de numeros para sacar el promedio: 1, 2, 3, 4, 5, 6");
        int[] arreglo = {1, 2, 3, 4, 5, 6};
        System.out.println("El promedio del arreglo es: " + promedio(arreglo));

        /*
         * División por restas sucesivas
            Programe una función recursiva que muestre por consola el resultado de la división entera y el residuo a partir de la división usando restas sucesivas.

         */
        System.out.println("Ingrese el dividendo");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = scanner.nextInt();
        System.out.println("El resultado de la division es: " + division(dividendo, divisor));

        /*
         * Máximo común divisor
            Cree un algoritmo recursivo que tenga como entradas A y B. Calcule el máximo común divisor de los números. Use el algoritmo de Euclides para lograrlo. El algoritmo de Euclides se define matemáticamente como
            MCD(a,0) = a
            MCD(a,b) = MCD(b, a mod b)
            Donde el operador mod es el operador correspondiente al módulo o residuo de la división entera.
         */
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("El máximo comun divisor es: " + mcd(a, b));


    }

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
    
    public static double promedio(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static int division(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + division(dividendo - divisor, divisor);
        }
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }



}