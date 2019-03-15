package main;

import methods.Array;

import java.util.Scanner;

/**
 * Actividad 1
 * Búsqueda en un array con debug
 * @author german
 * @version 1.0
 * @since 15/3/2019
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array array = new Array();
        int n = 0;

        System.out.println("Introduce un número para buscarlo en el array");
        n = sc.nextInt();

        if (array.busquedaLineal(n))
            System.out.println("Se ha encontrado el número en el array en la posición " + array.getPos());
        else
            System.out.println("No se ha encontrado el número");
    }

}
