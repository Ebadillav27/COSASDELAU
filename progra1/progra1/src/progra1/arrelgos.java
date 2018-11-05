package progra1;

class arreglos 
{
    public static void main(String[] args)
    {
        String nombres[] = {"Erick", "Edgar", "Dante", "Homero"};

        System.out.println(" ");
        
        for (int i = 0; i < nombres.length; i++)
        {
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);             
        }
    }
}