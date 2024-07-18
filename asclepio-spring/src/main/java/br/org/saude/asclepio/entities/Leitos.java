package br.org.saude.asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Leitos(
		UUID id,
		Integer numero,
		TipoLeito tipoLeito,
		StatusLeito statusLeito) 
{
	
}
