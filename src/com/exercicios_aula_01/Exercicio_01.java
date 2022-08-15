package com.exercicios_aula_01;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio_01 {
    public static void main(String[] args) {
        double primeironumero, segundonumero, resultado;
        String escolha;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        primeironumero = ler.nextDouble();
        System.out.print("Digite o segundo numero: ");
        segundonumero = ler.nextDouble();
        System.out.print("Digite a operacao desejada: " +
                    "\n1 - Soma" +
                    "\n2 - Subtracao" +
                    "\n3 - Multiplicacao" +
                    "\n4 - Divisao" +
                    "\n5 - Exponencial" +
                    "\n-> ");
            escolha = ler.next();
            switch (escolha) {
                case "Soma":
                    resultado = primeironumero + segundonumero;
                    System.out.println("O resulta da soma e: " + resultado);
                    break;
                case "Subtracao":
                    resultado = primeironumero - segundonumero;
                    System.out.println("O resulta da Subtracao e: " + resultado);
                    break;
                case "Multiplicacao":
                    resultado = primeironumero * segundonumero;
                    System.out.println("O resulta da Multiplicacao e: " + resultado);
                    break;
                case "Divisao":
                    resultado = primeironumero / segundonumero;
                    System.out.println("O resulta da Divisao e: " + resultado);
                    break;
                case "Exponencial":
                    resultado = Math.pow(primeironumero,segundonumero);
                    System.out.println("O resulta do Exponencial e: " + resultado);
                    break;
            }
    }
}
