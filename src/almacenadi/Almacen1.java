package almacenadi;

/**
 * 
 * @author alumno2017
 * 
 */
public class Almacen1 {
    
	static private final int LIBRE = 0;
	private int tvalores[];
	private int valoresAlmacenados = 0;
	

	public Almacen1(){
		this(10);  
	}


	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	/**
	 *  Pone todas las posiciones a LIBRES
	 */
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	/**
	 * @return una cadena con los valores de la tabla
	 */
	public String toString (){
	String valores = "";
	for (int i = 0;i<tvalores.length;i++)
	{
		if (tvalores[i] != LIBRE)
		{
			valores = "La tabla tiene {" + tvalores[i] + "}";
		}

	}
	return valores;
	}
	
	/**
	 * @return El número de posiciones libres
	 */
	public int numPosicionesLibres(){
		int posicionesLibres = 0;
		for (int i = 0 ; i < tvalores.length; i++)
		{
			if (tvalores[i] == Almacen1.LIBRE)
			{
				posicionesLibres++;
			}
		}
		return posicionesLibres;
	}
	
	
	/**
	 * @return El número de posiciones ocupadas
	 */
	public int numPosicionesOcupadas(){
		int posicionesOcupadas = 0;
		for (int i = 0 ; i < tvalores.length; i++)
		{
			if (tvalores[i] != Almacen1.LIBRE)
			{
				posicionesOcupadas++;
			}
		}
		return posicionesOcupadas;
	}
	
	/**
	 * 
	 * @param num a buscar en el almacen
	 * @return Si esta el valor indicado o no.
	 */
	public boolean estaValor ( int num){
		boolean esta = false;
		for (int i = 0; i < tvalores.length; i++)
		{
			if (tvalores[i] == num)
			{
				esta = true;
			}
		}
	return esta;
	}
	
	/**
	 *  Almacena el valor en la tabla
	 * @param num que quieres almacenar
	 * @return si se ha almacenado el numero o no
	 */
	public boolean ponValor (int num){
	    boolean almacenado = false;
		for (int i = 0; i<tvalores.length ; i++)
		{
			if (tvalores[i] == Almacen1.LIBRE)
			{
				tvalores[i] = num;
				almacenado = true;
				break;
			}

		}
		return almacenado;
	}
		
	
	/**
	 * Elimina el elemento de la tabla
	 * @param num que quieres eliminar
	 * @return si se ha eliminado ese numero
	 */
	public boolean sacarValor (int num){
		boolean borrado = false;
		for (int i=0; i<tvalores.length;i++)
		{
			if (tvalores[i] == num)
			{
				tvalores[i] = Almacen1.LIBRE;
				borrado = true;
			}
		}
	return borrado;
	}
      
	/** 
	 * @return si el almacen esta lleno
	 */
	public boolean estaLleno (){
		boolean lleno = true;
		for (int i=0;i<tvalores.length;i++)
		{
			if (tvalores[i] == LIBRE)
			{
				lleno = false;
				break;
			}
		}
	return lleno;
	}
}