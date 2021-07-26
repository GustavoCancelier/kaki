package br.com.gustavo.kaki;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OvoTest {

	@Test
	public void fritarCruTest() {
		Ovo ovo = new Ovo(20);
		ovo.quebrarOvo();
		Integer chamarFritar = 1;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(20, ovo.getTamanho());
		assertEquals("cru",ovo.getStatus());
	}
	
	@Test
	public void fritarDeliciaTest() {
		Ovo ovo = new Ovo(20);
		Integer chamarFritar = 2;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		
		assertEquals(20, ovo.getTamanho());
		assertEquals(false,ovo.getQuebrado());
	}
	
	@Test
	public void fritarQueimadoTest() {
		Ovo ovo = new Ovo(20);
		ovo.quebrarOvo();
		Integer chamarFritar = 3;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(20, ovo.getTamanho());
		assertEquals("queimado",ovo.getStatus());
	}
}
