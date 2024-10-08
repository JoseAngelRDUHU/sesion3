package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
    Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta  = new Cuenta((double) 0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		//suponer inicial es 0
		cuenta.ingresar(500d);
		assertEquals(500,cuenta.getSaldo());	
	}
	
	@Test
	void testRetirar() {

		cuenta.retirar(500d);
		assertEquals(-500,cuenta.getSaldo());	
	}
	
	@Test
	void test0014() {
		
		cuenta1.retirar(200d);
		cuenta2.retirar(350d);
		cuenta1.ingresar(100d);
		cuenta2.retirar(200d);
		cuenta2.retirar(150d);
		cuenta1.retirar(200d);
		cuenta2.ingresar(50d);
		cuenta2.retirar(100d);
		
		System.out.println("Saldo cuenta 12345: "+ cuenta1.getSaldo());	
		System.out.println("Saldo cuenta 67890: "+ cuenta2.getSaldo());	
	}
	
}
