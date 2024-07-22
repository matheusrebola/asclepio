package br.org.saude.asclepio.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Equipamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		String fabricante,
		LocalDate dataAquisicao,
		boolean ativo) 
{
	
}
