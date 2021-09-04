/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;

/**
OBJETO: ESTANCIA DE UNA CLASE
* PAQUETE: CASA DE LAS CLASES
* 
* NOTAS: SIEMPRE QUE LLAME UNA CAJA DEBO EMPEZAR POR EL ARREGLO
* 
 * @author Juan Ortega
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String producto1="cocacola";
        String producto2="papa";
        String producto3="arroz";
        String producto4="cañon de cerdo";
        String producto5="pansitos pequeños";
        String producto6="piña";*/
        
        Scanner entrada = new Scanner(System.in);
        
        int [] numeros = new int [4];
        //tipo,nombre           cuantos va a tener
        
        //NOTAS: SIEMPRE QUE LLAME UNA CAJA DEBO EMPEZAR POR EL ARREGLO
        
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;
        
        
        //el FOR hace un recorrido
        for(int i = 0; i<numeros.length; i++){
            
            System.out.println("Digita el dato: " +i);
            numeros[i]= entrada.nextInt();
        }
        
        System.out.println("***********");
        
        
        for(int i = 0; i<numeros.length; i++){
            
            System.out.println(numeros[i]);
            
        }
    }
    
}
