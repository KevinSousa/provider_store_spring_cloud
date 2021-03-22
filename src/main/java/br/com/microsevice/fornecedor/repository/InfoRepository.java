package br.com.microsevice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microsevice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long>{
	InfoFornecedor findByEstado(String estado);
}
	