package TP;


import TP.Conjunto;
import TP.Especialidad;

public class Paciente {
	private String nombre;
	private Fecha edad;
	private String ObraSocial; //fijarse
	private float porcentajeAPagar;
	
	private Conjunto<Especialidad> atenciones;
	private String TipoPaciente;
	private String formaDePago;
	private int vecesQueSeAtendio;
	private int estadoDeCuenta;
	
	
	public Paciente (String nombr, int hc/*fijarse a quien se le asigna hc*/, Fecha fechaNacimiento) {
		this.nombre= nombr;
		this.edad = new Fecha();
		this.edad=fechaNacimiento;
		this.estadoDeCuenta=hc;
		Conjunto <Especialidad> atenciones = new Conjunto <Especialidad> ();
	}
	//VER ESTO
	
	void setObraSocial (String obraSoc) {
		this.ObraSocial = obraSoc;
	}
	
	
	void tipoDePaciente() {
		if (!ObraSocial.isEmpty()) {
			TipoPaciente= "";
		}
	}
	
	void registroDeAtenciones (Especialidad e) {
		//REVISAR
		atenciones.agregar(e);
			//vecesQueSeAtendio ++;			
		}
	
	Especialidad getRegistroDeAtenciones () {
		return atenciones.dameUno();
	}
	
	void setPorcentajeAPagar(float x) {
		this.porcentajeAPagar=x;
	}
	double getEstadoDeCuenta() {
		return estadoDeCuenta;
	}
	
	String getFormaDePago() {
		return formaDePago;
	}
	
	 String getTipoDePaciente() {
		return TipoPaciente;
	}
	 String getObraSocial() {
		 return ObraSocial;
	 }
	 int getVecesQueSeAtendio () {
		 return vecesQueSeAtendio;
	 }
	 
	 //REVISAR
	 void setSeAtendio (int x) {
		 vecesQueSeAtendio +=x;
	 }
	 
	 void setEstadoDeCuenta(int x) {
		 estadoDeCuenta-=x;
	 }
	
	 
}