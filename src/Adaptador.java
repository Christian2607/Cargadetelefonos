
public class Adaptador {

	private static String tipo;
	
	
	public void Adaptarse(Tomacorriente a, Cubito b)
	{
		a.gettipo();
		if(a.gettipo()!=b.getTipo())
		{
			tipo = a.gettipo();
			System.out.println("se usara un adaptador de "+b.getTipo()+" a " +a.gettipo());
		}
	}
	
	public void settipo(String t)
	{
		tipo = t;
	}
	public String gettipo()
	{return tipo;}
	
	
}
