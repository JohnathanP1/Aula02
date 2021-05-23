import java.util.Scanner;

public class TestandoS1 {

	public static void main(String[] args) {
		//*uma ONG criou um jogo para alertar as pessoa sobre os riscos das drogas.
		//Por se tratar de um assunto sensível, ficou decidido que a idade mínima para jogar é de 12 anos.
		//Sua função é criar um programa que receba a idade do usuário e exiba a mensagem "Você pode jogar" caso ele tenha 12 anos ou mais. */
		Scanner leitor = new Scanner(System.in);
	
		int idade;
		System.out.println("Por favor, digite sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Deixe-me, verifica sua idade");
		if (idade>=12)	{
			
			
		System.out.println("Você pode jogar!");
		Scanner leitor1 = new Scanner(System.in);
		int ano;
		System.out.println("Por favor , digite a data do seu nascimento");
		ano = leitor.nextInt();
		System.out.println("Que legal, você nasceu em " + ano);
		idade = 2021 - ano;
		System.out.println("Pelo que eu vi , você nasceu em " + idade);
		
		
			


		
		
		
		leitor.close();
		
		
		}
		
	}
	
}

	

