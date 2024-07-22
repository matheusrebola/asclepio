package asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Prescricoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String dosagem,
		String frequencia,
		String duracao,
		Consultas consulta,
		Medicos medico) 
{

}
