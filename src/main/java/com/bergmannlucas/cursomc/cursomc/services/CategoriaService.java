package com.bergmannlucas.cursomc.cursomc.services;

import com.bergmannlucas.cursomc.cursomc.domain.Categoria;
import com.bergmannlucas.cursomc.cursomc.repositories.CategoriaRepository;
import com.bergmannlucas.cursomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}