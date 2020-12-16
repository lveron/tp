package TP;

public class Tratamiento {
	private int hc;
	private int matricula;
	private String descripcion;
	
	public Tratamiento(int hc, int m, String d) {
		this.hc=hc;
		this.matricula=m;
		this.descripcion=d;
	}
	
	int getHC() {
		return hc;
	}
	
	int getMatricula() {
		return matricula;
	}
	String getDescripcion() {
		return descripcion;
	}
}
