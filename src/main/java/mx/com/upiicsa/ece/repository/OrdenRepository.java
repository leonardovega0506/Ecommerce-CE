package mx.com.upiicsa.ece.repository;
;
import mx.com.upiicsa.ece.model.Orden;
import mx.com.upiicsa.ece.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdenRepository extends JpaRepository<Orden,Integer> {
    List<Orden> findByUsuario(Usuario usuario);
}
