package Exercicio04;

public class Pessoa {
    private String nome;
    private String idade;
    private String cidadeNascimento;

    public Pessoa(String nome, String idade, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
    }

    public void exibirDados(){
        String exibir = getNome() + getIdade() + getCidadeNascimento();
        System.out.println(exibir);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }
}
