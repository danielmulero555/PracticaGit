import com.mycompany.jaxbmaven.CuentaBancaria;
import com.mycompany.jaxbmaven.NumeroSuerte;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CuentaBancaria_Test {
  public class CuentaBancariaTest {
      private CuentaBancaria cuenta;

    @BeforeEach
    void setUp() {
        cuenta = new CuentaBancaria();
    }

    @Test
    void testDeposito() {
        cuenta.depositar(50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
    void testRetiroExitoso() {
        cuenta.depositar(100.0);
        cuenta.retirar(30.0);
        assertEquals(70.0, cuenta.getSaldo());
    }

    @Test
    void testRetiroInsuficiente() {
        cuenta.retirar(50.0);
        assertEquals(0.0, cuenta.getSaldo());
    }

    @Test
    void testSaldoNoEsNull() {
        assertNotNull(cuenta.getSaldo());
    }

    @Test
    void testSaldoEsMismoObjeto() {
        Double saldoInicial = cuenta.getSaldo();
        assertSame(saldoInicial, cuenta.getSaldo());
    }

    @Test
    void testSaldoNoEsMismoObjeto() {
        CuentaBancaria nuevaCuenta = new CuentaBancaria();
        assertNotSame(cuenta, nuevaCuenta);
    }

    @Test
    void testSaldoNoEsNegativo() {
        cuenta.retirar(50.0);
        assertFalse(cuenta.getSaldo() < 0);
    }

    @Test
    void testSaldoEsCeroInicialmente() {
        assertTrue(cuenta.getSaldo() == 0);
    }

    @Test
    void testFalloForzado() {
        fail("Esta prueba está diseñada para fallar");
    }
}  
    
    
    
    
}
