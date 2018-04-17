
public class Arvore implements iArvore {

	private No raiz;
	private No[] arvore; 
	
	public Arvore(){
		raiz = null;
		arvore = new No[10];
	}
	
	
	@Override
	public void inserir(Object n) {
		if(raiz == null){
			arvore[1] = new No(n, 1);
		}else{
			int indiceNovoItem = localInserir(1, n);
			arvore[indiceNovoItem] = new No(n, indiceNovoItem);
		}
		
	}

	@Override
	public void remover(Object n) {
		// TODO Auto-generated method stub
		
	}
	
	private void  duplicarArray(){
		No[] temp = new No[arvore.length * 2];
		for(int i = 0; i < arvore.length; i++){
			temp[i] = arvore[i];
		}
		arvore = temp;
	}

	private int localInserir(int indiceAtual, Object valor){
		if(indiceAtual >= arvore.length){
			duplicarArray();
		}
		if(arvore[indiceAtual] == null){
			return indiceAtual;
		}else{
			if((Integer)arvore[indiceAtual].getValor() < (Integer)valor){
				return localInserir((2*indiceAtual)+1, valor);
			}else{
				return localInserir(indiceAtual*2, valor);
			}
		}
		//return 0;			
	}
	
	private No buscar(int indice, Object valor){
		if(raiz != null){
			if((Integer)arvore[indice].getValor() == (Integer)valor){
				return arvore[indice];
			}else{
				if((Integer)arvore[indice].getValor() < (Integer)valor)
					buscar(indice * 2, valor);
				else
					buscar((2* indice)+1, valor);
			}
		}
		return null;
	}
	
	@Override
	public No buscar(Object n) {
		return buscar(1,n);
	}

	

}
