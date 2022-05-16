package ejercicio3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {
	
	Factura f;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		f = new Factura();
	}

	@Test
	void testTotalFactura() {
		Producto p = new Producto("leche", (float) 0.70, 3);
		Producto p2 = new Producto("yogur", (float) 0.90, 5);
		Producto p3 = new Producto("leche", (float) 0.10, 1);
		f.meterProducto(p);
		f.meterProducto(p2);
		f.meterProducto(p3);
		float expected = (float)1.7;
		float actual = f.totalFactura();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	void testAplicarIva() {
		Producto p = new Producto("leche", (float) 0.70, 3);
		Producto p2 = new Producto("yogur", (float) 0.90, 5);
		Producto p3 = new Producto("leche", (float) 0.10, 1);
		f.meterProducto(p);
		f.meterProducto(p2);
		f.meterProducto(p3);
		float expected = (float)2.057;
		float actual = f.aplicarIva(21);
		assertEquals(expected, actual, 0.01);
	}

}
