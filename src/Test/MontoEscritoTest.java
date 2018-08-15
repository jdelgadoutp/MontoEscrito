package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MontoEscrito.MontoEscrito;

class MontoEscritoTest {

	@Test
	void test() {
		//Paso 1, creo el objeto que voy a probar
		MontoEscrito Letras = new MontoEscrito();
		//Paso 2, declaro una variable con el resultado esperado
		String letrasesperadas = "UNO";
		//Paso 3, llamo el metodo que necesito probar y obtengo el resultado
		String letrasobtenidas = Letras.ValorLetras("1");
		//Paso 4, comparar el resultado esperado contra el resultado obtenido
		//Esto se hace con un metodo Assert de Junit 
		assertEquals(letrasesperadas,letrasobtenidas);
	}

}
