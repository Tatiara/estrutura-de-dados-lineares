package Sequencia;
import java.util.Arrays;
public class SequenciaArray implements iSequencia {
	
	private No[] elementos;
	private int qnt;

	@Override
	public int size() {
		return qnt;
	}

	@Override
	public boolean isEmpty() {
		return qnt == 0;
	}

	@Override
	public No elemAtRank(int r) throws ESequenciaVazia {
		if (isEmpty()) 
			throw new ESequenciaVazia("A Sequência está vazia!");
		for(int i=0; i<elementos.length; i++){
			if(i==r){
				return elementos[i];
			}
		}
		return null;
		
	}

	@Override
	public Object replaceAtRank(int r, Object o) {
		elementos[r].setElemento(o);
		return o;
	}

	@Override
	public void insertAtRank(int r, Object o) {
		No temp = null;
		No aux = null;
		if(r >=0 || r<= size()-1){//verifica se ele é valido	
			for(int i = 0; i < elementos.length; i++){
				if (i == r){
					temp = elementos[i];
					elementos[i].setElemento(o);
				}
			}
			
			for (int i = r; i < elementos.length; i++){
				if (size() == (elementos.length - 1)){
				//caso o array esteja cheio, vai duplicar e atualizar os elementos
		    		int tamAux = elementos.length*2;
		    		No[] arrayTemp = new No[tamAux];
		    		arrayTemp = Arrays.copyOf(elementos, elementos.length);
		    		elementos=arrayTemp;
		    		arrayTemp=null;
		    		//atualizando os elementos
		    		aux=elementos[r+1];
					elementos[i].setElemento(temp);	
		    		
				}	
					
					aux=elementos[r+1];
					elementos[i].setElemento(temp);	
				
			}
		}	
	}

	@Override
	public Object removeAtRank(int r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object first() {
		return elementos[0];
	}

	@Override
	public Object last() {
		return elementos[qnt-1];
	}

	@Override
	public Object before(No n) {
		return elementos[n.getRank()-1];
	}

	@Override
	public Object after(No n) {
		return elementos[n.getRank()+1];
	}

	@Override
	public Object replaceElement(No n, Object o) {
		n.setElemento(o);
		return n.getElemento();
	}

	@Override
	public void swapElements(No n, No q) {
		No temp = n;
		
		n.setRank(q.getRank());
		elementos[q.getRank()] = n;
		
		q.setRank(temp.getRank());
		elementos[temp.getRank()] = q;
		
	}

	@Override
	public void insertBefore(No n, Object o) {
		No[] aux = null;
		
		//checa se o array está cheio e entao duplica
		if (size() == (elementos.length -1)){

			int tamAux = elementos.length*2;

			No[] arrayTemp = new No[tamAux];

			//arrayTemp[0] = o;

			arrayTemp = Arrays.copyOf(elementos, elementos.length);

			elementos=arrayTemp;

			arrayTemp=null;

		}

		System.arraycopy(elementos, 0, aux, 0, n.getRank()-1); //copia ate o anterior de n
		aux[n.getRank()] = (No) o;
		System.arraycopy(elementos, n.getRank(), aux, n.getRank()+1, elementos.length - n.getRank() );		elementos = aux;
		aux = null;
		
	}
	

	@Override
	public void insertAfter(No n, Object o) {
No[] aux = null;
		
		//checa se o array está cheio e entao duplica
		if (size() == (elementos.length -1)){

			int tamAux = elementos.length*2;

			No[] arrayTemp = new No[tamAux];

			//arrayTemp[0] = o;

			arrayTemp = Arrays.copyOf(elementos, elementos.length);

			elementos=arrayTemp;

			arrayTemp=null;

		}
		//System.arraycopy(elementos, 0, aux, 0, n.getRank()+1);
		System.arraycopy(elementos, 0, aux, 0, n.getRank());//copia ate n
		aux[n.getRank()+1] = (No) o;
		System.arraycopy(elementos, n.getRank()+1, aux, n.getRank()+2, elementos.length - n.getRank() ); //preencher o resto do array
		elementos = aux;
		aux = null;
		

		
	}

	@Override
	public void insertFirst(No o) {
		No[] aux = null;
		//if (isEmpty()) throw new ESequenciaVazia("A Sequencia está Vazia!");
		if (size() == (elementos.length -1)){
			int tamAux = elementos.length*2;
			No[] arrayTemp = new No[tamAux];
			//arrayTemp[0] = o;
			arrayTemp = Arrays.copyOf(elementos, elementos.length);
			elementos=arrayTemp;
			arrayTemp=null;
		}

		aux[0] = o;
		System.arraycopy(elementos, 0, aux, 1, elementos.length);

		elementos = aux;
		aux = null; 
	}

	@Override
	public void insertLast(No o) {
		if(size() == (elementos.length - 1)){
			//caso o array esteja cheio, vai duplicar 
    		int tamAux = elementos.length*2;
    		No[] arrayTemp = new No[tamAux];
    		arrayTemp = Arrays.copyOf(elementos, elementos.length);
    		elementos=arrayTemp;
    		arrayTemp=null;
		}

		int f = elementos.length+1;
		elementos[f] = o;
	}
	@Override
	public void remove(No n) throws ESequenciaVazia {
		if (isEmpty) 
			throw new ESequenciaVazia("A Sequência está Vazia!"); 
		for (int i; i < size() ; i++) {
			if
		}
	}

	@Override
	public No atRank(int r) {
		return elementos[r];
	}

	@Override
	public int rankOf(No n) {
		return n.getRank();
	}
}
