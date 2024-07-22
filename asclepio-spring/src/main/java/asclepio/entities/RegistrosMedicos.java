package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record RegistrosMedicos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataRegistro,
		String descricao,
		String anexos,
		Pacientes paciente) 
{

}
