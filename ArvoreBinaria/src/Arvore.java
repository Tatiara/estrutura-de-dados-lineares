
public class Arvore implements iArvore {

	private No raiz;
	private No[] arvore; 
	
	public Arvore(){
		raiz = null;
		arvore = new No[10];
	}
	
	
	@Override
	public void inserir(Object n) {		
		int indiceNovoItem = localInserir(1, n);
		arvore[indiceNovoItem] = new No(n, indiceNovoItem);
		if(indiceNovoItem == 1)
			raiz = arvore[1];
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
			
			//(arvore[indiceAtual].getValor() < .valor)
			if((((Integer)arvore[indiceAtual].getValor()).compareTo((Integer)valor) < 0 )){
				return localInserir((2*indiceAtual)+1, valor);
				
			}else{
				return localInserir(indiceAtual*2, valor);
			}
		}
		//return 0;			
	}
	
	private Integer buscar(int indice, Object valor){
		Integer retorno = null;
		if(raiz != null){
			//(Integer)arvore[indice].getValor() == (Integer)valor)
			Integer temp = ((Integer)arvore[indice].getValor()); 
			if(temp.compareTo((Integer)valor) == 0 ){
				retorno = ((Integer)arvore[indice].getValor());
			}else{
				if(temp.compareTo((Integer)valor) > 0 )
					return buscar(indice * 2, valor);
				else
					return buscar((2* indice)+1, valor);
			}
		}
		return retorno;
	}
	
	@Override
	public Integer buscar(Object n) {
		return buscar(1,n);
	}	
	
	public void Mostrar() {
		for(int i=0; i<arvore.length; i++){
			if(arvore[i]!=null){
				
				System.out.println("Arvore: " + ((Integer)arvore[i].getValor() ));
			}else
				System.out.println("vazio");
		}
	}
	public String mostArvore (){
		String arvoreBin = "";
		int inicio=1;
		int fim = 1;
		while(inicio<arvore.length){
			for(int i = inicio; i <= fim; i++){
				if(inicio == 1){
					arvoreBin = arvoreBin + ((Integer)arvore[1].getValor()) + "\n";
				}else{
					if(inicio == i){
						arvoreBin = arvoreBin + ((Integer)arvore[1].getValor());
					}else if(inicio != i && i != fim){
						arvoreBin = arvoreBin + " " + ((Integer)arvore[1].getValor());
					}else{
						arvoreBin = arvoreBin + " " + ((Integer)arvore[1].getValor()) + "\n";
					}
				}
			}
			inicio = inicio * 2;
			fim = inicio - 1;
			System.out.println(arvoreBin);
		}
		
		return arvoreBin;
	}


}
	 


