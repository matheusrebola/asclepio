package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Medicos;

@Repository
public interface MedicoRepository extends JpaRepository<Medicos, UUID> {
}
