

public class MainArvoreBinaria {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.inserir(12);
		arvore.inserir(5);
		arvore.inserir(20);
		arvore.inserir(16);
		/*arvore.inserir(2);
		arvore.inserir(85);
		arvore.inserir(99);
		arvore.inserir(88);*/
		System.out.println(arvore.buscar(20));
		arvore.Mostrar();
	}

}
