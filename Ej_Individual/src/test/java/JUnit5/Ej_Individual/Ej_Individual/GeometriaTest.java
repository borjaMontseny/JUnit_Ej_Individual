package JUnit5.Ej_Individual.Ej_Individual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	public void testObjeto() {
		Geometria geometria = new Geometria(1);
		assertNotNull(geometria);
	}

	@Test
	public void testObjeto1() {
		Geometria geometria = new Geometria();
		assertNotNull(geometria);
	}

	@Test
	public void testAreaCuadrado() {
		Geometria prueba = new Geometria();
		int resultado = prueba.areacuadrado(2);
		int esperado = 4;
		assertEquals(resultado, esperado);

	}
	
	@Test
	public void testAreaCirculo() {
		Geometria prueba = new Geometria();
		double resultado = prueba.areaCirculo(3);
		System.out.println(resultado);
		double esperado = 28.2744;
		double delta = 0; // Margen de error
		assertEquals(resultado, esperado, delta);
	}
	
	@Test
	public void testAreaTriangulo() {
		Geometria prueba = new Geometria();
		double resultado = prueba.areatriangulo(2, 5);
		System.out.println(resultado);
		double esperado = 28;
		double delta = 1;
		assertEquals(resultado, esperado, delta);
	}
	
}
