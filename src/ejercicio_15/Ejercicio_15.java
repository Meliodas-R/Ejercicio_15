package ejercicio_15;

import java.util.Scanner;

/**
 * 15. Pedir al usuario que introduzca un número y mostrar su tabla de
 * multiplicar.
 *
 */
public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroTabla;
        System.out.print("Introduzca un número: ");
        numeroTabla = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " * " + i + " = " + numeroTabla * i);
        }
    }

}
