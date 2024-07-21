package br.org.saude.asclepio.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public record Consultas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDate dataConsulta,
		LocalDateTime horaConsulta,
		String status,
		boolean ativo,
		@ManyToOne @JoinColumn(name = "paciente_id") Pacientes paciente,
		@OneToOne @JoinColumn(name = "medico_id") Medicos medico) 
{
	
}
