
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono terminal1 = new Telefono("iPhone","6s","APPLE");
		Tomacorriente Europeo = new Tomacorriente("UE",false);
		CableDeCarga Cableandroid = new CableDeCarga("USB","Android");
		Cubito cubo = new Cubito("NA");
		Adaptador xd = new Adaptador();
		Cargartelefono test = new Cargartelefono(terminal1,Europeo,Cableandroid,cubo,xd);
	}

}
