package com.ards.backend.service;

import java.util.Optional;

import com.ards.backend.domain.Livro;
import com.ards.backend.repositories.LivroRepository;
import com.ards.backend.service.excetions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
    }
    
}
