/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jaxbmaven;


public class NumeroSuerte {
    //numerodelasuerte
       public boolean esNumeroDeLaSuerte(int numero) {
         if (numero <= 0 || numero > 1000) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 1000");
        }
       
        if(numero% 7==0)
          return true;
        
         if (Integer.toString(numero).contains("7"))
            return true;

        else
             return false;
      }


    
    
    
}
