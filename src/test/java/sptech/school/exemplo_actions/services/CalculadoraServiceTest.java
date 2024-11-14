package sptech.school.exemplo_actions.services;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sptech.school.exemplo_actions.service.CalculadoraService;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraServiceTest {
    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    public void testDividir() {
        CalculadoraService service = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 5;
        double resultado = service.dividir(a, b);
        assertEquals(esperado, resultado);
    }
}
