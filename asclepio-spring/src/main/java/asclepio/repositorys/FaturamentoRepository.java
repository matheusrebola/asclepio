package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Faturamentos;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamentos, UUID>{

}
