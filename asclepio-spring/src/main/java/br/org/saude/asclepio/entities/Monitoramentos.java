package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Monitoramentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataMonitoramento,
		String valorMedido,
		TipoMedicacao tipoMedicacao,
		Pacientes paciente,
		Equipamentos equipamento) 
{

}
