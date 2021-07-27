package br.com.enio.beloprojeto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ovo {
	private Integer tamanho;
	private Integer fritada;
	private Integer quebrar;
	
	public Ovo(Integer tamanho) {
		this.tamanho = tamanho;
		this.fritada = 0;
		this.quebrar = 0;
	}
	
	public void fritar() {
		this.fritada++;
	}

	public Integer getTamanho() {
		return tamanho;
	}
	public void quebrar() {
		this.quebrar++;
	}

	public EnumStatusOvo getStatus() {
		if(quebrar>0) {
		if (tamanho > 0 && fritada > 0) {
			
			BigDecimal t = BigDecimal.valueOf(tamanho);
			BigDecimal f = BigDecimal.valueOf(fritada);
			BigDecimal cal = f.divide(t, 2, RoundingMode.FLOOR);
			
			if (cal.compareTo(BigDecimal.valueOf(50)) < 0) {
				return EnumStatusOvo.CRU;
			}
			if (cal.compareTo(BigDecimal.valueOf(75)) < 0) {
				return EnumStatusOvo.MEIOFRITO;
			}
			if (cal.compareTo(BigDecimal.valueOf(100)) < 0) {
				return EnumStatusOvo.DELICIA;
			}
			if (cal.compareTo(BigDecimal.valueOf(125)) < 0) {
				return EnumStatusOvo.MEIOQUEIMADO;
			}
			return EnumStatusOvo.QUEIMADO;
		}
		return EnumStatusOvo.CRU;
		}
		return EnumStatusOvo.NAOQUEBRADO;
	}
	
}
