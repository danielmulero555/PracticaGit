/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jaxbmaven;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
  private Double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    
    
}
