package TP;

import java.util.ArrayList;

public class Centro {

	private String nombre;
	private String cuit;
	private int diarioInternacion;
	private Conjunto <Especialidad> Especialidades;
	private Conjunto <Medico> medicos;
	private Conjunto <Paciente> pacientesPrivados;
	private Conjunto <Paciente> pacientesAmbulatorios;
	private Conjunto <Paciente> pacientesInternacion;
	private Conjunto <AtencionGuardia> atencionEnGuardia;
	private Conjunto <AtencionConsultorio> atencionesEnConsultorio;
	private Conjunto <Internacion> listaInternacion;
	private Conjunto <Tratamiento> Tratamientos;

	
	public Centro(String n, String c, int d) {
		this.nombre= n;
		this.cuit=c;
		this.diarioInternacion=d;
		Especialidades = new Conjunto<Especialidad>();
		medicos = new Conjunto<Medico>();
		pacientesPrivados = new Conjunto <Paciente>();
		pacientesAmbulatorios = new Conjunto<Paciente>();
		pacientesInternacion= new Conjunto <Paciente>();
		atencionEnGuardia = new Conjunto <AtencionGuardia>();
		atencionesEnConsultorio = new Conjunto <AtencionConsultorio>();
		listaInternacion = new Conjunto <Internacion>();
		Tratamientos = new Conjunto <Tratamiento>();		
		
	}
	//hc= numero de historia clinica, con eso se identifica al paciente
	//-----------Agrega una especialidad nueva al conjunto----------------------
	public void agregarEspecialidad (String nombre, float valor) {
		
		Especialidad  EspecialidadNueva = new Especialidad (valor, nombre);
		Especialidades.agregar(EspecialidadNueva);
		
	}
	//--------------------------Registra a los medicos en una lista--------------------
	public void agregarMedico(String nombre, int matricula, String especialidad, float precio) {
		Medico medicoNuevo = new Medico (nombre, matricula, especialidad, precio);
		medicos.agregar(medicoNuevo);
	}
	
	//----------------------------------------------------------------------------------
	public void agregarPacientePrivado(String nombre, int hc, Fecha fecha) {
		Paciente NuevoPacientePrivado = new Paciente (nombre, hc, fecha);
		pacientesPrivados.agregar(NuevoPacientePrivado);
	}
	
	//-----------------------------------------------------------------------------------
	public void agregarPacienteAmbulatorio(String nombre, int hc, Fecha fecha) {
		Paciente NuevoPacienteAmbulatorio = new Paciente (nombre, hc, fecha);
		pacientesAmbulatorios.agregar(NuevoPacienteAmbulatorio);
	}
	
	//-----------------------------------------------------------------------------------
	//HACER UNA CLASE PACIENTE OBRA SOCIAL?
	public void agregarPacienteObraSocial(String nombre, int hc, Fecha fecha, String obraSocial, double d) {
		Paciente NuevoPacienteObraSocial = new Paciente (nombre, hc, fecha);
		NuevoPacienteObraSocial.setObraSocial(obraSocial);
		NuevoPacienteObraSocial.setPorcentajeAPagar(d);
		pacientesInternacion.agregar(NuevoPacienteObraSocial);
		
	}
	//-----------------------------------------------------------------------------------
	//anteciones en guardia
	public void agregarAtencion (int i, Fecha fecha) {
		AtencionGuardia NuevaAtencionEnGuardia = new AtencionGuardia (i, fecha);
		atencionEnGuardia.agregar(NuevaAtencionEnGuardia);
	}
	//atenciones en consultorio
	public void agregarAtencion(int hc, Fecha fecha, int matricula) {
		AtencionConsultorio NuevaAtencionEnConsultorio = new AtencionConsultorio(hc, fecha, matricula);
		atencionesEnConsultorio.agregar(NuevaAtencionEnConsultorio);
	}
	//-----------------------------------------------------------------------------------
	public void agregarInternacion (int i,String area, Fecha fechaIngreso){
		Internacion NuevaInternacion = new Internacion(i, area, fechaIngreso);
		listaInternacion.agregar(NuevaInternacion);
	}
	
	
	//le añade el alta a la internacion

	public void altaInternacion (int i, Fecha f) {
		while (listaInternacion.dameUno()!=null) {
			if (listaInternacion.dameUno().getHC()==i){
				
				if (listaInternacion.dameUno().getFechaIngreso().FechaAltaEsMayorQueFechaIngreso(f)) {
					listaInternacion.dameUno().setFechaAlta(f);				
				}
				else {
					throw new RuntimeException ("El alta no puede ser igual o menor que el ingreso");
				}
				}
		}
	}
	
	Especialidad conocerAtenciones (Paciente p) {
		while (pacientesPrivados!=null) {
			if(pacientesPrivados.dameUno().equals(p)) {
				return pacientesPrivados.dameUno().getRegistroDeAtenciones();
				}
		}

	}
	//-----------------------------------------------------------------
	public void agregarTratamiento(int hc, int m, String d) {
		Tratamiento NuevoTratamiento = new Tratamiento(hc, m ,d);
		Tratamientos.agregar(NuevoTratamiento);
		
	}

	//-------------------------------------------
	//no se termino de implementar los siguientes:
	String conocerEspecialidad(Paciente p) {
		return "Especialidad:" ;
	}

	Fecha conocerFecha(Paciente p) {
		return pacientesConsultorio.definicion2(p);
	}
	//-----------------------------------------------------------------------------------
	int getSaldo (int x) {
		return 0;
	}

	//---------------------------Verifica si el pago esta completado-----------------------------
	boolean pagoCompleto (Paciente p) {
		if (p.getEstadoDeCuenta() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//---------------------------se paga en caso que el pago no este completo--------------------
	boolean pagarSaldo (int a) {
		p.setEstadoDeCuenta(a);
		

	}
}