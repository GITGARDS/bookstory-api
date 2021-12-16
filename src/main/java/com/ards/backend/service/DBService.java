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
        Categoria cat1 = new Categoria(null, "Categoria 1", "Categoria 01");
        Categoria cat2 = new Categoria(null, "Categoria 2", "Categoria 02");
        Categoria cat3 = new Categoria(null, "Categoria 3", "Categoria 03");

        Livro l1 = new Livro(null, "livro 1", "Autor do Livro 1", "Texto do livro 1", cat1);        
        Livro l2 = new Livro(null, "livro 2", "Autor do Livro 2", "Texto do livro 2", cat1);
        Livro l3 = new Livro(null, "livro 3", "Autor do Livro 3", "Texto do livro 3", cat2);
        Livro l4 = new Livro(null, "livro 4", "Autor do Livro 4", "Texto do livro 4", cat2);
        Livro l5 = new Livro(null, "livro 5", "Autor do Livro 5", "Texto do livro 5", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4,  l5));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }

}
