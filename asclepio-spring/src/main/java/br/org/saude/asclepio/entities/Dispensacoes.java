package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Dispensacoes(
		UUID id,
		LocalDateTime dataDispensacao,
		Integer quantidadeDispensada,
		Prescricoes prescricao) 
{

}
