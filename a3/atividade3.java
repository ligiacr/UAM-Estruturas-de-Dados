package a3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class atividade3 {

	public static void main(String[] args) {

//		"Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células"

		List<Integer> lista = new ArrayList<>();

//		Adiciona os números na lista
		for (int aux = 1; aux <= 5; aux++) {
			lista.add(aux);
		}

		System.out.print("Ordem dos números na lista: ");
		for (int numero : lista) {
			System.out.print(numero + " ");
		}

//		"Passo 2: Remova todos os dados da lista e insira-os em uma pilha - com 5 células 
//		Deve-se sempre remover os dados da célula inicial da lista"

		Stack<Integer> pilha = new Stack<>();

		System.out.print("\nOrdem em que os números foram removidos da lista e inseridos na pilha: ");
//			Guarda o valor de cada número da lista que ocupará o índice 0 
//			em uma variável e remove este valor da lista, até que a mesma fique vazia
		while (lista.size() != 0) {
			int numero = lista.remove(0);
			System.out.print(numero + " ");
//			Os números removidos são inseridos na pilha
			pilha.push(numero);
		}

		System.out.println("\nQuantidade restante de números na lista: " + lista.size());

//		"Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células"

		Queue<Integer> fila = new LinkedList<>();

		System.out.print("Ordem de remoção dos números na pilha: ");
//		Atribui cada número da pilha a uma variável, remove os valores até que a pilha 
//		fique vazia e insere os mesmos na fila
		while (pilha.size() != 0) {
			int numero = pilha.pop();
			System.out.print(numero + " ");
			fila.add(numero);
		}

		System.out.println("\nQuantidade restante de números na pilha: " + pilha.size());

		System.out.print("Ordem dos números adicionados na fila: ");
		for (int numero : fila) {
			System.out.print(numero + " ");
		}

//		"Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista"

		for (int aux = 6; aux <= 10; aux++) {
			lista.add(aux);
		}

//		"Passo 5: Repita os passos 2 e 3"

		while (lista.size() != 0) {
			int numero = lista.remove(0);
			pilha.push(numero);
		}

		while (pilha.size() != 0) {
			int numero = pilha.pop();
			fila.add(numero);
		}

//		"Passo 6: Exiba todos os números que foram inseridos na fila"

		System.out.print("\nOrdem final dos números na fila: ");
		for (int numero : fila) {
			System.out.print(numero + " ");
		}

	}

}
