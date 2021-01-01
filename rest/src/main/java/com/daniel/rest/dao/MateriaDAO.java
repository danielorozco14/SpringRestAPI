package com.daniel.rest.dao;

import com.daniel.rest.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaDAO extends JpaRepository <Materia, Integer> {

}
