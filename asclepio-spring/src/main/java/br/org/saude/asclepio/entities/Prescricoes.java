package br.org.saude.asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Prescricoes(
		UUID id,
		String dosagem,
		String frequencia,
		String duracao,
		Consultas consulta,
		Medicos medico) 
{

}
