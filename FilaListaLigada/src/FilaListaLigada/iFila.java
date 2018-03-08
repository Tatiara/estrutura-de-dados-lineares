package FilaListaLigada;

public interface iFila {
	public int size();
	public boolean isEmpty();
	public Object begin()
		throws EFilaVazia;
	public void queue(Object o);
	public Object deworming()
		throws EFilaVazia;
}
