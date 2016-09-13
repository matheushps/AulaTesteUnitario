import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void verificarPalindromoEvalidarCaracteres() {
		Palindromo pal = new Palindromo();

		boolean resultado = pal
				.validarPalindromo("Ovo-");
		assertTrue(resultado);
	}

	@Test
	public void verificarSeNaoEPalindromo() {
		Palindromo p = new Palindromo();

		boolean resultado = p
				.validarPalindromo("Macaco");
		assertFalse(resultado);
	}

	
}
