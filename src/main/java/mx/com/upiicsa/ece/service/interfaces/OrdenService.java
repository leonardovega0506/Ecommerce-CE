package mx.com.upiicsa.ece.service.interfaces;

import mx.com.upiicsa.ece.model.Orden;
import mx.com.upiicsa.ece.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface OrdenService {

    Orden save(Orden orden);
    List<Orden> findAll();
    String generateNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);
    Optional<Orden> findById(Integer id);
}
