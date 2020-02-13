package Exercicio04;

public class Funcionario extends Pessoa {
    private int numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeNascimento, int numeroDeMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
}
