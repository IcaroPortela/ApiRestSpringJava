package br.com.itau.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.apirest.entity.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
