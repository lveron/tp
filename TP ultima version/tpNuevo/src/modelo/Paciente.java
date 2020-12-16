package modelo;


import java.util.Iterator;

import TP.Conjunto;
import TP.Especialidad;
import TP.Fecha;

public abstract class Paciente {
	private String nombre;
	private Fecha edad;
//	private String ObraSocial; //fijarse
//	private float porcentajeAPagar;
	
//	private Conjunto<Especialidad> atenciones;
//	private String TipoPaciente;
//	private String formaDePago;
//	private int vecesQueSeAtendio;
	private int saldo;
	private Integer historiaClinica;
	
	
	public Paciente (String nombre, int hc, Fecha fechaNacimiento) {
		this.nombre= nombre;
		this.edad=fechaNacimiento;
		this.historiaClinica=hc;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Fecha getEdad() {
		return edad;
	}


	public void setEdad(Fecha edad) {
		this.edad = edad;
	}

	public int getSaldo() {
		return saldo;
	}


	public void setEdad(int saldo) {
		this.saldo = saldo;
	}

	public int getHistoriaClinica() {
		return historiaClinica;
	}


	public void setHistoriaClinica(int historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	
	public String toString() {
		return "Nombre paciente; " + nombre + " Historia Clínica: " + historiaClinica +
		" Edad: " + edad;
	}

	//@Override
	//public int compareTo(Paciente p) {
		// Para el mayor > 0 
		// < 0
		// 0 -> equals
		//if(historiaClinica.compareTo(p.historiaClinica) < 0) {
			//return -1;
		//}
		//else if(historiaClinica.compareTo(p.historiaClinica) > 0) {
			//return 1;
		//}
		//return 0;
	}
	


	//VER ESTO
	
//	void setObraSocial (String obraSoc) {
//		this.ObraSocial = obraSoc;
//	}
//	
//	
//	void tipoDePaciente() {
//		if (!ObraSocial.isEmpty()) {
//			TipoPaciente= "";
//		}
//	}
//	
//	void registroDeAtenciones (Especialidad e) {
//		//REVISAR
//		atenciones.agregar(e);
//			//vecesQueSeAtendio ++;			
//		}
//	
//	Especialidad getRegistroDeAtenciones () {
//		return atenciones.dameUno();
//	}
//	
//	void setPorcentajeAPagar(float x) {
//		this.porcentajeAPagar=x;
//	}
//	double getEstadoDeCuenta() {
//		return estadoDeCuenta;
//	}
//	
//	String getFormaDePago() {
//		return formaDePago;
//	}
//	
//	 String getTipoDePaciente() {
//		return TipoPaciente;
//	}
//	 String getObraSocial() {
//		 return ObraSocial;
//	 }
//	 int getVecesQueSeAtendio () {
//		 return vecesQueSeAtendio;
//	 }
//	 
//	 //REVISAR
//	 void setSeAtendio (int x) {
//		 vecesQueSeAtendio +=x;
//	 }
//	 
//	 void setEstadoDeCuenta(int x) {
//		 estadoDeCuenta-=x;
//	 }
//	
//	 
//}