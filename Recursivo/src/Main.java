
public class Main {

	public static void main(String[] args) {
		
		//creamos un objeto de la clase ClaseRecursiva
		ClaseRecursiva objeto= new ClaseRecursiva();
		
		//Ejecutamos y sacamos por pantalla el método recursivo 
		System.out.println(objeto.potenciaR(2,3));
		
		//Ejecutamos y sacamos por pantalla el método iterativo
		System.out.println(objeto.potenciaI(2,5));

	}
}
