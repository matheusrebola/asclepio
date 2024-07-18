package br.org.saude.asclepio.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Faturamento(
		UUID id,
		String nome,
		LocalDate dataNascimento,
		String endereco,
		String telefone,
		String email,
		String historicoMedico,
		String alergias,
		Pacientes paciente) 
{

}
