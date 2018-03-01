package Pilha;

public class PilhaArray implements iPilha{

	private Object[] elementos;
	private int t = -1;
	public PilhaArray (int tam){
		elementos = new Object[tam];
	}
	
	@Override
	public int size() {
		if(isEmpty())
			return 0;
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		return t == -1;
	}

	@Override
	public Object top() throws EPilhaVazia {
		if(isEmpty())
			throw new EPilhaVazia("A pilha está vazia!"); 
		return elementos[t];
	}

	@Override
	public void push(Object o) {
		if(t == elementos.length-1) {
			int tamAux = elementos.length*2;
			Object[] temp = new Object[tamAux];
			System.out.println(tamAux);
			//System.arraycopy(elementos, 0, temp, 0, elementos.length);
			for (int i = 0; i < elementos.length; i++) {
				temp[i] = elementos[i];
			}
			elementos = temp;
			temp = null;
			//for (int i = 0; i < tamAux; i++) {
				//elementos[i] = temp[i];
			//}
			//System.arraycopy(temp, 0, elementos, 0, temp.length);
		}
		t = t+1;
		elementos[t] = o; 
	}

	@Override
	public Object pop() throws EPilhaVazia {
		if(isEmpty())
			throw new EPilhaVazia("A pilha está vazia!");
		else { 
			Object temp = elementos[t];
			elementos[t] = null;
			t = t - 1;
			return temp;
		}
	}
	
	public void Mostrar() {
		for(int i=0; i<elementos.length; i++){
			System.out.println("Elementos: " + elementos[i]);			
		}
	}
	/*public void mostartemp(){
		for(int i=0; i<temp.length; i++){
			System.out.println("Elementos: " + temp[i]);			
		}
	}*/
}
