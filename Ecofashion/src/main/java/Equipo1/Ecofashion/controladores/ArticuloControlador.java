package Equipo1.Ecofashion.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Equipo1.Ecofashion.modelos.ArticuloModelo;
import Equipo1.Ecofashion.repositorios.ArticuloRepositorio;

@RestController
@RequestMapping(path = "/articulo")
public class ArticuloControlador {
    @Autowired
    ArticuloRepositorio articuloRepositorio;

    @GetMapping()
    public Iterable<ArticuloModelo> obtenerTodosLosArticulos(){

        return articuloRepositorio.findAll();
    }
    
    @PostMapping()
    public ArticuloModelo guardarArticulo(@RequestBody ArticuloModelo articulo){
        return articuloRepositorio.save(articulo);
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarArticuloPorId(@PathVariable("id") int id){
        articuloRepositorio.deleteById(id);
    }
}
