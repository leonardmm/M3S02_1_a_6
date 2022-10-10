package com.senai.exerciciofuturodev.rest.controller;

import com.senai.exerciciofuturodev.domain.service.LivroService;
import com.senai.exerciciofuturodev.rest.dto.LivroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livro")
    public String cadastrarLivro(@RequestBody LivroDto livroDto) {
        livroService.cadastrar(livroDto);

        return "Livro cadastrado com sucesso!";
    }
}