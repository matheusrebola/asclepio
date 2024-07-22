package br.org.saude.asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.saude.asclepio.entities.Pacientes;

@Repository
public interface PacienteRepository extends JpaRepository<UUID, Pacientes> {
}
