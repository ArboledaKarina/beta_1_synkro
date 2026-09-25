package com.example.beta_1_synkro.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.beta_1_synkro.repository.IRepositorioPrioridad;

public class ServicioPrioridad {
        //Inyecto una dependencia hacia el repositorio 
    @Autowired 
    private IRepositorioPrioridad repositorioPrioridad;
    //Operaciones que habilitamos ejecutar en nuestra tabla

    //guardar
    public  guardarUsuario( Prioridad datosPrioridad){
        this.repositorioPrioridad.save(datosPrioridad);
        
    }
    //buscar
    //actualizar
    //eliminar

}
