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
        if (horasTrabalhadas > 160) {
            throw new IllegalArgumentException("Horas trabalhadas não podem ser maiores que 160");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 1320 * 0.04 * 0.99) {
            throw new IllegalArgumentException("Valor da hora trabalhada não pode ser menor que 4% do salário mínimo");
        } else if (valorHora >= 1320 * 0.1 * 0.99) {
            throw new IllegalArgumentException("Valor da hora trabalhada não pode ser maior que 10% do salário mínimo");
        }
        this.valorHora = valorHora;
    }

    public double calcularPagamento() {
        if (valorHora * horasTrabalhadas <= 1320) {
            throw new IllegalArgumentException("O Pagamento não pode ser menor que o salário mínimo");
        }
        return valorHora * horasTrabalhadas;
    }
}
