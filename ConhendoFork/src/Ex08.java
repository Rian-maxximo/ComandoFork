
/*Somatório com Condição: Calcule a soma de todos os números inteiros de 1 a N, 
 * mas somente se N for par.
 */
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("digite um numero inteiro");
		int n = scanner.nextInt();
		if (n % 2 == 0 ) {
			int soma = (n*(n+1))/2;
			System.out.println("a soma dos numeros inteiros de 1 a " + n + " é "  + soma);
		}
		
	
	else{
		System.out.println("O número digitado não é par");}

		scanner.close();

	}
}
