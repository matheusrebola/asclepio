package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.Internacoes;

@Repository
public interface InternacaoRepository extends JpaRepository<Internacoes, UUID>{

}
