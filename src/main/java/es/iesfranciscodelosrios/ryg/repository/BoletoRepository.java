package es.iesfranciscodelosrios.ryg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.iesfranciscodelosrios.ryg.model.Boleto;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long> {

	@Query(value = "SELECT * FROM boleto AS b WHERE b.entregado = 1", nativeQuery = true)
	public List<Boleto> getBoletosEntregados();

	@Query(value = "SELECT * FROM boleto AS b WHERE b.canjeado = 1", nativeQuery = true)
	public List<Boleto> getBoletosCanjeados();

}
