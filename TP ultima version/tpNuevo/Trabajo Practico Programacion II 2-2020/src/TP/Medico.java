package TP;

public class Medico {
	private String nombre;
	private int Matricula;//VER!!!!!!!!!!!!!
	private String especialidad;
	private float precio;
	private String tratamiento; //VER!!!!!!!!!
	
	public Medico(String n, int m, String e, float p) {
		this.nombre= n;
		this.Matricula=m;
		this.especialidad=e;
		this.precio=p;
	}
	
	String getEspecialidad() {
		return especialidad;
	}
	
	float getPrecio() {
		return precio;
	}
	
	String getTratamento() {
		return tratamiento;
	}
}