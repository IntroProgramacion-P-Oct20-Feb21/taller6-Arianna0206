/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        double promedio = 7;
        int contador = 1;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el promedio del ciclo");
        promedio = entrada.nextDouble();
        
        while(contador <= 4){
            if (promedio >= 7){
                System.out.printf("Estudiante aprobado con un"
                + "promedio: %.2f\n", promedio);
            }else{
                System.out.printf("Estudiante reprobado con un"
                + "promedio: %.2f\n", promedio);
            }
            contador = contador + 1;
        }
    }
    
}
