package mx.com.upiicsa.ece.repository;


import mx.com.upiicsa.ece.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<DetalleOrden, Integer> {
}
