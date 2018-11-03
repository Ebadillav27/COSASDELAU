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

		int a = 1;
		int b = a++;
		System.out.println(b + " " + a);

		int x = 1; 
		int y = ++x; 
		System.out.println(x + " " + y);


		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}

		for (int i = 0; i < 10; ++i)
		{
			System.out.println(i);
		}
	}
	
}