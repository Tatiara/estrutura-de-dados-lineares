package Fila;

public class FilaArray implements iFila {
	private Object[] elementos;
    private int i = 0;
    private int f = 0;
    
    public FilaArray(int tam){
        elementos = new Object[tam];
    }
    
    
    @Override
    public int size() {
        return (elementos.length - i + f) % elementos.length;
    }

    @Override
    public boolean isEmpty() {
        return (i==f);
    }

    @Override
    public Object begin() throws EFilaVazia {
        if(isEmpty())
        	throw new EFilaVazia("A Fila está vazia");
        return i;
    }

    @Override
    public void queue(Object o) {
    	if (size() == (elementos.length - 1)){
    		int tamAux = elementos.length*2;
    		Object[] temp = new Object[tamAux];
    		System.out.println(tamAux);
    		for (int a = 0; a < elementos.length; a++) {
				temp[a] = elementos[a];
			}
    		elementos = temp;
    		temp = null;
    	}
        elementos[f] = o;
        f = (f + 1) % elementos.length;
    }

    @Override
    public Object deworming() throws EFilaVazia {
        Object o;
    	if (isEmpty())
        	throw new EFilaVazia("A Fila está Vazia");
        else{
        	o = elementos[i];
        	i = (i + 1) % elementos.length;
        	return o;
        } 
        	
    }
    
    public void Mostrar() {
		for(int a = i; a != f ; a = (a + 1) % elementos.length){
			System.out.println("Elementos: " + elementos[a]);			
		}
	}
}
