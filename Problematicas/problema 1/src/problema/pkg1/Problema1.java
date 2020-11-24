/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String empresa;
        // 2. op, i[0,n]
        int op;
        // 3. número de mensualidades, d[0,n]
        double número_de_mensualidades;
        // 4. impuesto, d[0,n]
        double impuesto;
        // 5. valorTotal, d[0,n]
        double valorTotal;
        // 6. porcentajeIva1, d[0,n] <-- 10
        double porcentajeIva1 = 10;
        // 7. porcentajeIva2, d[0,n] <-- 12
        double porcentajeIva2 = 12;
        // 8. porcentajeIva3, d[0,n] <-- 14
        double porcentajeIva3 = 14;
        // 9. porcentajeIva4, d[0,n] <-- 16
        double porcentajeIva4 = 16;
        // 10. costoNetflix, d[0,n] <-- 10
        double costoNetflix = 10;
        // 11. costoDisneyPlus, d[0,n] <-- 6
        double costoDisneyPlus = 6;
        // 12. costoAppleTV, d[0,n] <-- 5
        double costoAppleTV = 5;
        // 13. costoAmazonPrime, d[0,n] <-- 4.50
        double costoAmazonPrime = 4.50;
        // 14. Escribir "Ingrese el nombre del cliente"
        System.out.println("Ingrese el nombre del cliente");
        // 15. Leer usuario
        nombre = entrada.nextLine();
        // 16. Escribir "Ingrese la empresa a la que desea cancelar"
        System.out.println("Ingrese la empresa a la que desea cancelar");
        // 17. Leer empresa
        empresa = entrada.nextLine();
        // 18. Escribir "Ingrese el número de mensualidades"
        System.out.println("Ingrese el número de mensualidades");
        // 19. Leer número de mensualidades
        número_de_mensualidades = entrada.nextDouble();
        
        valorTotal = 0;
        
        // 20. Escribir "Seleccione el programa a cancelar"
        // 21. Escribir "Ingrese 1 si es Netflix"
        // 22. Escribir "Ingrese 2 si es Disney Plus"
        // 23. Escribir "Ingrese 3 si es Apple TV"
        // 24. Escribir "Ingrese 4 si es Amazon Prime"
        System.out.println("Seleccione el programa a cancelar\n"
        + "Ingrese 1 si es Netflix\n"
        + "Ingrese 2 si es Disney Plus\n"
        + "Ingrese 3 si es Apple TV\n"
        + "Ingrese 4 si es Amazon Prime");
        op = entrada.nextInt();
        
        switch(op){
            // Opción 1 // si op es igual a 1; se realiza las instrucciones
            // 25. impuesto <-- costoNetflix * porcentajeIva1 
            // 26. valorTotal <-- costoNetflix + impuesto
            case 1: 
                impuesto = costoNetflix * porcentajeIva1;
                valorTotal = costoNetflix + impuesto;
                break;
                
            case 2:
                impuesto = costoDisneyPlus * porcentajeIva2;
                valorTotal = costoDisneyPlus + impuesto;
                break;
                
            case 3:
                impuesto = costoAppleTV * porcentajeIva3;
                valorTotal = costoAppleTV + impuesto;
                break;
                
            case 4:
                impuesto = costoAmazonPrime * porcentajeIva4;
                valorTotal = costoAmazonPrime + impuesto;
                break;
                
            default:
                System.out.println("Operación incorrecta");
                break;
                
        }
        // 27. Escribir "El valor total es:" + valor total
        System.out.printf("%s\n%s\n%d\n%d\n",
                nombre,
                empresa,
                valorTotal);
        
        
    }
    
}
