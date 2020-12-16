package modelo;

import TP.Fecha;
//para los de consultorio
public class AtencionGuardia extends Atencion {
	private Fecha fecha;
	private int importe;
	
	public AtencionGuardia(Fecha f){
		super(f);
		this.importe=0;
	}
	
	
	public Fecha getFecha() {
		return fecha;
	}
	public int getImporte() {
		return importe;
	}
}
