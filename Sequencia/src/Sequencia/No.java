package Sequencia;

public class No {
	private int rank;//posição do nó array
	private Object elemento;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	private No proximo;
	private No anterior;
	
	public No (Object elemento, No anterior, No proximo){
		this.elemento=elemento;
		this.anterior=anterior;
		this.proximo=proximo;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	
	
}
