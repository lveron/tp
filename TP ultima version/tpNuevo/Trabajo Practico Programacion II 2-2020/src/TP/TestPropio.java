package TP;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import TP.Centro;
import TP.Fecha;

public class TestPropio {
	Centro ctro;

	@Before
	public void setUp() throws Exception {
		// nombre, CUIT, valor diario de internacion
		ctro = new Centro("Clinica Fuertes", "30-77888999-5", 5000);

		// nombre, valor de consulta
		ctro.agregarEspecialidad("Traumatología", 3000);
		ctro.agregarEspecialidad("Otorrino-naringologo", 2500);
		ctro.agregarEspecialidad("Oftalmología", 2500);
		
		// nombre, matricula, especialidad, valor de tratamiento
		ctro.agregarMedico("Claudio Díaz", 21005, "Traumatología", 30000);
		ctro.agregarMedico("Ernesto Bravo", 21205, "Otorrino-naringologo", 25000);
		ctro.agregarMedico("Paula Herrera", 21505, "Oftalmología", 25000);
		
		// nombre, nro hc, fecha de nacimiento
		ctro.agregarPacientePrivado("Marcos Asad", 123, new Fecha(4,7,1989));
		ctro.agregarPacienteAmbulatorio("Nicolás González", 345, new Fecha(19,2,1998));
		// nombre, nro hc, fecha de nacimiento,
		// obra social, porcentaje que paga de la internacion
		ctro.agregarPacienteObraSocial("Alan Moreno", 789, new Fecha(28,7,1992),
										"Osplad", 0.2);

		// atenciones en guardia: nro hc, fecha
		ctro.agregarAtencion(321, new Fecha(10,10,2020));
		ctro.agregarAtencion(321, new Fecha(14,12,2020));
		// atenciones en consultorio: nro hc, fecha, matricula del medico
		ctro.agregarAtencion(321, new Fecha(20,1,2021),34567);
		ctro.agregarAtencion(321, new Fecha(21,12,2020),12345);
		ctro.agregarAtencion(321, new Fecha(30,11,2020),34567);

		// nueva internacion: nro hc, area, fecha de ingreso
		ctro.agregarInternacion(432, "General", new Fecha(18,12,2020));
		// alta de internacion: nro hc, fecha de alta
		ctro.altaInternacion(432, new Fecha(30,12,2020));
		ctro.agregarInternacion(432, "Otorrino-naringologo", new Fecha(5,11,2020));
		ctro.altaInternacion(432, new Fecha(1,1,2021));
		
		// tratamiento: nro hc, matricula del medico, descripcion del tratamiento
		ctro.agregarTratamiento(543, 56789, "Operación de rodilla");
		ctro.agregarTratamiento(543, 34567, "Rinoplastia");
	
	}

	@Test
	public void testSaldoPacientePrivado() {
		assertEquals(5000,ctro.getSaldo(321),10);
		ctro.pagarSaldo(321);
		assertEquals(0,ctro.getSaldo(321),1);
	}

	@Test
	public void testSaldoPacienteOSocial() {
		assertEquals(13000,ctro.getSaldo(432),20);
		ctro.pagarSaldo(432);
		assertEquals(0,ctro.getSaldo(432),1);
	}

	@Test
	public void testSaldoPacienteAmbulatorio() {
		assertEquals(27000,ctro.getSaldo(543),10);
		ctro.pagarSaldo(543);
		assertEquals(0,ctro.getSaldo(543),1);
	}

	@Test
	public void testAtencionesEnConsultorio() {
		Map<Fecha,String> aten = ctro.atencionesEnConsultorio(321);
		assertTrue(aten.values().contains("Traumatología"));
		assertTrue(aten.values().contains("Otorrino-naringologo"));
	}

	@Test
	public void testListaInternacion() {
		ctro.agregarInternacion(432, "Traumatología", new Fecha(30,11,2020));

		ctro.agregarPacienteObraSocial("Yamila Rodríguez", 654, new Fecha(24,9,2015),
				"Ospe", 0.3);
		ctro.agregarInternacion(654, "Oftalmología", new Fecha(20,11,2020));
		ctro.altaInternacion(654, Fecha.hoy());

		ctro.agregarPacienteObraSocial("Lautaro Gómez", 765, new Fecha(5,10,1995),
				"Osde", 0.1);
		ctro.agregarInternacion(765, "Traumatología", new Fecha(12,12,2020));

		List<Integer> inter = ctro.listaInternacion();
		assertTrue(inter.contains(432));
		assertTrue(inter.contains(765));
		// nro hc 654 fue dado de alta
		assertFalse(inter.contains(654));
	}

}

