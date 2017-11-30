package olaamigos;
import java.util.Scanner;
public class olamigoss {

	public static void main(String[] args) {
	Scanner LerS = new Scanner (System.in);
	int soma=0;
	int numero;
	System.out.print("Digite o número:");
	numero = LerS.nextInt();
	for(int I=1; I<=numero; I++) {
	soma +=I;
	}
	System.out.println(soma);;		

	}

}
