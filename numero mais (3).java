
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    
    public static void main(String[] args) {
   Scanner Ler = new Scanner (System.in);
 double n1;
 double n2;
 double n3;
 double max = 0;
 System.out.print("Diga o primeiro numero : ");
 n1 = Ler.nextDouble ();
 System.out.print ("Diga o segundo numero : ");
 n2 = Ler.nextDouble ();
 System.out.print("Diga o terceiro numero : ");
 n3 = Ler.nextDouble ();
 if (n1>n2)
     if (n1>n3)
         max=n1;
 if (n2>n1)
     if (n2>n3)
         max= n2;
 if (n3>n1)
     if (n3>n2)
         max=n3;
 System.out.print("O maixmo é : "+max);
 
                 
                
    

    }
    
}
