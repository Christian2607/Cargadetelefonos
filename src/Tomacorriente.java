
abstract class Tomacorriente {
	
	private String Tipo;
	private boolean Estado = false;
	
	public Tomacorriente(String Tipo, boolean Estado) 
	{
		settipo(Tipo);
		setEstado(Estado);
			
	}

	public void setEstado(boolean E)
	{
		Estado = E;
	}
	
	boolean getEstado()
	{
		return Estado;
	}
	
	public void settipo(String t)
	{
		Tipo = t;
	}
	
	public String gettipo()
	{
		return Tipo;
	}
	
}
