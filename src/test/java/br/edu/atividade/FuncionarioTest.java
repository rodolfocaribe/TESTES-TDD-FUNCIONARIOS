package br.edu.atividade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    @DisplayName("Teste de get de nome")
    void getNome() {
        // Arrange
        Funcionario funcionario = new Funcionario("Fulano", 10);
        // Act
        String nome = funcionario.getNome();
        // Assert
        assertEquals("Fulano", nome);
    }

    @Test
    @DisplayName("Teste de set de nome")
    void setNome() {
        // Arrange
        Funcionario funcionario = new Funcionario("Fulano", 10);
        // Act
        funcionario.setNome("Ciclano");
        // Assert
        assertEquals("Ciclano", funcionario.getNome());
    }

    @Test
    @DisplayName("Teste de get de horas trabalhadas")
    void getHorasTrabalhadas() {
        // Arrange
        Funcionario funcionario = new Funcionario("Fulano", 10);
        // Act
        int horasTrabalhadas = funcionario.getHorasTrabalhadas();
        // Assert
        assertEquals(10, horasTrabalhadas);
    }

    @Test
    @DisplayName("Teste de set de horas trabalhadas")
    void setHorasTrabalhadas() {
        // Arrange
        Funcionario funcionario = new Funcionario("Fulano", 10);
        // Act
        funcionario.setHorasTrabalhadas(20);
        // Assert
        assertEquals(20, funcionario.getHorasTrabalhadas());
    }
    @Test
    @DisplayName("Teste de calculo de salario")
    void calcularPagamento() {
        {
            // Arrange
            Funcionario funcionario = new Funcionario("Fulano", 160);
            double valorHoraTrabalhada = 52.80;
            // Act
            double horasTrabalhadas = funcionario.getHorasTrabalhadas();
            double pagamento = funcionario.getHorasTrabalhadas() * valorHoraTrabalhada;
            // Assert
            assertTrue(pagamento >= 1320, "Pagamento deve ser maior que 1320");
            assertTrue(horasTrabalhadas <= 160, "Horas trabalhadas superior ao limite de 160 horas mensais.");
            assertTrue(pagamento / funcionario.getHorasTrabalhadas() >= 1320 * 0.04 * 0.99, "Valor da hora trabalhada deve ser maior que 4% do salario minimo");
            assertTrue(pagamento / funcionario.getHorasTrabalhadas() <= 1320 * 0.1 * 0.99, "Valor da hora trabalhada não deve ultrapassar 10% do salario minimo");
        }
    }
}