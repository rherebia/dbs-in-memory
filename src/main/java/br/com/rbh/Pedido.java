package br.com.rbh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "teste")
public class Pedido {

	@Id
	private Long id;
	
	private Integer idade;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	enum SituacaoEnum {
		NOVO, EM_ATENDIMENTO, ATENDIDO, FATURADO;
	}
}
