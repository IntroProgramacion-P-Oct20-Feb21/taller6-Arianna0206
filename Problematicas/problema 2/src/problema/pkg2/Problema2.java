/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.util.Locale;

/**
 *
 * @author macbookair
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        while (contador <= 6){
            if ((contador % 2) == 0){ 
                System.out.printf("El número %d es par", contador);
            }else{
                System.out.printf("El número %d es impar", contador);
            } 
            contador = contador + 1;
        }
    }
    
}
