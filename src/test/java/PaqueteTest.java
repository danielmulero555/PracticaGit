/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

import com.mycompany.jaxbmaven.Paquete;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaqueteTest {
     @Test
    public void testPesoMinimoValido() {
        // Caso de prueba 1: Peso igual al límite inferior (1 kg)
        assertTrue(Paquete.validarPeso(1.0), "El paquete con peso de 1.0 kg debe ser aceptado.");
    }

    @Test
    public void testPesoInferiorNoValido() {
        // Caso de prueba 2: Peso justo por debajo del límite inferior (0.9 kg)
        assertFalse(Paquete.validarPeso(0.9), "El paquete con peso de 0.9 kg debe ser rechazado.");
    }

    @Test
    public void testPesoMaximoValido() {
        // Caso de prueba 3: Peso igual al límite superior (50 kg)
        assertTrue(Paquete.validarPeso(50.0), "El paquete con peso de 50.0 kg debe ser aceptado.");
    }

    @Test
    public void testPesoSuperiorNoValido() {
        // Caso de prueba 4: Peso justo por encima del límite superior (50.1 kg)
        assertFalse(Paquete.validarPeso(50.1), "El paquete con peso de 50.1 kg debe ser rechazado.");
    }

    @Test
    public void testPesoValidoIntermedio() {
        // Caso de prueba 5: Peso dentro del rango válido (25 kg)
        assertTrue(Paquete.validarPeso(25.0), "El paquete con peso de 25.0 kg debe ser aceptado.");
    }

    @Test
    public void testPesoCercaDelMinimoValido() {
        // Caso de prueba 6: Peso cercano al límite inferior (1.01 kg)
        assertTrue(Paquete.validarPeso(1.01), "El paquete con peso de 1.01 kg debe ser aceptado.");
    }

    @Test
    public void testPesoCeroNoValido() {
        // Caso de prueba 7: Peso igual a 0 kg
        assertFalse(Paquete.validarPeso(0.0), "El paquete con peso de 0.0 kg debe ser rechazado.");
    }

}

    
    
    
    
