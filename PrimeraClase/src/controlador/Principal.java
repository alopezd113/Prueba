package controlador;

import modelo.Bombilla;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bombilla bombilla = new Bombilla(4,"Encendido");
		System.out.println(bombilla.pulsarInterruptor());

	}

}
