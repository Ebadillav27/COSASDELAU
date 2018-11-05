package progra1; 

public class meses
{
    public static void main(String[] args)
    {
        int mes = 1; 
        
        String estacion = " "; 
        /*
       if (mes == 1 || mes == 2 || mes == 12)
        {
            estacion = "invierno";
            System.out.println("la estación es: " + estacion);
        }

        else if (mes == 3 || mes == 4 || mes == 5)
        {
            estacion = "primavera"; 
            System.out.println("la estación es: " + estacion);
        }

        else if (mes == 9 || mes == 10 || mes == 11)
        {
            estacion = "Otoño"; 
            System.out.println("la estación es: " + estacion);
        }

        else if (mes == 6 || mes == 7 || mes == 8)
        {
            estacion = "verano"; 
            System.out.println("la estación es: " + estacion);
        }
        
        else 
        { 
            System.out.println("algo salió mal.");

        }
        */
        
        switch (mes) {
            case 1:
            case 2:
            case 12: 
            {
                estacion = "invierno";
                break;
                
            }
            
            case 3:
            case 4:
            case 5: 
            {
                estacion = "primavera";
                break;
            }
            
            case 9:
            case 10:
            case 11:
            {
                estacion = "otoño";
                break;
            }

            case 6:
            case 7:
            case 8: 
            {   
                estacion = "verano";
            }
            
            default:
                estacion = " el mes no existe dentro de las opciones";
                System.out.println("algo salió mal");
                break;
        }        
        System.out.println("la estación es: " + estacion);
        
        
    }
    
}