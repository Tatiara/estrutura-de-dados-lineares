package Fila;

public class FilaMain {

	public static void main(String[] args) throws EFilaVazia {
		int tam = 1;
		FilaArray fila = new FilaArray(tam);
		fila.queue(15);
		fila.queue(26);
		fila.dequeue();
		fila.queue(02);
		fila.queue(28);
		fila.queue(05);
		fila.queue(27);
		//fila.Mostrar();
		//fila.dequeue();
		//fila.dequeue();
		//fila.dequeue();
		System.out.println("tamanho " + fila.size());
		fila.print();
	}

}
