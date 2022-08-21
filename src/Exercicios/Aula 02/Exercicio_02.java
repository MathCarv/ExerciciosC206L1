class Motor {
    int potencia;
    String tipo;
    
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void mostraInfo(){
        System.out.println("Potencia: " + potencia);
        System.out.println("Tipo: " + tipo);
    }
}

class Carro {
    String cor, marca, modelo;
    double velocidadeMax, velocidadeAtual;
    Motor motor;
    
    public Carro(String cor, String marca, String modelo, double velocidadeMax, double velocidadeAtual, int potencia, String tipo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.motor = new Motor(potencia, tipo);
    }

    public void ligar(){  
        System.out.println("Carro ligado!");
    }
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void mostraInfo(){
        this.motor.mostraInfo();
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

public class Exercicio_02 {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro("Azul", "Fiat","Uno escada", 350, 200, 90, "V.8");
        c2 = new Carro("Vermelho", "Lamborguine", "Arrancadão", 500, 300, 120, "V.10");
        c1.mostraInfo();
        c2.mostraInfo();
        c1.ligar();
        c1.acelerar();
        c2.ligar();
        c2.acelerar();
    }
}
