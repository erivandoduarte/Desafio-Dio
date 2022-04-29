import java.util.Scanner;

public class Questao3 {

public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a,b,c,d ;
	int diferencia;
	
	System.out.println("Digite os valores para Abaixo :");
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
	
	diferencia = a * b - c * d;
	
	System.out.println("A diferencia do produto é :" + diferencia);
	
}

}
