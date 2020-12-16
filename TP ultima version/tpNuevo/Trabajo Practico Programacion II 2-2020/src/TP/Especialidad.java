package TP;

public class Especialidad {
	private int codigo;
	private float precio;
	private String nombre;
	

	public Especialidad(float valor, String nombre2) {
		// TODO Auto-generated constructor stub
		this.precio= valor;
		this.nombre=nombre2;
	}


	int getCodigo() {
		return codigo;
	}
	float getPrecio() {
		return precio;
	}
	
	String getNombreDeEspecialidad() {
		return nombre;
	}

}