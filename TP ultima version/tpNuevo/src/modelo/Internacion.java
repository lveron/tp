package modelo;

import TP.Fecha;

public class Internacion {
	String area;
	Fecha fechaIngreso;
	Fecha fechaAlta;
	
	Internacion (String a, Fecha f){

	this.area=a;
	this.fechaIngreso=f;
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
