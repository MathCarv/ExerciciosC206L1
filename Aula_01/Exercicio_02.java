package Exercicios.Aula;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        int NP1, NP2, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a nota da NP1: ");
        NP1 = ler.nextInt();
        System.out.print("Digite a nota da NP2: ");
        NP2 = ler.nextInt();
        resultado = (NP1 + NP2)/2;
        System.out.println("Sua nota final foi: " + resultado);
        if(resultado >= 60){
            System.out.println("Situacao: Aprovado");
        }
        else if (resultado >= 30 && resultado < 60){
            System.out.println("Situacao: Realizar NP3");
        }
        else{
            System.out.print("Situacao: Reprovado");
        }
    }
}
