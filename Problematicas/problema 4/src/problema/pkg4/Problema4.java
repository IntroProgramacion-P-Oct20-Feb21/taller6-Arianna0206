/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        String nombre;
        int contador = 1;
        double cantidadPuntos;
        double cantidadFaltas;
        
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de puntos anotados");
        cantidadPuntos = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de faltas de la temporada");
        cantidadFaltas = entrada.nextDouble();
        
        while(contador <= 10){
            cadenaFinal = String.format("%s\n%d\n%d\n", cadenaFinal,
                    nombre,
                    cantidadPuntos,
                    cantidadFaltas);
            contador = contador + 1;
        }
    }
    
}
