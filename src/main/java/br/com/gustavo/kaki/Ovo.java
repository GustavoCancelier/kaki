package br.com.gustavo.kaki;

public class Ovo {
	private Integer tamanho;
	private String status;
	private Integer contFritar = 0;
	private Boolean quebrado = false;
	public Ovo(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public void fritar() {
		this.contFritar++; 
		Integer qtdFritarNecessaria = tamanho / 10;
		
		if (getQuebrado()) {
			if (this.contFritar < qtdFritarNecessaria ) {
				this.status = "cru";
			} else if (this.contFritar == qtdFritarNecessaria) {
				this.status = "delicia";
			} else {
				this.status = "queimado";
			}
		} else {
			System.out.println("Quebre seu ovo antes de tentar fritar!");
			this.status = "intacto";
		}
		
	}
	
	public void quebrarOvo() {
		this.quebrado = true;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public String getStatus() {
		return status;
	}
	
	public Boolean getQuebrado() {
		return quebrado;
	}
	
}
