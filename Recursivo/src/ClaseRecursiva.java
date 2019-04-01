
public class ClaseRecursiva {


	public int potenciaR(int x, int y) {
		if (y==1)
			//el caso b�sico es que cualquier n�mero elevado a 1 (y=1) es el mismo n�mero (x)
		    return x;
		else
			//para el resto de casos, la f�rmula es x*x(y-1) (x elevado a y-1)
			return x * this.potenciaR(x,y-1);
	}
	
	//M�todo Iterativo
	public int potenciaI(int x, int y){
		int resultado=1;
		for (int i=1; i<=y; i++){
			resultado= resultado*x;
		}
		return resultado;
	}
}
