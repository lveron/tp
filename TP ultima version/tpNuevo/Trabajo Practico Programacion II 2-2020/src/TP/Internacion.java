package TP;

public class Internacion {
	int hc;
	String area;
	Fecha fechaIngreso;
	Fecha fechaAlta;
	
	Internacion (int hc, String a, Fecha f){
	this.hc=hc;
	this.area=a;
	this.fechaIngreso=f;
	}
	
	int getHC() {
		return hc;
	}
	
	String getArea() {
		return area;
	}
	
	Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	
	Fecha getFechaAlta() {
		return fechaAlta;
	}
	
	void setFechaAlta(Fecha f) {
		this.fechaAlta = f;
	}

}
