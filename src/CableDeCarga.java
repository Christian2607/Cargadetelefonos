
public class CableDeCarga {
	
	private String ladoUSB;
	private String ladoTelefono;

	public CableDeCarga(String a, String b) {
		
		setladousb(a);
		setLadotelefono(b);
		
	}
	
	public void setladousb(String l)
	{
		ladoUSB = l;
	}
	
	public String getLadoUSB()
	{
		return ladoUSB;
	}
	
	public void setLadotelefono(String s)
	{
		ladoTelefono = s;
	}
	
	public String getLadotelefono()
	{
		return ladoTelefono;
	}
	
}
