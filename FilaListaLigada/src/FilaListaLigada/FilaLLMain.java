package FilaListaLigada;

public class FilaLLMain {

	public static void main(String[] args) throws EFilaVazia {
		FilaListaLigada fila = new FilaListaLigada();
		fila.queue(20);
		fila.queue(02);
		fila.dequeue();
		fila.queue(15);
		fila.queue(26);
//		fila.dequeue();
//		fila.dequeue();
//		fila.dequeue();
		System.out.println(fila.size());
		fila.print();
	}

}
