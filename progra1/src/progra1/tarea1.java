package progra1;

public class tarea1
{
    //explicar el comportamiento de prefijo y sufijo de operadores ++ y/o --.

	public static int factorial(int num)
	{
		int fact = num;
		
		for(int i = 1; i < num; i++)
		{
			fact *= i;
			
		
		}
		return fact;
		
		
	}
	
	public static void main(String[] args)
	{
        int numero = 4;
		 
		System.out.println("el factorial de " + numero + " es: " + factorial(numero));
	}
	
}