/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juhe.cursojava.aula12;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class LeituraDadosTeclado {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+ nomeCompleto );
    }
    
}
