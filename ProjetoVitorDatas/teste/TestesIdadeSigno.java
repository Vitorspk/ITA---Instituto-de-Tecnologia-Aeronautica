import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestesIdadeSigno {
	
	
	private static Pessoa p1;
	private static Pessoa p3;
	private static Pessoa p4;
	private static Pessoa p2;

	@BeforeClass
	public static void beforeClass() {
		p1 = new Pessoa(25,11,1976);
		p2 = new Pessoa(15,11,1983);
		p3 = new Pessoa(22,12,1956);
		p4 = new Pessoa(28,01,1951);
	}
	
	
	@Test
	public void testDeIdades() {
		assertEquals(39, p1.getIdade());
		assertEquals(32, p2.getIdade());
		assertEquals(59, p3.getIdade());
		assertEquals(65, p4.getIdade());
	}
	
	@Test
	public void testSagitario() {
		assertEquals("Sagit�rio", p1.getSigno());
	}
	
	@Test
	public void testEscorpiao() {
		assertEquals("Escorpi�o", p2.getSigno());
	}
	
	@Test
	public void testCapricornio() {
		assertEquals("Capric�rnio", p3.getSigno());
	}
	
	@Test
	public void testAquario() {
		assertEquals("Aqu�rio", p4.getSigno());
	}
	
	
	
}
