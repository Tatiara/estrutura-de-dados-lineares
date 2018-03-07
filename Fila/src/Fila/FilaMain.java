package Fila;

public class FilaMain {

	public static void main(String[] args) throws EFilaVazia {
		int tam = 1;
		FilaArray fila = new FilaArray(tam);
		fila.queue(15);
		fila.queue(26);
		fila.queue(02);
		fila.queue(28);
		//fila.Mostrar();
		fila.deworming();
		fila.deworming();
		fila.deworming();
		fila.deworming();
		fila.Mostrar();
	}

}
