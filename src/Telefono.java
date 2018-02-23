
abstract class Telefono {
	 
	private String nombre;
	private String modelo;
	private String PuertoDeCarga;
	

	Telefono(String nombre,String modelo, String PuertoDeCarga)
	{
		setNombre(nombre);
		setModelo(modelo);
		setPuerto(PuertoDeCarga);
	}
	
	public void setNombre(String n)
	{
		nombre = n;
	}
	
	public String getnombre()
	{
		return nombre;
	}
	
	public void setModelo(String m)
	{
		modelo = m;
	}

	public String getmodelo()
	{
		return modelo;
	}
	
	
	public void setPuerto(String p)
	{
		PuertoDeCarga = p;
	}
	
	public String getpuerto()
	{
		return PuertoDeCarga;
	}
	
}
