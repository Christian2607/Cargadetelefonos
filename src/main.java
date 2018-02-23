
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Telefono terminal1 = new Telefono("iPhone","6s","Apple");
		Telefono terminal2 = new Telefono("Galaxy","S8","Android");
		Tomacorriente Americano = new Tomacorriente("NA",false);
		Tomacorriente Europeo = new Tomacorriente("UE",false);
		CableDeCarga Cableapple = new cargadorapple();
		CableDeCarga Cableandroid = new cargadorandroid();
		Cubito cuboamericano = new Cubito("NA");
		Cubito cuboeuropeo = new Cubito("UE");
		Adaptador xd = new Adaptador();
		Cargartelefono test1 = new Cargartelefono(terminal1,Europeo,Cableandroid,cuboamericano,xd);
		Cargartelefono test2 = new Cargartelefono(terminal2,Americano,Cableandroid,cuboamericano,xd);
		
		
	}

}
