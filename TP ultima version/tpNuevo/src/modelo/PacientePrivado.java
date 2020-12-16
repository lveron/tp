package modelo;

import java.util.ArrayList;

import TP.Especialidad;
import TP.Fecha;
import TP.Medico;

public class PacientePrivado extends Paciente{
	private Fecha f;
	private Especialidad e;
	private Medico m;
	
	private AtencionConsultorio atencionNuevaEnConsultorio;
	private AtencionGuardia atencionNuevaEnGuardia;
	private ArrayList <Atencion> atenciones;
	
	public PacientePrivado(String nombr, int hc, Fecha fechaNacimiento) {
		super(nombr, hc, fechaNacimiento);
	}
	//------------------------Agregar atenciones--------------------------------------
	public void AgregarAtencionConsultorio(Fecha f, int matricula) {
		atencionNuevaEnConsultorio= new AtencionConsultorio (f, matricula);
		boolean existeFecha=false;
		for(Atencion a: atenciones) {
			existeFecha = existeFecha || a.getFecha().equals(f);
		}
		if(!existeFecha) {
			atenciones.add(atencionNuevaEnConsultorio);
		}
		throw new RuntimeException("Solo se permite una atencion por fecha");
	}
	
	public void AgregarAtencionGuardia(Fecha f) {
		atencionNuevaEnGuardia= new AtencionGuardia (f);
		boolean existeFecha=false;
		for(Atencion a: atenciones) {
			existeFecha = existeFecha || a.getFecha().equals(f);
		}
		if(!existeFecha) {
			atenciones.add(atencionNuevaEnGuardia);
		}
		throw new RuntimeException("Solo se permite una atencion por fecha");
	}
	
	//----------------------------------------------------------------------------------
	
	public String toString() {
		return super.toString() + "Fecha: " + f + "Especialidad: " + e + "Médico: " + m;
	}
}
