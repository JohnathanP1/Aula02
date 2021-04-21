import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sensível, ficou decidido que a idade mínima para jogar é de 12 anos.
		 *Sua função é criar um programa que receba a idade do usuário e exiba a mensagem "Você pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		/*Aqui devemos criar uma solução para verificar a idade do usuário*/
		if (idade>=12) {
			
			//Abaixo temos um If Simples, ou seja, ele vai avaliar se a condição idade>=12 é verdadeira. Se for verdadeira, o if fará um DESVIO e a linha com a mensagem será excecutada.
			
			System.out.println("Você pode jogar");
			Scanner leitor1 = new Scanner(System.in);
			int ano;
			System.out.println("Digite seu ano de nascimento");
			ano = leitor1.nextInt();
			System.out.println("Que legal, voce nasceu em " + ano);
			idade = 2021 - ano;
			System.out.println("Pelo que vi, sua idade é + idade");
			if (idade >=18) {
				
				//O if significa um desvio condicional 
	
			}
	
		
		leitor.close();

	}

}
	
}
