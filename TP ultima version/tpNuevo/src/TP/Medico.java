package TP;

public class Medico extends Especialidad{
	private String nombre;
	private int Matricula;
	private Especialidad esp;
	
	public Medico (String n, int m, String e, double valorTratamiento) {
		super(e, valorTratamiento);
		this.nombre= n;
		this.Matricula=m;
		//this.especialidad=e;
		//this.valorTratamiento=valorTratamiento;
		esp = new Especialidad(e, valorTratamiento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getMatricula() {
		return Matricula;
	}
	
	public Especialidad getEspecialidad() {
		return esp;
	}
}