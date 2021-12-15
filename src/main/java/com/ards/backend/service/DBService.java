package com.ards.backend.service;

import com.ards.backend.domain.Categoria;
import com.ards.backend.domain.Livro;
import com.ards.backend.repositories.CategoriaRepository;
import com.ards.backend.repositories.LivroRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
    private LivroRepository livroRepository;    

    public void instanciaBaseDeDados() {
        Categoria cat1 = new Categoria(null, "Informatica", "Livros de Ti");

        Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);

        cat1.getLivros().addAll(Arrays.asList(l1));

        this.categoriaRepository.saveAll(Arrays.asList(cat1));

        this.livroRepository.saveAll(Arrays.asList(l1));
    }

}
