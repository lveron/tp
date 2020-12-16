package TP;

public class AtencionConsultorio {
	private Fecha fecha;
	private int hc;
	private int matricula;
	
	AtencionConsultorio(int hc, Fecha f, int m){
		this.fecha=f;
		this.hc=hc;
		this.matricula=m;
	}
	
	int getHC() {
		return hc;
	}
	
	Fecha getFecha() {
		return fecha;
	}
	
	int getMatricula() {
		return matricula;
	}

}
