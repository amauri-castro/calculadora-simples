/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Arley
 */
public class Calcular {
    
    private static Calcular calcular;
    
    private Calcular(){
        
    }
    
    public static Calcular getCalcular(){
        if(calcular == null){
            calcular = new Calcular();
        }
        return calcular;
    }
    
    public Double somar(Double valor1, Double valor2){
        return valor1 + valor2;
    }
    
    public Double subtrair(Double valor1, Double valor2){
        return valor1 - valor2;
    }
    
    public Double dividir(Double valor1, Double valor2){
        return valor1 / valor2;
    }
    
    public Double multiplicar(Double valor1, Double valor2){
        return valor1 * valor2;
    }
    
}
