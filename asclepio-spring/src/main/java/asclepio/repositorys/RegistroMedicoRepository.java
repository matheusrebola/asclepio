package asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asclepio.entities.RegistrosMedicos;

@Repository
public interface RegistroMedicoRepository extends JpaRepository<RegistrosMedicos, UUID>{

}
