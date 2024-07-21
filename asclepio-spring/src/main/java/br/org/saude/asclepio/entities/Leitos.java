package br.org.saude.asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Leitos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer numero,
		TipoLeito tipoLeito,
		StatusLeito statusLeito) 
{
	
}
