import java.util.Scanner;

public class EstruturaFor {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o Valor de X: ");
		
		x = sc.nextInt();
		
		for(int i=1; i<=x; i ++){
			
			if (i % 2 != 0) {
					System.out.println("Numero Impares entre o valor de X: " + i);
				
				sc.close();
			}
		}
		
		
		
		
		
	}

}
