
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
		System.out.println("<<-- Lista -->>");
		a.listarN();
		System.out.println("Impresion Normal"); 

		a.listarN();
		System.out.println("Impresion Inversa"); 
		a.listarIN();

		System.out.println("buscar por referencia el 15"); 
		System.out.println(a.buscar(15));

		System.out.println("\nObtener el valor del nodo en la posicion 1");
		System.out.println(a.buscarP(1));
		System.out.println("borrar el elemento 19"); 
		a.borrarPorDato(19);
		a.listarN();
		System.out.println("\nElimina el nodo en la posición 7");
		a.removerPorPosicion(7);        
		a.listarN();
		System.out.println("borrar todo"); 
		a.borrar();
		a.listarN();
	}
}
