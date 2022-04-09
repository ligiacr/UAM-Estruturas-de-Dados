package a1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

//		Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome
//		de 25 alunos; Garantir que a estrutura seja totalmente preenchida.

		String[] nomes = new String[25];
		Scanner teclado = new Scanner(System.in);
		int aux = 0;

//		Recebe os nomes do usuário e insere sequencialmente no array
		for (; aux < nomes.length; aux++) {
			System.out.println("Insira o nome do aluno número " + (aux + 1) + ":");
			nomes[aux] = teclado.nextLine();
		}
//		Exibe os nomes inseridos anteriormente
		System.out.print("Alunos na lista: ");
		for (String aluno : nomes) {
			System.out.print(aluno + " | ");
		}

//		 Após implementar o programa e preencher o array com o nome dos alunos,
//		 cadastre mais 5 novos alunos. (Obs.: exceção esperada ao rodar este trecho de
//		 código, pois o array já atingiu a capacidade máxima definida.)

		System.out.println();
		System.out.println();

//		Tenta inserir o próximo nome digitado, que excede a capacidade do array e lança a exceção.
		for (; aux < 30; aux++) {
			System.out.println("Insira o nome do aluno número " + (aux + 1) + ":");

			nomes[aux] = teclado.nextLine();
			teclado.close();
		}
		System.out.print("Alunos na lista: ");
		for (String aluno : nomes) {
			System.out.print(aluno + " | ");
		}

	}

}
