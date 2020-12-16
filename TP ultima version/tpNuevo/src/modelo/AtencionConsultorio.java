package modelo;

import TP.Fecha;
//tambien para pacientes privados
public class AtencionConsultorio extends Atencion {
	private int matricula;
	//ver si se pone la matricula
	AtencionConsultorio(Fecha f, int matricula){
		super(f);
		this.matricula=matricula;
	}
	
	int getMatricula() {
		return matricula;
	}
	

}
