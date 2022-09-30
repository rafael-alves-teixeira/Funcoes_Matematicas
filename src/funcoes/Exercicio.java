package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double area = largura * comprimento;
		double prec_metro_quad = sc.nextDouble();
		double val_terreno = prec_metro_quad * area;
		
		System.out.printf("A área do terreno é de %.2f metros quadrados%n", area);
		System.out.printf("O valor do terreno é de R$%.2f%n", val_terreno);
			
			
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; 
		
		A = Math.sqrt(x); 
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a " + 2.0 + " = " + B);
		System.out.println(5.0 + " elevado a " + 2.0 + " = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		sc.close();
	}
	
}