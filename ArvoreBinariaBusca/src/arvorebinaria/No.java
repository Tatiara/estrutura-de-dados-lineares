package arvorebinaria;

public class No {
	
	private Object k;
	private Object o;
	private No parent;
	private No leftChild;
	private No rigthChild;
	
	public No(Object k, Object o, No parent) {
		this.k = k;
		this.o = o;
		this.parent = parent;
	}
	
	public void setKey(Object k) {
		this.k = k;
	}
	
	public Object getKey() {
		return k;
	}
	
	public void setParent(No n) {
		parent = n;
	}
	
	public No getParent() {
		return parent;
	}
	
	public void setElement(Object o) {
		this.o = o;
	}
	
	public Object getElemento() {
		return o;
	}
	
	public void setLeftChild(No leftChild) {
		this.leftChild = leftChild;
	}
	
	public No getLeftChild() {
		return leftChild;
	}
	
	public void setRigthChild(No rigthChild) {
		this.rigthChild = rigthChild;
	}
	
	public No getRigthChild() {
		return rigthChild;
	}
}
