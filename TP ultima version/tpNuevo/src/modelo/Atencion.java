package modelo;

import TP.Fecha;

public abstract class Atencion {
	private Fecha fecha;
	
	public Atencion (Fecha f) {
		this.fecha=f;
	}


	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
}
