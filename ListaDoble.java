package epn;

import javax.swing.JOptionPane;

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
	        if(primero==null) return true;
	        else return false;
	    }
	 
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
	    
	    public ListaDoble borrar(int a)
	    {
	    	NodoDoble w=primero;
	    	NodoDoble y;
	        for(int i=0;i<a;i++)
	        {
	            y=w.ant;
	            w=w.next;
	        }
	        y=w.ant;
	        return this;
	    }
	 
	    public boolean deletePORDATO(int num)
	    {
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
	        if(num==ultimo.dato)
	        {
	            ultimo=actual.ant;
	            return true;
	        }
	        return false;
	    }
	 
	    //IMPRIMIR
	        public void imprimirNORMAL()
	    {
	        	NodoDoble actual;
	        actual=ultimo;
	        while(actual!=primero)
	        {
	            System.out.println(actual.dato);
	            actual=actual.ant;
	        }
	                System.out.println(actual.dato);
	 
	    }
	        
	        public void imprimirINVERSA()
	    {
	        	NodoDoble actual;
	        actual=primero;
	        while(actual!=ultimo)
	        {
	            System.out.println(actual.dato);
	            actual=actual.next;
	        }
	                System.out.println(actual.dato);
	                 
	    }
	        
	        public void buscar(){
	        	
	        }
	  
}
