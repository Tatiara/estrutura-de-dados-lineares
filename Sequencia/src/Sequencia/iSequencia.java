package Sequencia;

public interface iSequencia {
	
	public int size();
	public boolean isEmpty();
	
	//Métodos de Vetor
	public No elemAtRank(int r) throws ESequenciaVazia;//"ok"
	public Object replaceAtRank(int r, Object o);//"ok"
	public void insertAtRank(int r, Object o);//"ok"	
	public Object removeAtRank(int r);//"ok"
	
	//Métodos de Lista
	public Object first();//"ok"
	public Object last();//"ok"
	public Object before(No n);//"ok"
	public Object after(No n);//"ok"
	public Object replaceElement(No n,Object o);//"ok"
	public void swapElements(No n, No q);//"ok"
	public void insertBefore(No n,Object o);//"ok"
	public void insertAfter(No n,Object  o);//"ok"
	public void insertFirst(No o);//"ok"
	public void insertLast(No o);//"ok"
	public void remove(No n);//"ok"
	
	//Métodos “ponte”
	public No atRank(int r);// "ok"
	public int rankOf(No n);// "ok"
	
}
