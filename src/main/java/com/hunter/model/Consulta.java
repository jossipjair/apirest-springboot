package com.hunter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsulta;

	@Column(name = "idPaciente")
	private Integer idPaciente;

	@ManyToOne //llave foranea
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "Fk_Consulta_Paciente"))
	private Paciente paciente;//Para realizar consultas JPQL

}
