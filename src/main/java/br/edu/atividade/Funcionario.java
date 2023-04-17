package br.edu.atividade;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;

    public Funcionario(String nome, int horasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularPagamento(){
        return 0;
    }
}
