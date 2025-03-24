/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jaxbmaven;


public class Paquete {
   
    private static final double PESO_MINIMO = 1.0;
    private static final double PESO_MAXIMO = 50.0;

    public static boolean validarPeso(double peso) {
        // Verificar si el peso está dentro del rango permitido
        return peso >= PESO_MINIMO && peso <= PESO_MAXIMO;
    }

    
}
