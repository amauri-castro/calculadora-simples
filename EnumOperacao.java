/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Arley
 */
public enum EnumOperacao {
    ADICAO("ADICAO"),
    SUBTRACAO("SUBTRACAO"),
    DIVISAO("DIVISAO"),
    MULTIPLICACAO("MULTIPLICACAO");
    
    private final String operacao;
    
    EnumOperacao(final String operacao){
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return operacao;
    }
    
    
    
    
    
    
}
