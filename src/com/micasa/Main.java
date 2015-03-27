package com.micasa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String nombrePersona, nombreAnimal;
   Scanner lineaEntrada;
        lineaEntrada = new Scanner(System.in);

        nombrePersona = "Este es un nombre de persona";
        System.out.println(nombrePersona);
        System.out.println("Escribe el nombre");
        nombrePersona = lineaEntrada.next();
        System.out.println("Escribiste:"+nombrePersona);
    }
}
