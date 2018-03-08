package PilhaListaLigada;

public class PilhaListaLigada implements IPilha{
	
	No t = null;
	
	@Override	
	public int size() {
		No controle = t;
		int count = 0;		
		while(controle != null){
			count++;
			controle = controle.getProximo();
		}
		return count;		
	}

	@Override
	public boolean isEmpty() {
		return t == null;
	}

	@Override
	public Object top() throws EPilhaVazia {
		if(isEmpty())
			throw new EPilhaVazia("A Pilha está vazia");
		return t.getElemento();
		
	}

	@Override
	public void push(Object o) {
		No controle = new No();
		controle.setProximo(t);
		controle.setElemento(o);
		t = controle;			
	}

	@Override
	public Object pop() throws EPilhaVazia {
		  
		No controle = t; 
		if(isEmpty())
			throw new EPilhaVazia("A Pilha está vazia");
		t = controle.getProximo();
		return controle.getElemento();
	} 
	
	public void print(){
		No controle = t;
		while(controle != null){
			System.out.println("Elementos:" + controle.getElemento());
			controle = controle.getProximo();
		}
	}
}
  