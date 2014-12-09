package modelo;

public class Bombilla {

	private int vatios;
	private String estado;
	
	public int getVatios() {
		return vatios;
	}

	public void setVatios(int vatios) {
		this.vatios = vatios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Bombilla (int vatios, String estado){
		this.vatios=vatios;
		if(!estado.equals("Encendido") && !estado.equals("Apagado"))
			estado="Encenido";
		this.estado=estado;
	}
	
	public String pulsarInterruptor(){
		if(estado.equals("Apagado"))
			estado="Encendido";
		else 
			estado="Apagado";
		return estado;
	}
}
