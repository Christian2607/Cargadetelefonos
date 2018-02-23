
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Telefono iPhone1 = new iPhone("iPhone","6s");
		Telefono terminal2 = new Android("Galaxy","S8");
		Tomacorriente Europeo = new TomacorrienteEuropeo(false);
		Tomacorriente Americano = new TomacorrienteEEUU(false);
		CableDeCarga Cableapple = new cargadorapple();
		CableDeCarga Cableandroid = new cargadorandroid();
		Cubito cuboamericano = new CuboAmericano();
		Cubito cuboeuropeo = new CuboEuropeo();
		Adaptador xd = new Adaptador();
		Cargartelefono test1 = new Cargartelefono(iPhone1,Europeo,Cableandroid,cuboamericano,xd);
		Cargartelefono test2 = new Cargartelefono(terminal2,Americano,Cableandroid,cuboamericano,xd);
		
		
	}

}
