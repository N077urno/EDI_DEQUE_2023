/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.edi_deque_2023;

/**
 *
 * @author nando
 */
public class EDI_DEQUE_2023 {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        
        deque.adicionaNoInicio(1);
        deque.adicionaNoFinal(2);
        deque.adicionaNoInicio(3);
        deque.adicionaNoFinal(4);
        
        deque.imprimir();
        
        System.out.println("Primeiro Elemento: " + deque.getInicio());
        System.out.println("Ultimo Elemento: " + deque.getFim());
        System.out.println("--- Removendo o primeiro e o Ultimo elemento ---");
        
        deque.removeDoInicio();
        deque.removeDoFim();
        
        deque.imprimir();
    }
}
