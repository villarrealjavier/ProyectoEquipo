package test.java.com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;

class EquipoTest {

	@Test
	void testEquipoVacioAlPrincipio() {
		Equipo equipoA = new Equipo();
		
		assertEquals(equipoA.getListaAlumno().size(), 0);
	}

	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo();
		equipoA.annadirALumno(new Alumno("JM", "34354656F"));
		
		assertEquals(equipoA.getListaAlumno().size(), 1);
		
	}

	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		Equipo equipoA = new Equipo();
		Alumno alumno = new Alumno("JM", "56565689M");
		equipoA.annadirALumno(alumno);
		
		assertEquals(equipoA.getListaAlumno().size(), 1);
	}
	
	@Test
	void testUnionEquiposVacios() {
		Equipo equipoA = new Equipo();
		Equipo equipoB = new Equipo();

		
		assertTrue(equipoA.unirEquipos(equipoB).getListaAlumno().size()==0);
	}
	
	@Test
	void testUnionEquiposNoVacios() {
	
		Alumno al1 = new Alumno();
		Alumno al2 = new Alumno();
		Alumno al3 = new Alumno();
		Equipo equipo1 = new Equipo();
		equipo1.annadirALumno(al1);
		equipo1.annadirALumno(al2);

		Equipo equipo2 = new Equipo();
		equipo2.annadirALumno(al2);
		equipo2.annadirALumno(al3);

		assertTrue(equipo1.unirEquipos(equipo2).getListaAlumno().size()==3);
	}
	
	@Test
	void testUnionEquiposInterseccion() {
		
		Alumno al1 = new Alumno("AA332211", "Javier");
		Alumno al2 = new Alumno("AA332200", "Fran");
		Alumno al3 = new Alumno("AA332222", "Paco");
		Equipo equipo1 = new Equipo();
		equipo1.annadirALumno(al1);
		equipo1.annadirALumno(al2);
		equipo1.annadirALumno(al3);
		
		Equipo equipo2 = new Equipo();
		equipo2.annadirALumno(al2);
		equipo2.annadirALumno(al3);

		assertTrue(equipo1.interseccionEquipos(equipo2).getListaAlumno().size()==2);
	}
	
	
	


}
