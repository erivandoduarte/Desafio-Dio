import java.util.Scanner;
import java.util.Locale;


public class Exercicio {
	public static void main(String [] args) {
		Locale.setDefault (Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			double area;
			double raio;
			double pi = 3.14159;

			System.out.println("Digite um Numero: ");
			
			raio  = sc.nextDouble();
			
			area =  pi * raio * raio ;
			
			System.out.printf("Area do seu Circulo é : " + "%.4f%n ",  area );
		}
		
		
	} 

}
/////Questão 3°/////



