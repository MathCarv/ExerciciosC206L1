class Estudante {
    String nome;
    int idade;
    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void estudar(){  
        System.out.println(nome + " está estudando...");
    }
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class InfosContato {
    String email, enderecoCasa;
    int numTelefone;
    Estudante estudante = null;
    public InfosContato(String email, String enderecoCasa, int numTelefone) {
        this.email = email;
        this.enderecoCasa = enderecoCasa;
        this.numTelefone = numTelefone;
    }
}

public class Exercicio_03 {
    public static void main(String[] args) {
        Estudante e1, e2;
        InfosContato c1, c2;
        c1 = new InfosContato("matheus.camara@gec.inatel.br", "Rua lavai bomba", 190);
        c2 = new InfosContato("joaozin@get.inatel.br", "Rua caipratrás", 36341411);
        e1 = new Estudante("Matheus", 21);
        e2 = new Estudante("Joaozin", 33);
        c1.estudante = e1;
        c2.estudante = e2;
        c1.estudante.estudar();
        c2.estudante.estudar();
        c1.estudante.mostraInfo();
        c2.estudante.mostraInfo();
        
    }
}
