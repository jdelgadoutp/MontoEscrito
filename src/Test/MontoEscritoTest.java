package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MontoEscrito.MontoEscrito;

class MontoEscritoTest {

	@Test
	void testcuatrodigitos() {
		// Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		// Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "nueve mil ciento trece";
		// Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("9113");
		System.out.println("Su numero de cuatro digitos es: " + letrasobtenidas);
		// Paso 4, comparar el resultado esperado contra el resultado obtenido
		// Esto se hace con un metodo Assert de Junit
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}

	@Test
	void testtresdigitos() {
		// Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		// Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "DOSCIENTOS quince";
		// Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("215");
		System.out.println("Su numero de tres digitos es: " + letrasobtenidas);
		// Paso 4, comparar el resultado esperado contra el resultado obtenido
		// Esto se hace con un metodo Assert de Junit
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}

	@Test
	void testdosdigitos() {
		// Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		// Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "CINCUENTA Y CINCO";
		// Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("55");
		System.out.println("Su numero de dos digitos es: " + letrasobtenidas);
		// Paso 4, comparar el resultado esperado contra el resultado obtenido
		// Esto se hace con un metodo Assert de Junit
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}

	@Test
	void testundigitos() {
		// Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		// Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "UNO";
		// Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("1");
		System.out.println("Su numero un digito es: " + letrasobtenidas);
		// Paso 4, comparar el resultado esperado contra el resultado obtenido
		// Esto se hace con un metodo Assert de Junit
		assertEquals(letrasesperadas.toUpperCase(), letrasobtenidas);
	}

}
