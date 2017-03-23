package com.generarenteros.company;

import java.util.Scanner;

//Escribir un programar que lea N notas de alumnos y nos informe cuantos aprobados y reprobados hay
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;
        int calificacion;
        int materiaAprobada = 0;
        int materiaReprobada = 0;

        System.out.println("Ingresa las materia del alumno :");
        nota = entrada.nextInt();

        int valor[] = new int[nota];
        for (int i = 0; i < valor.length; i++) {
            System.out.print("Calificacion del alumno :");
            calificacion = entrada.nextInt();
            if (calificacion > 5) {
                materiaAprobada = materiaAprobada + 1;

            } else {
                materiaReprobada = materiaReprobada + 1;
            }
        }
        System.out.println("El numero de materia aprobadas es : " + materiaAprobada);
        System.out.println("El numero de materia reprobadas es : " + materiaReprobada);

    }
}
