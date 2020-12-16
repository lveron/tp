package TP;

public class AtencionGuardia {
	private Fecha fecha;
	private int hc;
	
	AtencionGuardia(int hc, Fecha f){
		this.fecha=f;
		this.hc=hc;
	}
	
	int getHC() {
		return hc;
	}
	
	Fecha getFecha() {
		return fecha;
	}
}
