package com.tema4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Tecle el numero a evaluar :: ");
        int numeroIf = reader.nextInt();

        if (numeroIf < 0){
            System.out.println("El numero es negativo");
        }else if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIf == 0){
            System.out.println("El numero es cero");
        }else{
            System.out.println("El numero no es valido");
        }

        System.out.println("Bucle while");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Valor de numeroWhile = " + numeroWhile);
            numeroWhile ++;
        }

        System.out.println("Bucle do - while");
        do{
            System.out.println("Valor de numeroWhile = " + numeroWhile);
            numeroWhile ++;
        }while (numeroWhile < 3);

        System.out.println("Bucle for");
        int numeroFor = 0;
        for(;numeroFor<=3; numeroFor++){
            System.out.println("Valor de numeroFor = " + numeroFor);
        }

        String estacion = "jorge";
        switch (estacion){
            case "primavera":
                System.out.println("LA ESTACION ES :: " + estacion);
                break;
            case "verano":
                System.out.println("LA ESTACION ES :: " + estacion);
                break;
            case "invierno":
                System.out.println("LA ESTACION ES :: " + estacion);
                break;
            case "otono":
                System.out.println("LA ESTACION ES :: " + estacion);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + estacion);
        }
    }
}