package epn;
public class NodoDoble {


	int dato;
	NodoDoble next;
	NodoDoble ant;
	
	
	NodoDoble(int a){
		this.dato=a;
		this.next=null;
		this.ant=null;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public NodoDoble getNext() {
		return next;
	}
	public void setNext(NodoDoble next){
		this.next = next;
	}
	public NodoDoble getAnt() {
		return ant;
	}
	public void setAnt(NodoDoble ant) {
		this.ant = ant;
	}
	public int getDato1() {
		// TODO Auto-generated method stub
		return dato;
	}


	
}
