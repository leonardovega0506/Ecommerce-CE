package mx.com.upiicsa.ece.service.implementation;


import mx.com.upiicsa.ece.model.DetalleOrden;
import mx.com.upiicsa.ece.repository.DetalleRepository;
import mx.com.upiicsa.ece.service.interfaces.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleRepository.save(detalleOrden);
    }
}
