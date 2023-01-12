package mx.com.upiicsa.ece.service.interfaces;

import mx.com.upiicsa.ece.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> findById(Integer id);

    Usuario save(Usuario usuario);

    Optional<Usuario> findByEmail(String email);
    List<Usuario> findAll();
}
