package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Medicamentos;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamentos, UUID>{
}
