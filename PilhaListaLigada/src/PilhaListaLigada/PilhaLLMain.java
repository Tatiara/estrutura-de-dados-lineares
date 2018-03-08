package PilhaListaLigada;

public class PilhaLLMain {

	public static void main(String[] args) throws EPilhaVazia {
		PilhaListaLigada pilha = new PilhaListaLigada();
		pilha.push(26);
		pilha.push(15);
		pilha.push(20);
		pilha.push(02);
		pilha.pop();
		System.out.println(pilha.top());
		System.out.println(pilha.size());
		System.out.println(pilha.isEmpty() ? "está vazia" : "não está vazia");
		pilha.print();
	}

}
