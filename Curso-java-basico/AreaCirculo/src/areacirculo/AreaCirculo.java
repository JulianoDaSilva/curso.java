/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Raio em cm de um circulo: ");
        float raio = scan.nextFloat();
        float area = (float) (3.14 * raio);
        System.out.println("A Area do Cirulo é: " + area);
       
        
    }
    
}
