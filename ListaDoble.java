public class ListaDoble {
	NodoDoble primero;
	NodoDoble ultimo;
	
	ListaDoble()
	{
		primero=null;
		ultimo=null;
	}
	public boolean estavacio()
	{
		if(primero==null)
			return true;
		else 
			return false;
	}
	////////Agregar al inicio --concatena---
	public ListaDoble AgregarInicio(int dat)
	{
		if(estavacio())
		{
			NodoDoble nuevo=new NodoDoble(dat);
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			NodoDoble nuevo=new NodoDoble(dat);
			ultimo.next=nuevo;
			nuevo.ant=ultimo;
			ultimo=nuevo;
		}
		return this;
	}
	//////////////agregarAlFin
	public ListaDoble AgregarFin(int dat)
	{
		if(estavacio())
		{
			NodoDoble nuevo=new NodoDoble(dat);
			ultimo=nuevo;
			primero=nuevo;
		}
		else
		{
			NodoDoble nuevo=new NodoDoble(dat);
			primero.ant= nuevo;
			nuevo.next=primero;
			primero= nuevo;
		}
		return this;
	}
	////borrar la lista completa
	public void borrar()
	{  	  
		primero =null;
		if(primero ==null){
			System.out.println(true);
		}
		else {
			System.out.println(false);  
		}
	}
	/////////borrar por dato
	public boolean borrarPorDato(int num)
	{int a=cuantosElementos();
	a--;
	NodoDoble anterior=null;
	NodoDoble actual=primero;
	while(actual!=ultimo)
	{
		if(actual.dato==num)
		{
			if(anterior==null)
			{
				primero=actual.next;
				primero.ant=null;
			}
			else{
				anterior.next=actual.next;
				NodoDoble temporal;
				temporal=actual.next;
				temporal.ant=anterior;
			}
			return true;
		}
		anterior=actual;
		actual=actual.next;
	}

	System.out.println("Tamaño: "+a);
	if(num==ultimo.dato)
	{
		ultimo=actual.ant;
		return true;
	}

	return false;

	}
	/////////buscar por dato
	public boolean buscar(int referencia){
		NodoDoble  aux =primero;
		boolean encontrado = false;
		while(aux != null ){

			if (referencia == aux.getDato()){

				encontrado = true;
			}
			aux = aux.getNext();
		}

		return encontrado;
	}
	///////////imprimir normar de inico a fim
	public void listarN(){

		if (!estavacio()) {

			NodoDoble aux = ultimo;

			int i = 1;

			while(aux != null){

				System.out.print(i + ".[ " + aux.getDato() + " ]" + "\n");

				aux = aux.getAnt();

				i++;
			}
		}
	}
	///////////imprimir normar de fin a inicio
	public void listarIN(){

		if (!estavacio()) {

			NodoDoble aux = primero;

			int i = 1;

			while(aux != null){

				System.out.print(i + ".[ " + aux.getDato() + " ]" + "\n");

				aux = aux.getNext();

				i++;
			}
		}
	}
	/////tamaño
	public int cuantosElementos(){
		NodoDoble aux;
		int numElementos=0;
		aux = primero;

		//Recorremos
		while(aux != null){
			numElementos++;
			aux = aux.getNext();
		}
		return numElementos;

	}

	public int removerPorPosicion(int pos){

		if (pos <= cuantosElementos ())    {
			int informacion;
			if (pos == 1) {
				informacion = ultimo.dato;
				ultimo = ultimo.ant;
				if (primero!=null)
					primero.ant=null;
			} else {
				NodoDoble reco;
				reco = ultimo;//primero
				for (int f = 1 ; f <= pos-2 ; f++)
					reco = reco.getAnt();
				NodoDoble prox = reco.getAnt();
				reco.ant= prox.ant;
				NodoDoble siguiente=prox.getNext();
				if (siguiente!=null)
					siguiente.next=reco;//ant
				informacion = prox.getDato();
			}
			return informacion;

　
		}

		return pos;

　
	}	

	public int buscarP(int pos){

		if (pos <= cuantosElementos ())    {
			int informacion;
			if (pos == 1) {
				informacion = ultimo.dato;
				//  primero = primero.dato();
				if (primero!=null)
					primero.ant=null;
			} else {
				NodoDoble reco;
				reco = primero;
				for (int f = 1 ; f <= pos - 2 ; f++)
					reco = reco.next;
				NodoDoble prox = reco.next;
				reco.next = prox.next;
				NodoDoble siguiente=prox.next;
				if (siguiente!=null)
					siguiente.ant=reco;
				informacion = prox.dato;
			}
			return informacion;
		}     return pos;
	}

}
