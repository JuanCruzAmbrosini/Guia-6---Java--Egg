/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio1Yo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos que desea ingresar: ");
        int minutos = leer.nextInt();
        leer.nextLine();
        
        int horas = minutos/60;
        int dias = horas/24;
        horas = horas % 24 ;
        
        System.out.println("Son " + dias + " dias y " + horas + " horas.");
        
    }
    
}
