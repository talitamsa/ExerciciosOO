package Exercicio01;

public class Exercicio01 {

    public static void main(String[] args){

        EmpresaRD squad1 = new EmpresaRD("Desenvolvedor Java", "Assistente Administrativa", "Onofre");
        EmpresaRD squad2 = new EmpresaRD("Engenheiro de Software", "Coordenador de Capacitação", "Drogasil");
        squad1.comem();
        squad2.trabalham();
    }
}
