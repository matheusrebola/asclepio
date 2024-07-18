package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record RegistrosMedicos(
		UUID id,
		LocalDateTime dataRegistro,
		String descricao,
		String anexos,
		Pacientes paciente) 
{

}
