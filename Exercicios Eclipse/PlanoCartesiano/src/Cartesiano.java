import java.util.Scanner;

public class Cartesiano {
	public static void main(String[] args) {
		int x;
		int y = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Um valor para X e Para Y: ");

		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
				
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
				
			} else if (x < 0 && y < 0) {
				System.out.println("Treceiro Quadrante");
				
			} else {
				System.out.println("Quarto quadrante");
				
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
