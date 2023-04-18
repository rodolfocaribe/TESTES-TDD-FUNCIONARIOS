package br.edu.atividade;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;


    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
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

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularPagamento() {
        if (valorHora >= 1320 * 0.04 * 0.99 || valorHora <= 1320 * 0.1 * 0.99 && valorHora * horasTrabalhadas >= 1320) {
            return valorHora * horasTrabalhadas;
        } else {
            throw new IllegalArgumentException("Cálculo do pagamento não atende as regras de negócio");
        }
    }
}
