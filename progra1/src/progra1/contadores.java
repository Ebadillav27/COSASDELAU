package progra1; 
import java.util.Scanner;

public class contadores 
{
    public static void main(String[] args)
    {
        //int contador = 0; 
        //int limite = 10; 
        
        /*
        while(contador < limite)
        {
            System.out.println(contador);
            contador++;
        }
        */

        
        System.out.println("introduzca la cantidad de elementos para la iteración: ");
        int maxcantidad; 
        
        Scanner entradaScanner = new Scanner(System.in); 
        maxcantidad = entradaScanner.nextInt();
        //revisar por qué esto no funcioina. 

        

        /*
        while(contador < maxcantidad)
        {
            System.out.println(" el contador es igual a: " + contador);
            contador++; 

        }
        
        do 
        {
            System.out.println(" el contador es igual a: " + contador);
            contador++; 

        }

        while (contador <= maxcantidad);
        */ 
    
        for (int contador = 0; contador < maxcantidad; contador++)
        {
            System.out.println(" contador = " + contador);

        }
    }



}