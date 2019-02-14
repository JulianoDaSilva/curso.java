/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadeumquadrado;
import java.util.Scanner;
/**
 *
 * @author Juliano
 */
public class AreaDeUmQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as area das duas base de um quadradoem cm:");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int areaqu = (lado1 * lado2);
        int dobrarea = areaqu * 2;
        System.out.println("A área quadrada  é: "+ areaqu + " e o dobro dessa área é: "+ dobrarea);
        
        
    }
    
}
