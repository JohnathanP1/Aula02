import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
		 *Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		/*Aqui devemos criar uma solu��o para verificar a idade do usu�rio*/
		if (idade>=12) {
			
			//Abaixo temos um If Simples, ou seja, ele vai avaliar se a condi��o idade>=12 � verdadeira. Se for verdadeira, o if far� um DESVIO e a linha com a mensagem ser� excecutada.
			
			System.out.println("Voc� pode jogar");
			Scanner leitor1 = new Scanner(System.in);
			int ano;
			System.out.println("Digite seu ano de nascimento");
			ano = leitor1.nextInt();
			System.out.println("Que legal, voce nasceu em " + ano);
			idade = 2021 - ano;
			System.out.println("Pelo que vi, sua idade � + idade");
			if (idade >=18) {
				
				//O if significa um desvio condicional 
	
			}
	
		
		leitor.close();

	}

}
	
}
