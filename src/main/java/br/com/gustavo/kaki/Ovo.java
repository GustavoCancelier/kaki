package br.com.gustavo.kaki;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ovo {
	private Integer tamanho;
	private Integer contFritar;
	private Boolean quebrado;
	
	public Ovo(Integer tamanho) {
		this.tamanho = tamanho;
		this.quebrado = false;
		this.contFritar = 0;
	}

	public void fritar() {
		if (!this.quebrado) {
			throw new RuntimeException("Ovo nao esta quebrado");
		}
		
		this.contFritar++; 
	}
	
	public void quebrarOvo() {
		this.quebrado = true;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public EnumStatusOvo getStatus() {
		if (this.contFritar > 0 && this.tamanho > 0) {
			BigDecimal f = BigDecimal.valueOf(contFritar);
			BigDecimal t = BigDecimal.valueOf(tamanho);
			BigDecimal estado = f.divide(t, 2, RoundingMode.FLOOR);
			
			if (estado.compareTo(BigDecimal.valueOf(2)) < 0) {
				return EnumStatusOvo.CRU;
			}
			if (estado.compareTo(BigDecimal.valueOf(3)) < 0) {
				return EnumStatusOvo.MEIOFRITO;
			}
			if (estado.compareTo(BigDecimal.valueOf(5)) < 0) {
				return EnumStatusOvo.DELICIA;
			}
			if (estado.compareTo(BigDecimal.valueOf(7)) < 0) {
				return EnumStatusOvo.MEIOQUEIMADO;
			}
			
			return EnumStatusOvo.QUEIMADO;
			
		}
		return EnumStatusOvo.CRU;
	}
	
	public Boolean getQuebrado() {
		return quebrado;
	}
	
}
