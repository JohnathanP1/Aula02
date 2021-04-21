import java.util.Scanner;

public class TestandoS1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		System.out.println("Por favor, digita sua idade");
		idade = leitor.nextInt();
		System.out.println("Deixe-me , verifica sua idade");
		if (idade>=12) {
			
		System.out.println("Você pode jogar");
		Scanner leitor1 = new Scanner(System.in);
		int ano;
		System.out.println("Por favor, digita a data do seu nascimento");
		ano = leitor.nextInt();
		
		idade = 2021 - ano;
		System.out.println("Pelo que eu vi , sua idade é + idade");
		if (idade>=18) {
			

		
		
		
		leitor.close();
		
		
		
		}
		
	}

	}
	
}
