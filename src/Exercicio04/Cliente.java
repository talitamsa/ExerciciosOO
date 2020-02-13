package Exercicio04;

public class Cliente extends Pessoa {

    private int cpf;

    public Cliente(String nome, int idade, String cidadeNascimento, int cpf) {
        super(nome, idade, cidadeNascimento);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
