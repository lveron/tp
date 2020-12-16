package TP;

public class Especialidad {
	private int codigo;
	private double valor;
	private String nombre;
	

	public Especialidad(String n, double valor) {
		// TODO Auto-generated constructor stub
		this.valor= valor;
		this.nombre=n;
	}


	public int getCodigo() {
		return codigo;
	}
	public double getValor() {
		return valor;
	}
	
	public String getNombreDeEspecialidad() {
		return nombre;
	}

}