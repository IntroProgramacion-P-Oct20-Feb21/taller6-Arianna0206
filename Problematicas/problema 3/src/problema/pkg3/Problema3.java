/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String tipoOperación;
        String cadenaFinal ="";
        int limiteTabla = 5;
        int contador = 1;
        double númeroDías;
        double costoDía;
        double operación; 
        
        System.out.println("Ingrese que tipo de operación desea realizar\n"
        + "suma\n"
        + "o\n"
        + "multiplicación: \n");
        tipoOperación = entrada.nextLine();
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de días trabajados");
        númeroDías = entrada.nextDouble();
        System.out.println("Ingrese el costo del día trabajado");
        costoDía = entrada.nextDouble();
        
        switch(tipoOperación){
            case"suma":
                cadenaFinal = String.format("%s%s\n", cadenaFinal, 
                        "sumar");
                while(contador <= limiteTabla){ 
                   operación = númeroDías + costoDía;
                   cadenaFinal = String.format("%s%d + %d = %d\n", cadenaFinal,
                           nombre,númeroDías,costoDía,operación);
                   contador = contador + 1;
                }
                break;
            
            case "multiplicación":
                cadenaFinal = String.format("%s%s\n", cadenaFinal,
                        "multiplicación");
                while(contador <= limiteTabla){
                    operación = númeroDías * costoDía;
                    cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal,
                            nombre,númeroDías,costoDía,operación);
                    contador = contador + 1;
                }
                break;
                
            default:
                cadenaFinal = String.format("%s%s\n", cadenaFinal, 
                        "Error en tipo de operación");
        }
        
        System.out.printf("%s\n", cadenaFinal);
    }
    
}
