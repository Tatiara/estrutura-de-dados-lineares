package Sequencia;

public class SequenciaLL implements iSequencia {
	
	private No inicio;
	private No fim;
	private int qnt;
	
	@Override
	public int size() {
		return qnt; // O(1)
	}
	@Override
	public boolean isEmpty() {
		return qnt == 0; // O(1)
	}
	@Override
	public No elemAtRank(int r) {//Retorna o elemento armazenado no posto dado.
		
		return (No) atRank(r).getElemento();// O(1) receber a posição e pegar o elemento dela e retorna
	}
	@Override
	public Object replaceAtRank(int r, Object o) {// Substitui o elemento armazenado na classificação dada.
		Object sub = replaceElement(atRank(r), o);
		return sub; // O(1)
	}
	@Override
	public void insertAtRank(int r, Object o) {//Insere um elemento na classificação dada.
			No proximo = atRank(r);//o novo nó ficará bem antes disso
			No anterior = proximo.getAnterior();//o novo nó ficará bem depois disso
			No no = new No(o, anterior, proximo);
			//Novo nó conhece o próximo e o anterior. 
			//agora dizemos o próximo e o anterior sobre o novo nó
			proximo.setAnterior(no);
			anterior.setProximo(no);
	        qnt++;  				// O(1)	
	}
	@Override
	public Object removeAtRank(int r) {
		No no = atRank(r);//no que será removido
		No proximo = no.getProximo();//no antes dele
		No anterior = no.getAnterior();//no depois
		anterior.setProximo(proximo);
		proximo.setAnterior(anterior);
		qnt--;
		no.getElemento();
		return no; // O(1)
	}
	@Override
	public Object first() {
		return inicio.getProximo(); // O(1)
	}
	@Override
	public Object last() {
		return fim.getAnterior(); // O(1)
	}
	@Override
	public Object before(No n) {
		return n.getAnterior(); // O(1)
	}
	@Override
	public Object after(No n) {
		return n.getProximo(); // O(1)
	}
	@Override
	public Object replaceElement(No n, Object o) {
		n.setElemento(o);
		return n;
	}
	@Override
	public void swapElements(No n, No q) {
		No troca = n;
		n = q;
		q = troca;
		troca = null;
		
	}
	@Override
	public void insertBefore(No n, Object o) {
		No novoNo = new No(o, n.getAnterior(), n);
        n.getAnterior().setProximo(novoNo);
        n.setAnterior(novoNo);
        qnt++;		
	}
	@Override
	public void insertAfter(No n, Object o) {
		No no = new No(o, n.getAnterior(), n);
		no.setElemento(o);
		no.setAnterior(n);
		no.setProximo(n.getProximo());
		(n.getProximo()).setAnterior(no);	
		n.setProximo(no);
		//return no;
		qnt++;
	}
	@Override
	public void insertFirst(No o) {
		No novoNo = new No(inicio, inicio.getProximo(), o);
		inicio.getProximo().setAnterior(novoNo);
		inicio.setProximo(novoNo);
		qnt++;		
	}
	@Override
	public void insertLast(No o) {
		No novoNo = new No(fim, fim.getAnterior(), o);
		fim.getAnterior().setProximo(novoNo);
		fim.setAnterior(novoNo);
		qnt++;
	}
	@Override
	public void remove(No n) {
		//No temp = (No) n.getElemento();// se quiser retorna o elemento que foi retirada 
		(n.getAnterior()).setProximo(n.getProximo());
		(n.getProximo()).setAnterior(n.getProximo());
		n.setAnterior(null);
		n.setProximo(null);
		
		//return temp;
		
	}
	@Override
	public No atRank(int r) {//retorna o valor dado a posição 
		No no;
		if(r <= size()/2){
			no=inicio.getProximo();
			for(int i =0; i< r;i++){
				no=no.getProximo();
			}
		}else{
			no = fim.getAnterior();
			for(int i =0;i<size()-r-1;i++){
				no = no.getAnterior();
			}
		}		
		return no;
	}
	@Override
	public int rankOf(No n) {
		No no = inicio.getProximo();
		int r = 0;
		while(no != inicio && no != fim){
			no = no.getProximo();
			r++;
		}
		return r;
	}
	
	
}
