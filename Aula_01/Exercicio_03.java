package Exercicios.Aula;
import java.util.Scanner;
public class Exercicio_03 {
    public static void main(String[] args) {
        String Combustivel;
        double valor, litros;
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o Combustivel: "
        +"\nA - Alcool"
        +"\nG - Gasolina"
        +"\nDigite aqui: ");
        Combustivel = ler.nextLine();
        System.out.print("Quantos litros foram vendidos: ");
        litros = ler.nextDouble();
        if(Combustivel.equals("A") && litros < 20.0){
            valor = (4.90*litros)-(litros*0.04*4.90);
            System.out.print("Valor a pagar com desconto: R$" + valor);
        }
        else if(Combustivel.equals("A") && litros >= 20){
            valor = (4.90*litros)-(litros*0.06*4.90);
            System.out.print("Valor a pagar com desconto: R$" + valor);
        }
        if(Combustivel.equals("G") && litros < 20){
            valor = (6*litros)-(6*litros*0.03);
            System.out.print("Valor a pagar com desconto: R$" + valor);
        }
        else if(Combustivel.equals("G") && litros >= 20){
            valor = (6*litros)-(litros*0.05*6);
            System.out.print("Valor a pagar com desconto: R$" + valor);
        }

    }
}
