package br.com.gustavo.kaki;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OvoTest {

	@Test
	public void fritarCruTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrarOvo();
		Integer chamarFritar = 1;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(1, ovo.getTamanho());
		assertEquals(EnumStatusOvo.CRU,ovo.getStatus());
	}
	
	@Test
	public void fritarMeioFritoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrarOvo();
		Integer chamarFritar = 2;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(1, ovo.getTamanho());
		assertEquals(EnumStatusOvo.MEIOFRITO,ovo.getStatus());
	}
	
	@Test
	public void fritarDeliciaTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrarOvo();
		Integer chamarFritar = 4;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		
		assertEquals(1, ovo.getTamanho());
		assertEquals(EnumStatusOvo.DELICIA,ovo.getStatus());
	}
	
	@Test
	public void fritarMeioQueimadoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrarOvo();
		Integer chamarFritar = 5;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(1, ovo.getTamanho());
		assertEquals(EnumStatusOvo.MEIOQUEIMADO,ovo.getStatus());
	}
	
	@Test
	public void fritarQueimadoTest() {
		Ovo ovo = new Ovo(1);
		ovo.quebrarOvo();
		Integer chamarFritar = 10;
		if (ovo.getQuebrado()) {
			for (Integer i = 0; i < chamarFritar; i++) {
				ovo.fritar();
			}
		}
		assertEquals(1, ovo.getTamanho());
		assertEquals(EnumStatusOvo.QUEIMADO,ovo.getStatus());
	}
	
	@Test 
	public void fritarNaoQuebradoTest() { 
		Ovo ovo = new Ovo(1); 
		Exception exception = assertThrows(RuntimeException.class, () -> { 
			ovo.fritar(); 
		});
		assertEquals("Ovo nao esta quebrado", exception.getMessage()); 
	}
}
