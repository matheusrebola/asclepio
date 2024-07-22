package asclepio.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Faturamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
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
