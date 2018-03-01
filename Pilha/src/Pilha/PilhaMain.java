package Pilha;

public class PilhaMain {
	public static void main(String[] args) throws EPilhaVazia {
		int tam = 2;
		PilhaArray pilha = new PilhaArray(tam);
		pilha.push(26);
		pilha.pop();
		pilha.push(20);
		pilha.push(21);
		pilha.push(28);
		pilha.push(13);
		pilha.push(02);
		pilha.push(80);
		pilha.size();
		pilha.isEmpty();
		pilha.Mostrar();
	}
}
