package com.ards.backend.service;

import java.util.List;
import java.util.Optional;

import com.ards.backend.domain.Categoria;
import com.ards.backend.dtos.CategoriaDTO;
import com.ards.backend.repositories.CategoriaRepository;
import com.ards.backend.service.excetions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! ID = "  +  id  + ", Tipo: " + Categoria.class.getName()));
    }

    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria create(Categoria obj){

        obj.setId(null);
        return repository.save(obj);
    }

    public Categoria create(Integer id, CategoriaDTO objDto){
        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

}
