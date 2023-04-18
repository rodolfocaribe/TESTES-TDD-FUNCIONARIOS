package br.edu.atividade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTerceirizadoTest {

    @Test
    @DisplayName("Teste de get de nome")
    void getNome() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);
        // Act
        String nome = funcionario.getNome();
        // Assert
        assertEquals("Fulano", nome);
    }

    @Test
    @DisplayName("Teste de set de nome")
    void setNome() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);

        // Act
        funcionario.setNome("Ciclano");
        // Assert
        assertEquals("Ciclano", funcionario.getNome());
    }

    @Test
    @DisplayName("Teste de get de horas trabalhadas")
    void getHorasTrabalhadas() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);

        // Act
        int horasTrabalhadas = funcionario.getHorasTrabalhadas();
        // Assert
        assertEquals(10, horasTrabalhadas);
    }

    @Test
    @DisplayName("Teste de set de horas trabalhadas")
    void setHorasTrabalhadas() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);

        // Act
        funcionario.setHorasTrabalhadas(20);
        // Assert
        assertEquals(20, funcionario.getHorasTrabalhadas());
    }

    @Test
    @DisplayName("Teste de get de despesas adicionais")
    void getDespesasAdicionais() {
        // Arrange
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);

        // Act
        double despesasAdicionais = terceirizado.getDespesasAdicionais();
        // Assert
        assertEquals(1000, despesasAdicionais);
    }

    @Test
    @DisplayName("Teste de set de despesas adicionais")
    void setDespesasAdicionais() {
        // Arrange
        FuncionarioTerceirizado funcionario = new FuncionarioTerceirizado("Fulano", 10, 58.00, 1000);

        // Act
        funcionario.setDespesasAdicionais(200);
        // Assert
        assertEquals(200, funcionario.getDespesasAdicionais());
    }

    @Test
    @DisplayName("Teste de calculo de salario")
    void calcularPagamento() {
        {
            // Arrange
            FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Fulano", 160, 58.00, 1000);
            double valorHoraTrabalhada = 52.80;
            double despesasAdicionais = terceirizado.getDespesasAdicionais();
            // Act
            double horasTrabalhadas = terceirizado.getHorasTrabalhadas();
            double pagamento = (terceirizado.getHorasTrabalhadas() * valorHoraTrabalhada) + despesasAdicionais;
            // Assert
            assertTrue(pagamento >= 1320, "Pagamento deve ser maior que 1320");
            assertTrue(horasTrabalhadas <= 160, "Horas trabalhadas superior ao limite de 160 horas mensais.");
            assertTrue(pagamento / terceirizado.getHorasTrabalhadas() >= 1320 * 0.04 * 0.99, "Valor da hora trabalhada deve ser maior que 4% do salario minimo");
            assertTrue(pagamento / terceirizado.getHorasTrabalhadas() <= 1320 * 0.1 * 0.99, "Valor da hora trabalhada não deve ultrapassar 10% do salario minimo");
            assertTrue(pagamento - (horasTrabalhadas * valorHoraTrabalhada) <= 1000, "Despesas adicionais não devem ultrapassar 1000 Reais");
        }
    }
}