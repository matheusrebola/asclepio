package asclepio.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Dispensacoes;

@Repository
public interface DispensacoesRepository extends JpaRepository<Dispensacoes, UUID>{

}