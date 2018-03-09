package PilhaListaLigada;

public class PilhaListaLigada implements IPilha{
	
	No t = null;
	int qtd;
	
	@Override	
	public int size() {
		return qtd;		
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
		qtd++;
	}

	@Override
	public Object pop() throws EPilhaVazia {
		  
		No controle = t; 
		if(isEmpty())
			throw new EPilhaVazia("A Pilha está vazia");
		t = controle.getProximo();
		qtd--;
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
  