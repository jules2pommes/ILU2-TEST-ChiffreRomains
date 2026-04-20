package cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
	private ChiffresRomains cr;

	@BeforeEach
	void setUp() throws Exception {
		cr = new ChiffresRomains();
	}

	@Test
	void iter1() {
		assertEquals("I", cr.toChiffresRomains(1));
	}

	@Test
	void iter2() {
		assertEquals("II", cr.toChiffresRomains(2));
		assertEquals("III", cr.toChiffresRomains(3));
	}
	
	@Test
	void iter3() {
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(-1));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(4000));
	}
	
	@Test
	void iter4() {
		assertEquals("IV", cr.toChiffresRomains(4));
	}
	
	@Test
	void iter5() {
		assertEquals("V", cr.toChiffresRomains(5));
		assertEquals("VI", cr.toChiffresRomains(6));
		assertEquals("VII", cr.toChiffresRomains(7));
		assertEquals("VIII", cr.toChiffresRomains(8));
	}
	

}
