package br.org.saude.asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Medicamentos (
		UUID id,
		String nome,
		String descricao,
		String fabricante,
		Integer estoque,
		Prescricoes prescricao)
{
	
}
