package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio3.Producto;

class ProdcutoTest {
	
	Producto p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		 p = new Producto("pan", 0.50f, 1);
	}

	@Test
	void testPrecioTotal() {
		float expected = 0.50f;
		float actual = p.precioTotal();
		assertEquals(expected, actual, 0.01);
	}

}
