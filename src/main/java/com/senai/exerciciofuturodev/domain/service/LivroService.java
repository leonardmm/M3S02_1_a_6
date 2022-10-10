package com.senai.exerciciofuturodev.domain.service;

import com.senai.exerciciofuturodev.domain.model.EditoraModel;
import com.senai.exerciciofuturodev.domain.model.TituloModel;
import com.senai.exerciciofuturodev.domain.repository.LivroRepository;
import com.senai.exerciciofuturodev.domain.repository.UsuarioRepository;
import com.senai.exerciciofuturodev.rest.dto.LivroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void cadastrar(LivroDto livroDto) {
        TituloModel tituloModel = new TituloModel();
        tituloModel.setTitulo(livroDto.getTitulo());
        tituloModel.setPaginas(livroDto.getPáginas());
        LivroRepository.salvarTitulo(tituloModel);

        EditoraModel editoraModel = new EditoraModel();
        editoraModel.setEditora(livroDto.getEditora());
        tituloModel.setPaginas(livroDto.getPáginas());
        LivroRepository.salvarEditora(editoraModel);
        System.out.println("Titulo e editora salvos com sucesso!");
    }
}
