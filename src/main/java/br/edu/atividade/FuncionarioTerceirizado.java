package br.edu.atividade;

public class FuncionarioTerceirizado extends Funcionario{
    private double despesasAdicionais;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double despesasAdicionais) {
        super(nome, horasTrabalhadas);
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

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(double despesasAdicionais) {
        this.despesasAdicionais = despesasAdicionais;
    }
}
