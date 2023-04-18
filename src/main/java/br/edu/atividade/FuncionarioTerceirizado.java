package br.edu.atividade;

public class FuncionarioTerceirizado extends Funcionario {
    private double despesasAdicionais;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesasAdicionais = despesasAdicionais;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getHorasTrabalhadas() {
        return super.getHorasTrabalhadas();
    }

    @Override
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        super.setHorasTrabalhadas(horasTrabalhadas);
    }

    @Override
    public double getValorHora() {
        return super.getValorHora();
    }

    @Override
    public void setValorHora(double valorHora) {
        super.setValorHora(valorHora);
    }

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double despesasAdicionais) {
        this.despesasAdicionais = despesasAdicionais;
    }

    @Override
    public double calcularPagamento() {
        if (getHorasTrabalhadas() >= 1320 * 0.04 * 0.99 || getValorHora() <= 1320 * 0.1 * 0.99) {
            return getHorasTrabalhadas() * getValorHora() + getDespesasAdicionais();
        } else {
            throw new IllegalArgumentException("Valor da hora trabalhada inválido");
        }
    }
}

