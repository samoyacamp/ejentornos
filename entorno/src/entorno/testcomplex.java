package entorno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcomplex {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	// En todos los metodos lo que hacemos es dale el valor a los numeros complejos
	// luego dar valor al resultado que creemos que debe dar
	// Llamar al metodo que necesitemos para que se haga cargo de realizar la
	// operacion
	// Y por ultimo comprobar si el metodo resultado que es el que esperamos es el
	// mismo que el numero calculado con el metodo utilizado
	@Test
	void sumar() {
		Complex varA = new Complex(1, 2);
		Complex varB = new Complex(2, 2);
		Complex resultado = new Complex(3, 4);
		Complex esperando = varA.sumar(varB);
		assertEquals(resultado, esperando);
	}

	@Test
	void restar() {
		Complex varA = new Complex(1, 7);
		Complex varB = new Complex(1, 5);
		Complex resultado = new Complex(0, 2);
		Complex esperando = varA.restar(varB);
		assertEquals(resultado, esperando);
	}

	@Test
	void multiplicar() {
		Complex varA = new Complex(1, 3);
		Complex varB = new Complex(2, 3);
		Complex resultado = new Complex(2, 9);
		Complex esperando = varA.multiplicar(varB);
		assertEquals(resultado, esperando);
	}

	@Test
	void multiplicar2double() {
		Complex varA = new Complex(1, 1);
		Complex resultado = new Complex(2, 2);
		int varnum;
		Complex esperando = varA.multiplicar(varnum = 2);
		assertEquals(resultado, esperando);
	}

	@Test
	void dividir() {
		Complex varA = new Complex(3, 0);
		Complex varB = new Complex(3, 2);
		Complex resultado = new Complex(1, 0);
		Complex esperando = varA.dividir(varB);
		assertEquals(resultado, esperando);
	}
	@Test
	void restar2() {
		Complex varA = new Complex(-2, -5);
		Complex varB = new Complex(-2, 2);
		Complex resultado = new Complex(-4, -3);
		Complex esperando = varA.restar(varB);
		assertEquals(resultado, esperando);
	}
	@Test
	void multiplicar2() {
		Complex varA = new Complex(-2, -3);
		Complex varB = new Complex(2, -3);
		Complex resultado = new Complex(-4, 9);
		Complex esperando = varA.multiplicar(varB);
		assertEquals(resultado, esperando);
	}
	@Test
	void dividir2() {
		Complex varA = new Complex(0, 0);
		Complex varB = new Complex(0, -2);
		Complex resultado = new Complex(1, -0);
		Complex esperando = varA.dividir(varB);
		assertEquals(resultado, esperando);
	}

	

}
