package asclepio.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Pacientes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		LocalDate dataNascimento,
		String endereco,
		String telefone,
		String email,
		String historicoMedico,
		String alergias,
		@OneToMany(mappedBy = "paciente") Consultas consultas) 
{
	
}
