
public class Cargartelefono {
	
	
	public Cargartelefono(Telefono t,Tomacorriente b, CableDeCarga c, Cubito d,Adaptador e) 
	{
		e.Adaptarse(b, d);
		compatibilidad(t,c,b);

	}

	public void compatibilidad(Telefono t,CableDeCarga c, Tomacorriente b)
	{
		if(t.getpuerto()!=c.getLadotelefono())
		{
			System.out.println("Cable no compatible con el terminal, necesitas un cable tipo " +t.getpuerto() +"!");
			System.out.println("---------------------------------------------------------------------------------");
		}
		else
		{
			System.out.println("El " +t.getnombre()+" "+t.getmodelo()+" esta cargando!");
			System.out.println("---------------------------------------------------------------------------------");
			b.setEstado(true);
		}
	}
	
	
	
}
