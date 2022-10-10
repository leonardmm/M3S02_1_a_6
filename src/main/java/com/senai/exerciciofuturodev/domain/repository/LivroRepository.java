package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.EditoraModel;
import com.senai.exerciciofuturodev.domain.model.TituloModel;
import org.springframework.stereotype.Repository;

@Repository
public class LivroRepository {

    public static void salvarTitulo(TituloModel tituloModel) {
        var insertTable = "insert into titulo (titulo, paginas) values ()";
        System.out.println("Titulo inserido com sucesso!");
    }
    public static void salvarEditora(EditoraModel editoraModel) {
        var insertTable = "insert into editora (editora, estoque) values ()";
        System.out.println("Editora inserida com sucesso!");
    }
}
