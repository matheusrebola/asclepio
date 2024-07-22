package asclepio.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public record Medicos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		Especialidade especialidade,
		String telefone,
		String email,
		String crm,
		@OneToOne(mappedBy = "consulta") Consultas consulta) 
{
	
}
