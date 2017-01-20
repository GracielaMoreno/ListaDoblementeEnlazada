package epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {

		ListaDoble a=new ListaDoble();
	
		
		System.out.println("<<-- Lista -->>");
		
		System.out.println("Impresion Normal"); 

		a.listarN();
		
		//nodo nuevo al inicio
		System.out.println("Impresion la lista con los nodos agregados al inicio"); 

		a.AgregarInicio(15);
		a.AgregarInicio(16);
		a.AgregarInicio(17);
		a.AgregarInicio(18);
		a.AgregarInicio(19);
		a.listarN();
		
		System.out.println("Impresion la lista con los nodos agregados al fin"); 
		a.AgregarFin(1);
		a.AgregarFin(2);
		a.AgregarFin(3);
		a.listarN();
		//imprimir lista inversa
		System.out.println("Impresion Inversa"); 
		a.listarIN();
		//elemento buscado 
		System.out.println("buscar por referencia el elemento 20"); 
		System.out.println(a.buscar(20));

		System.out.println("buscar por referencia el elemento 15"); 
		System.out.println(a.buscar(15));
		
		//borrar el elemnto buscado
		System.out.println("borrar el elemento 15"); 
		a.borrarPorDato(15);
		a.listarN();
		
	}
}












//System.out.println("\nObtener el valor del nodo en la posicion 1");
//System.out.println(a.buscarP(1));

//System.out.println("borrar todo"); 
//a.borrar();
//a.listarN();
//imprime la lista
