package mx.com.upiicsa.ece.service.interfaces;

import mx.com.upiicsa.ece.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public Producto save(Producto producto);

    public Optional<Producto> get(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);

    public List<Producto> finAll();
}
