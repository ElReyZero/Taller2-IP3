package uniandes.dpoo.taller2.productos.modelo;

public class producto implements IProducto 
{
	
	//* Atributos//
	protected String nombre;
	protected Double peso;
	protected Double volumen;
	protected boolean perecedero;
	protected Double maxTemp;
	
	//*Constructor//
	
	public producto(String pNombre, Double pPeso, Double pVolumen, boolean pPerecedero, Double pMaxTemp)
	{
		nombre = pNombre;
		peso = pPeso;
		volumen = pVolumen;
		perecedero = pPerecedero;
		maxTemp = pMaxTemp;
	}
	
	
	//*Métodos//
	
	public Boolean compararProd(producto pProducto2)
	{
		if(this.darNombre().equals(pProducto2.darNombre()))
		return true;
		else
		return false;
	}

	public String darCaracteristicas()
	{
		String name = nombre.toString();
		String weight = peso.toString();
		String vol = volumen.toString();
		String temp = maxTemp.toString();
		String resultado = ""+name+" "+weight+" "+vol+" "+perecedero+" "+temp;
		return resultado;

	}

	public String darNombre()
	{
		return nombre;
	}

	public Double darPeso()
	{
		return peso;
	}

	public Double darVolumen()
	{
		return volumen;
	}

	public boolean darTipoPerecedero()
	{
		return perecedero;
	}

	public Double darTempMax()
	{
		return maxTemp;
	}
}
