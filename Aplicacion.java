package epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
	
	       ListaDoble a=new ListaDoble();
	       a.AgregarInicio(15);
	       a.AgregarInicio(16);
	       a.AgregarInicio(17);
	       a.AgregarInicio(18);
	       a.AgregarInicio(19);
	       a.AgregarFin(1);
	       a.AgregarFin(2);
	       a.AgregarFin(3);
	      System.out.println("Impresion Normal"); 
	       a.imprimirNORMAL();
	       System.out.println("Impresion Inversa"); 
	       a.imprimirINVERSA();
	       System.out.println("borrar el elemento 19"); 
	       a.deletePORDATO(19);
	       a.imprimirNORMAL();
	       System.out.println("borrar todo"); 
	       a.borrar(5);
	       a.imprimirNORMAL();
}}
