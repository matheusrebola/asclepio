package br.org.saude.asclepio.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.saude.asclepio.entities.RegistrosMedicos;

public interface RegistroMedicoRepository extends JpaRepository<UUID, RegistrosMedicos>{

}