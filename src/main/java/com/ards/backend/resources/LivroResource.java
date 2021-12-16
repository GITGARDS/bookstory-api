package com.ards.backend.resources;

import com.ards.backend.domain.Livro;
import com.ards.backend.dtos.LivroDTO;
import com.ards.backend.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livros")
public class LivroResource {

    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Integer id) {
        Livro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }

    public void findAll() {
    }

    public void create(Livro obj) {
    }

    public void update(Integer id, LivroDTO objDto) {
    }

    public void delete(Integer id) {
    }

}
