
import com.mycompany.jaxbmaven.NumeroSuerte;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;


public class NumeroSuerteTest {
    private NumeroSuerte luckyNumber;
    private Random random;
   @BeforeEach
    public void setUp() {
        luckyNumber = new NumeroSuerte();
        random = new Random();
    }

    @AfterEach
    public void tearDown() {
        luckyNumber = null;
    }

    @Test
    public void testNumeroDeLaSuerteDivisiblePor7() {
        int numero = 14;
        assertTrue(luckyNumber.esNumeroDeLaSuerte(numero), "El número 14 debería ser de la suerte");
    }

    @Test
    public void testNumeroDeLaSuerteContiene7() {
        int numero = 47;
        assertTrue(luckyNumber.esNumeroDeLaSuerte(numero), "El número 47 debería ser de la suerte");
    }

    @Test
    public void testNumeroNoDeLaSuerte() {
        int numero = 10;
        assertFalse(luckyNumber.esNumeroDeLaSuerte(numero), "El número 10 no debería ser de la suerte");
    }

    @Test
    public void testNumeroAleatorioValido() {
        int numero = random.nextInt(1000) + 1;  // Genera un número entre 1 y 1000
        assertNotNull(luckyNumber.esNumeroDeLaSuerte(numero), "El resultado nunca debe ser null");
    }

    @Test
    public void testNumeroFueraDeRango() {
        int numero = -5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            luckyNumber.esNumeroDeLaSuerte(numero);
        });
        assertEquals("El número debe estar entre 1 y 1000", exception.getMessage());
    }

   @Test
    public void testReferenciaMismaInstancia() {
        NumeroSuerte otraInstancia = luckyNumber;
        assertSame(luckyNumber, otraInstancia, "Ambas referencias deben apuntar a la misma instancia");
    }

}
