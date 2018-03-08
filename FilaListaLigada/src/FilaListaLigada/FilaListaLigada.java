package FilaListaLigada;

public class FilaListaLigada implements iFila{
	No i = null;
	No f = null;
	int qtd = 0;
	@Override
	public int size() {
		return qtd;
	}

	@Override
	public boolean isEmpty() {
		return qtd == 0;
	}

	@Override
	public Object begin() throws EFilaVazia {
		if (isEmpty())
			throw new EFilaVazia("A fila está vazia");
		return i;
	}

	@Override
	public void queue(Object o) {
		No temp = new No();
		temp.setElemento(o);
		if(isEmpty()){			
			i = temp;
			i.setProximo(null);
			f = i;			
		}else{
			f.setProximo(temp);
			f = temp;
			f.setProximo(null);			
		}
		qtd++;
	}
	
	@Override
	public Object deworming() throws EFilaVazia {
		No controle = i;
		if (isEmpty())
			throw new EFilaVazia("A fila está vazia");
		i = controle.getProximo();
		qtd--;
		return controle.getElemento();
	}	
	
	public void print(){
		No controle = i;
		while(controle != null){
			System.out.println("Elementos:" + controle.getElemento());
			controle = controle.getProximo();
		}
	}
}
