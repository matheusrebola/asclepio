package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Prescricoes;

@Repository
public interface PrescricoesRepository extends JpaRepository<Prescricoes, UUID> {

}
