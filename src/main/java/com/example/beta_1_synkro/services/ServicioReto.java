package com.example.beta_1_synkro.services;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.example.beta_1_synkro.models.Reto;
import com.example.beta_1_synkro.repository.IRepositorioReto;

@Service
public class ServicioReto {

    private final IRepositorioReto repositorioReto;

    // Inyección de dependencias por constructor
    public ServicioReto(IRepositorioReto repositorioReto) {
        this.repositorioReto = repositorioReto;
    }

    // Operaciones que habilitamos ejecutar en nuestra tabla

    // guardar
    public Reto guardarReto(Reto datosReto) {
        return this.repositorioReto.save(datosReto);
    }

    // buscar
   

    // actualizar
  

    // eliminar
    
}