package modelo;

import java.util.ArrayList;

import TP.Fecha;

public class PacienteAmbulatorio extends Paciente {
	
	private ArrayList <Tratamiento> tratamientos;
	
	public PacienteAmbulatorio(String nombr, int hc, Fecha fechaNacimiento) {
		super(nombr, hc, fechaNacimiento);
		tratamientos = new ArrayList <Tratamiento>();
		// TODO Auto-generated constructor stub
	}
	
	public void añadirTratamientos(Tratamiento t) {
		tratamientos.add(t);
	}
	
	public String toString() {
		return super.toString() + "Tratamiento: " + tratamientos;
	}
}
