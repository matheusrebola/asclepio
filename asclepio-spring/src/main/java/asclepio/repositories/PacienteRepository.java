package asclepio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Pacientes;

@Repository
public interface PacienteRepository extends JpaRepository<Pacientes, UUID> {
}
