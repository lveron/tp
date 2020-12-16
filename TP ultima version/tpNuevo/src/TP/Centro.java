package TP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.AtencionConsultorio;
import modelo.AtencionGuardia;
import modelo.Internacion;
import modelo.Paciente;
import modelo.PacienteAmbulatorio;
import modelo.PacienteObraSocial;
import modelo.PacientePrivado;
import modelo.Tratamiento;

public class Centro {

	private String nombre;
	private String cuit;
	private int diarioInternacion;
	
	private Map <Integer,Paciente> pacientes;
	private Map <Integer,Medico> medicos;
	private ArrayList <Especialidad> especialidades;
	
	//--------------------------ver-------------------------------------------
	private Conjunto <Internacion> listaInternacion;
	private Conjunto <Tratamiento> Tratamientos;

	
	public Centro(String n, String c, int d) {
		this.nombre= n;
		this.cuit=c;
		this.diarioInternacion=d;
		
		pacientes = new HashMap<Integer, Paciente>();
		medicos= new HashMap<Integer, Medico>();
		especialidades= new ArrayList<Especialidad>();
		
		//--------------------------ver----------------------------------------------
		listaInternacion = new Conjunto <Internacion>();
		Tratamientos = new Conjunto <Tratamiento>();		
		
	}
	//hc= numero de historia clinica, con eso se identifica al paciente
	
	//--------------------AÑADIR UNA NUEVA ESPECIALIDAD----------------------------------------------
	public void agregarEspecialidad (String nombre, double valor) {		
		boolean especialidadDefinida=false;
		Especialidad  EspecialidadNueva = new Especialidad (nombre, valor);
		//recorre la lista especialidad para saber si ya se encuentra la especialidad nueva
		for(Especialidad e: especialidades) {
				especialidadDefinida= especialidadDefinida || e.getNombreDeEspecialidad()==nombre;
		}
		if(!especialidadDefinida) {
			especialidades.add(EspecialidadNueva);
		}
		else {
			throw new RuntimeException("Esta especialidad ya fue registrada");
		}
		
	}
	//------------------------REGISTRAR MEDICOS(revisar)------------------------------------------------------
	public void agregarMedico(String nombre, int matricula, String especialidad, double valorTratamiento) {
		Medico medicoNuevo = new Medico (nombre, matricula, especialidad, valorTratamiento);
		//VER SI LO VUELVE A DEFINIR O NO
		if(medicos.containsKey(matricula)) {
			throw new RuntimeException("Esta matricula ya se encuentra ocupada, por favor ingrese una nueva");
		}
		medicos.put(matricula, medicoNuevo);
	}
	
	//------------------------REGISTRAR A TODOS LOS PACIENTES------------------------------------------
	
	public void agregarPacientePrivado(String nombre, int hc, Fecha fecha) {
		PacientePrivado NuevoPacientePrivado = new PacientePrivado (nombre, hc, fecha);
		if(pacientes.containsKey(hc)) {
			throw new RuntimeException("Ingrese una nueva historia clinica");
		}
		pacientes.put(hc, NuevoPacientePrivado);
	}
	
	//-----------------------------------------------------------------------------------
	
	public void agregarPacienteAmbulatorio(String nombre, int hc, Fecha fecha) {
		PacienteAmbulatorio NuevoPacienteAmbulatorio = new PacienteAmbulatorio (nombre, hc, fecha);
		if(pacientes.containsKey(hc)) {
			throw new RuntimeException("Ingrese una nueva historia clinica");
		}
		pacientes.put(hc, NuevoPacienteAmbulatorio);
	}
	
	//-----------------------------------------------------------------------------------
	//VER ESTE, PREGUNTAR
	public void agregarPacienteObraSocial(String nombre, int hc, Fecha fecha, String obraSocial, double p) {
		PacienteObraSocial NuevoPacienteObraSocial = new PacienteObraSocial (nombre, hc, fecha, obraSocial, p);
		if(pacientes.containsKey(hc)) {
			throw new RuntimeException("Ingrese una nueva historia clinica");
		}
		pacientes.put(hc, NuevoPacienteObraSocial);
		
	}
	
	//-------------------------------------AGREGAR ATENCIONES----------------------------------------------
	//para pacientes privados:
	//anteciones en guardia
	public void agregarAtencion (int hc, Fecha fecha) {
		
	}
	//atenciones en consultorio
	public void agregarAtencion(int hc, Fecha fecha, int matricula) {
	}
	//-----------------------------------------------------------------------------------
	public void agregarInternacion (int hc,String area, Fecha fechaIngreso){
	}
	
	
	//le añade el alta a la internacion

	public void altaInternacion (int i, Fecha f) {
	
	}
	
	Especialidad conocerAtenciones (Paciente p) {

	}
	//-----------------------------------------------------------------
	public void agregarTratamiento(int hc, int m, String d) {
		if (pacientes.containsKey(hc)) {
			Tratamiento nuevoTratamiento = new Tratamiento(m,d);//VER
			if(pacientes.get(hc) instanceof PacienteAmbulatorio) { //Si es de tipo paciente ambulatorio
				PacienteAmbulatorio PacienteX = (PacienteAmbulatorio) pacientes.get(hc); //en pacienteX me da todos sus datos
				PacienteX.añadirTratamientos(nuevoTratamiento);
			}
		}

	}

	//-------------------------------------------
	//no se termino de implementar los siguientes:
	String conocerEspecialidad(Paciente p) {

	}

	Fecha conocerFecha(Paciente p) {
	}
	//-----------------------------------------------------------------------------------
	int getSaldo (Integer hc) {
		if(pacientes.containsKey(hc)) {
			return pacientes.get(hc).getSaldo();
		}
		throw new RuntimeException ("no se encuentra esta historia clinica");
	}

	//---------------------------Verifica si el pago esta completado-----------------------------
	boolean pagoCompleto (Paciente p) {

	}
	//---------------------------se paga en caso que el pago no este completo--------------------
	boolean pagarSaldo (int hc) {
	

	}
}