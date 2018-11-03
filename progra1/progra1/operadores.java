package progra1; 

public class operadores
{
    public static void main(String[] args)
    {
        int a = 1 + 2; 
        int b = a * 4; 
        int c = b / 2;
        int d = c - a; 
        int e = -d; 

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("-------Operadores compuestos-------");
        a += 2; 
        System.out.println("a = " + a);
        b -= 4; 
        System.out.println("b = " + b);
        c*= a;
        System.out.println("c = " + c);
        a++; 
        System.out.println("a = " + a);

        boolean res = a<b;
        System.out.println("res = " + res);
        
        

        
    }

} 