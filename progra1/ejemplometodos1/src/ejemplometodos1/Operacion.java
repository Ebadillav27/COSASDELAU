package ejemplometodos1; 

public class Operacion 
{
    int suma, resta, multiplicacion;
    float division;
    
    //methods    
    public void sumar(int numero1, int numero2)
    {
        suma = numero1 + numero2; 
    }
    
    public void restar(int numero1, int numero2)
    {
        resta = numero1 - numero2; 
    }
    
    public void multiplicar(int numero1, int numero2)
    {
        multiplicacion = numero1 * numero2; 
    }
    
    public void dividir(int numero1, int numero2)
    {
        division = numero1 / numero2; 
    }
    
    public void mostrar_resultados()
    {
             System.out.println("la suma de los numeros es : " + suma);
        System.out.println("la resta de los numeros es : " + resta);
        System.out.println("la multiplicación de los numeros es : " + multiplicacion);
        System.out.println("la división de los numeros es : " + division);
    }
}   


