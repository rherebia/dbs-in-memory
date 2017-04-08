package br.com.rbh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "teste")
public class Sistema {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sistema_id_seq")
	@SequenceGenerator(name = "sistema_id_seq", sequenceName = "teste.sistema_id_seq", allocationSize = 1)
	private Long id;
	
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
