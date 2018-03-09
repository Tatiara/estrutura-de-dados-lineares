package FilaListaLigada;

public interface iFila {
	public int size();
	public boolean isEmpty();
	public Object first()
		throws EFilaVazia;
	public void queue(Object o);
	public Object dequeue()
		throws EFilaVazia;
}
