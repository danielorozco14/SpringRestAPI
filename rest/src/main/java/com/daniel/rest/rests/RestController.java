package com.daniel.rest.rests;


import com.daniel.rest.dao.MateriaDAO;
import com.daniel.rest.models.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin //Necesitado para que React O Angular consuman la API
@org.springframework.web.bind.annotation.RestController
@RequestMapping("v1/materias")
public class RestController {

    @Autowired
    private MateriaDAO materiaDAO;

    //METODOS HTTP
    @PostMapping("/guardar")
    public void guardarMateria(@RequestBody Materia materia){
        materiaDAO.save(materia);
    }

    @GetMapping("/listar")
    public List<Materia> listarMaterias(){
        List<Materia> todasMaterias = null;
        todasMaterias = materiaDAO.findAll();
        return  todasMaterias;
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarMateria(@PathVariable("id")Integer id){
        materiaDAO.deleteById(id);
    }

    @PutMapping("/actualizar")
    public void actualizarMateria(@RequestBody Materia nuevaMateria){
        materiaDAO.save(nuevaMateria);
    }
}
