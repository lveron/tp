package modelo;

import java.util.ArrayList;

import TP.Fecha;

public class PacienteObraSocial extends Paciente {

	private String ObraSocial;
	private double porcentajeAbonar;
	private ArrayList <Internacion> internaciones;
	
	
	public PacienteObraSocial(String nombr, int hc, Fecha fechaNacimiento, String ObraSocial, double porcentajeAbonar) {
		super(nombr, hc, fechaNacimiento);
		
		// TODO Auto-generated constructor stub
		this.ObraSocial= ObraSocial;
		this.porcentajeAbonar= porcentajeAbonar;
		internaciones = new ArrayList<Internacion>();
	}

	public String getObraSocial() {
		return ObraSocial;
	}

	public void setObraSocial(String obraSocial) {
		ObraSocial = obraSocial;
	}
	
	public void registrarInternacion(Internacion i) {
		internaciones.add(i);
	}

	public String toString() {
		return super.toString() + "Obra social: " + ObraSocial + "Porcentaje a abonar: " + porcentajeAbonar + "Internaciones: " + internaciones;
	}

}
