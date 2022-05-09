package ejercicio2;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class GeneradorIpTest {
	GeneradorIp teaser;
	
	@BeforeEach
	void setUp() throws Exception {
		teaser = new GeneradorIp();
	}

	@RepeatedTest(value = 4)
	void testGenerarNumero() {
		Random rand = new Random();
		int expected = rand.nextInt(0)+250;
		int actual = this.teaser.generarNumero(0, 250);
		assertEquals(expected, actual);
	}

	@RepeatedTest(4)
	void testGenerarIp() {
		String mensaje = "";
		String expected = "";
		String actual = this.teaser.generarIp();
		assertEquals(mensaje, expected, actual);
	}

}
