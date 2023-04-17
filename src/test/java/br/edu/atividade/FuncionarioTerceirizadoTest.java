package br.edu.atividade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTerceirizadoTest {

    @Test
    void getNome() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        String nome = funcionario.getNome();
        // Assert
        assertEquals("Fulano", nome);
    }

    @Test
    void setNome() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        funcionario.setNome("Ciclano");
        // Assert
        assertEquals("Ciclano", funcionario.getNome());
    }

    @Test
    void getHorasTrabalhadas() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        int horasTrabalhadas = funcionario.getHorasTrabalhadas();
        // Assert
        assertEquals(10, horasTrabalhadas);
    }

    @Test
    void setHorasTrabalhadas() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        funcionario.setHorasTrabalhadas(20);
        // Assert
        assertEquals(20, funcionario.getHorasTrabalhadas());
    }

    @Test
    void getDespesasAdicionais() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        double despesasAdicionais = funcionario.getDespesasAdicionais();
        // Assert
        assertEquals(100, despesasAdicionais);
    }

    @Test
    void setDespesasAdicionais() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 100);
        // Act
        funcionario.setDespesasAdicionais(200);
        // Assert
        assertEquals(200, funcionario.getDespesasAdicionais());
    }
}