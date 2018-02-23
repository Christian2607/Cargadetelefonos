package ClasesAbstractas;


public abstract class Cubito {
	
	private String tipo;
	
	public Cubito(String tipo)
	{
		setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
