import java.util.Scanner;
import java.lang.Math;
class Calculadora {
    String escolha;
    public double soma(double primeironumero, double segundonumero){
        return primeironumero + segundonumero;
    }
    public double subtracao(double primeironumero, double segundonumero){
        return primeironumero - segundonumero;
    }
    public double multiplicacao(double primeironumero, double segundonumero){
        return primeironumero * segundonumero;
    }
    public double divisao(double primeironumero, double segundonumero){
        return primeironumero / segundonumero;
    }
    public double exponencial(double primeironumero, double segundonumero){
        return Math.pow(primeironumero, segundonumero);
    }
}
public class Exercicio_01 {
    public static void main(String[] args) {
        Calculadora c1;
        c1 = new Calculadora();
        double primeironumero, segundonumero, resultado;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        primeironumero = ler.nextDouble();
        System.out.print("Digite o segundo numero: ");
        segundonumero = ler.nextDouble();
        System.out.print("Digite a operacao desejada: " +
                    "\n1 - Soma" +
                    "\n2 - Subtracao" +
                    "\n3 - Multiplicacao " +
                    "\n4 - Divisao" +
                    "\n5 - Exponencial" +
                    "\n-> ");
            c1.escolha = ler.next();
            switch (c1.escolha) {
                case "Soma":
                    resultado = c1.soma(primeironumero, segundonumero);
                    System.out.println("O resulta da soma e: " + resultado);
                    break;
                case "Subtracao":
                    resultado = c1.subtracao(primeironumero, segundonumero);
                    System.out.println("O resulta da Subtracao e: " + resultado);
                    break;
                case "Multiplicacao":
                    resultado = c1.multiplicacao(primeironumero, segundonumero);
                    System.out.println("O resulta da Multiplicacao e: " + resultado);
                    break;
                case "Divisao":
                    resultado = c1.divisao(primeironumero, segundonumero);
                    System.out.println("O resulta da Divisao e: " + resultado);
                    break;
                case "Exponencial":
                    resultado = c1.exponencial(primeironumero, segundonumero);
                    System.out.println("O resulta do Exponencial e: " + resultado);
                    break;
            }
    }
}