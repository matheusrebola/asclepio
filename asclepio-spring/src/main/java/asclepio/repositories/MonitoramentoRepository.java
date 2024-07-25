package asclepio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Monitoramentos;

@Repository
public interface MonitoramentoRepository extends JpaRepository<Monitoramentos, UUID> {

}
