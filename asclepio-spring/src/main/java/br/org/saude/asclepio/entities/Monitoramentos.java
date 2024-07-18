package br.org.saude.asclepio.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Monitoramentos(
		UUID id,
		LocalDateTime dataMonitoramento,
		String valorMedido,
		TipoMedicacao tipoMedicacao,
		Pacientes paciente,
		Equipamentos equipamento) 
{

}
