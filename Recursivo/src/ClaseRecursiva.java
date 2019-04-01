
public class ClaseRecursiva {


	public int potenciaR(int x, int y) {
		if (y==1)

		    return x;
		else
			//para el resto de casos, la fórmula es x*x(y-1) (x elevado a y-1)
			return x * this.potenciaR(x,y-1);
	}
	
	//Método Iterativo
	public int potenciaI(int x, int y){
		int resultado=1;
		for (int i=1; i<=y; i++){
			resultado= resultado*x;
		}
		return resultado;
	}
}
