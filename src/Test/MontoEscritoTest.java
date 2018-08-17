package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MontoEscrito.MontoEscrito;

class MontoEscritoTest {

	@Test
	void testcuatrodigitos() {
		//Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		//Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "DOSMIL DOSIENTOS CINCUENTA Y CINCO";
		//Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("2255");
		System.out.println(letrasobtenidas);
		//Paso 4, comparar el resultado esperado contra el resultado obtenido
		//Esto se hace con un metodo Assert de Junit 
		assertEquals(letrasesperadas,letrasobtenidas);
	}
	
	
	@Test
	void testtresdigitos() {
		//Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		//Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "DOSIENTOS CINCUENTA Y CINCO";
		//Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("255");
		System.out.println(letrasobtenidas);
		//Paso 4, comparar el resultado esperado contra el resultado obtenido
		//Esto se hace con un metodo Assert de Junit 
		assertEquals(letrasesperadas,letrasobtenidas);
	}
	
	@Test
	void testdosdigitos() {
		//Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		//Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "CICUENTA Y CINCO";
		//Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("55");
		System.out.println(letrasobtenidas);
		//Paso 4, comparar el resultado esperado contra el resultado obtenido
		//Esto se hace con un metodo Assert de Junit 
		assertEquals(letrasesperadas,letrasobtenidas);
	}
	
	
	@Test
	void testundigitos() {
		//Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		//Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "CINCO";
		//Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("5");
		System.out.println(letrasobtenidas);
		//Paso 4, comparar el resultado esperado contra el resultado obtenido
		//Esto se hace con un metodo Assert de Junit 
		assertEquals(letrasesperadas,letrasobtenidas);
	}

}
