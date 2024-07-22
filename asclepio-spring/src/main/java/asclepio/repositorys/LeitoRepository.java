package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Leitos;

@Repository
public interface LeitoRepository extends JpaRepository<Leitos, UUID> {
}
