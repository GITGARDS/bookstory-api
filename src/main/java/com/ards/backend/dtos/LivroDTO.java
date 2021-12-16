package com.ards.backend.dtos;

import java.io.Serializable;

import com.ards.backend.domain.Livro;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class LivroDTO implements Serializable {

    private Integer id;

    @NotEmpty(message = "Campo TITULO é requerido!")
 //   @Length(min = 10, max = 50, message = "O Campo TITULO deve ter entre 10 a 50 caracteres!")
    private String titulo;

    public LivroDTO() {

    }

    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
