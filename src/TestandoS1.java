import java.util.Scanner;

public class TestandoS1 {

	public static void main(String[] args) {
		//*uma ONG criou um jogo para alertar as pessoa sobre os riscos das drogas.
		//Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
		//Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar" caso ele tenha 12 anos ou mais. */
		Scanner leitor = new Scanner(System.in);
	
		int idade;
		System.out.println("Por favor, digite sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Deixe-me, verifica sua idade");
		if (idade>=12)	{
			
			
		System.out.println("Voc� pode jogar!");
		Scanner leitor1 = new Scanner(System.in);
		int ano;
		System.out.println("Por favor , digite a data do seu nascimento");
		ano = leitor.nextInt();
		System.out.println("Que legal, voc� nasceu em " + ano);
		idade = 2021 - ano;
		System.out.println("Pelo que eu vi , voc� nasceu em " + idade);
		
		
			


		
		
		
		leitor.close();
		
		
		}
		
	}
	
}

	

