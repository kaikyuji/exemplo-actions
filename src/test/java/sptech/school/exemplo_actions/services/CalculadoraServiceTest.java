package sptech.school.exemplo_actions.services;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import sptech.school.exemplo_actions.service.CalculadoraService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    @DisplayName("Quando acionado com 10 e 0, então deve lançar uma exceção")
    public void testDividirPorZero() {
        CalculadoraService service = new CalculadoraService();
        double a = 10;
        double b = 0;
        var expectedMessage = "400 BAD_REQUEST \"Divisão por zero não permitida\"";

        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> { 
            service.dividir(a, b);
        });

        assertEquals(expectedMessage, exception.getMessage());
    }


    // Testando merge da branch test para develop!!!!
    //
     //
     ///
     ///
     //
     
}
