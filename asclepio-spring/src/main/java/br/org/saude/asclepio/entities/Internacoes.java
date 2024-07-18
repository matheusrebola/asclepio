package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Internacoes(
		UUID id,
		LocalDateTime dataInternacao,
		LocalDateTime dataAlta,
		String motivoInternacao,
		Pacientes paciente,
		Leitos leito) 
{

}
