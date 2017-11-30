
package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
  Scanner Ler = new Scanner (System.in);
  double n1;
          double n2;
          double total;
          String nomealuno;
          
         
          System.out.println("Qual o nome da aluno(a) : ") ;
           nomealuno = Ler.next();
          
                  System.out.print("Digite a primeira nota: ");
                  n1= Ler.nextDouble();
                  System.out.print ("Digite a segunda nota: ");
                  n2= Ler.nextDouble();
                   total= n1*0.6+n2*0.4;
                   if (total>=10)
                       System.out.print("Aluno(a)esta Aprovado.");
                  
                   if (total<10)
                       System.out.print(" Aluno(a) esta reprovado.");
                   
                 
                   System.out.print("O aluno "+nomealuno + " Obeteve como nota: " +total);
                   
                   
                  
                  
                  
                  
          
    }
    
}
