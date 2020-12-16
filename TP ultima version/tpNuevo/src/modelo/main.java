package modelo;

import java.util.ArrayList;
import java.util.HashMap;

import TP.Diccionario;
import TP.Especialidad;
import TP.Fecha;
import TP.Medico;
import TP.Tupla;


public class main {


	public static void main(String[] args) {
		//-----------------------------prueba de pacientes---------------------------------------
		// TODO Auto-generated method stub
		Fecha f = new Fecha (29, 01, 1999);
		//Especialidad e = new Especialidad (2, "Cardiologia");
		Medico m = new Medico("Algo", 3, "Cardiologia", 10);
		
		Integer hc = 11;
		//pacientes.definir(hc, p);
		Integer hc2= 122;
		//PacientePrivado p = new PacientePrivado ("l", hc2, f, f, e, m );


		ArrayList<Paciente> pacientes0 = new ArrayList <Paciente>();
		PacienteAmbulatorio pacienteNuevo =new PacienteAmbulatorio("x", hc, f);
		PacienteAmbulatorio pacienteNuevo2 =new PacienteAmbulatorio("L", hc, f);
		//pacientes0.add(p);
		
		

		//Diccionario <Integer, Paciente> pacientes;
		

		  HashMap<Integer,Paciente> pacientes = new HashMap<Integer, Paciente>(); 
		 // pacientes.put(hc, pacienteNuevo);
		 // pacientes.put(hc2, p);
		  if (pacientes.containsKey(hc)) {
			  throw new RuntimeException("ya esta");
		  }
		  else {
			  pacientes.put(hc, pacienteNuevo2);
		  }
		  
		 // System.out.println(pacientes.get(hc2));
		  System.out.println(pacientes.get(hc));
		 // System.out.println(getSaldo(10, pacientes));

		  
		  
		  
		  //especialidad---------------------------------------------------------------
			ArrayList<Especialidad> especialidades = new ArrayList <Especialidad>();
			boolean especialidadDefinida=false;
			Especialidad  EspecialidadNueva = new Especialidad ("cardiologia", 400);
			especialidades.add(EspecialidadNueva);
			
			Especialidad  EspecialidadNueva2 = new Especialidad ("pediatria", 400);
			//recorre la lista especialidad para saber si ya se encuentra
			for(Especialidad e1: especialidades) {
					especialidadDefinida= especialidadDefinida || e1.getNombreDeEspecialidad()=="pediatria";
			}
			if(!especialidadDefinida) {
				especialidades.add(EspecialidadNueva2);
			}
			
			System.out.println(especialidades.get(0).getNombreDeEspecialidad());
			System.out.println(especialidades.get(1).getNombreDeEspecialidad());
			//---------------------------------------------------------------------------
			
			//medicos--------------------------------------------------------------------
			HashMap<Integer,Medico> medicos = new HashMap<Integer, Medico>(); 
			int matricula = 777;
			Medico medicoNuevo = new Medico ("abc", matricula, "neumologia", 500);
			medicos.put(matricula, medicoNuevo);
			//VER SI LO VUELVE A DEFINIR O NO
			if(medicos.containsKey(matricula)) {
				throw new RuntimeException("ya esta");
			}
			medicos.put(matricula, medicoNuevo);
			
			System.out.println(medicos.get(matricula).getNombre());
	}

		
	
	private static Exception newRuntimeException() {
		// TODO Auto-generated method stub
		return null;
	}
	
	static int getSaldo (Integer hc, HashMap pacientes) {
		if(pacientes.containsKey(hc)) {
			return ((Paciente) pacientes.get(hc)).getSaldo();
		}
		throw new RuntimeException ("no se encuentra esta historia clinica");
	}

}
