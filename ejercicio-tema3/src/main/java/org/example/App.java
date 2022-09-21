package org.example;

public class App {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 34;
        int resultado = suma(a, b, c);
        System.out.println("La suma de las 3 variables es: "+ resultado);

        Coche coche = new Coche();
        coche.IncrementarPuertas(5);
        System.out.println("El numero de puertas es: "+ coche.numeroPuertas);
    }

    public static  int suma(int a, int b, int c) {
        return (a + b + c);
    }
}


