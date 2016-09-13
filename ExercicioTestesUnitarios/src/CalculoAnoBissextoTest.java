import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoAnoBissextoTest {

	@Test
	public void ValidarAnoBissexto() {
		CalculoAnoBissexto ano = new CalculoAnoBissexto();
		
		assertTrue(ano.validarBissexto(2016));
		assertFalse(ano.validarBissexto(2015));
	}

}
