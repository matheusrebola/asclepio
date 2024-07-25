package asclepio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Equipamentos;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamentos, UUID>{
}
