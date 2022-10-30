package Equipo1.Ecofashion.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Equipo1.Ecofashion.modelos.ArticuloModelo;
@Repository
public interface ArticuloRepositorio extends CrudRepository <ArticuloModelo,Integer>{
    
}
