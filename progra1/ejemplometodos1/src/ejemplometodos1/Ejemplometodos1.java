package ejemplometodos1;
import javax.swing.JOptionPane; 

public class Ejemplometodos1
{
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: ")); 
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero: ")); 
        
        Operacion obj1 = new Operacion(); 
        
        obj1.sumar(n1, n2); 
        obj1.restar(n1,n2);
        obj1.multiplicar(n1,n2);
        obj1.dividir(n1,n2);
        
    }
    
}
