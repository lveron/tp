package modelo;

import TP.Medico;

public class Tratamiento {
	private Medico m;
	private String descripcion;
	
	public Tratamiento(Medico m, String d) {
		this.m = m;
		this.descripcion=d;
	}
	
	String getDescripcion() {
		return descripcion;
	}
}
