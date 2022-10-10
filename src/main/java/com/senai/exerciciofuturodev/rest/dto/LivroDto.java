package com.senai.exerciciofuturodev.rest.dto;

public class LivroDto {

    private String titulo;
    private String páginas;
    private String editora;
    private String estoque;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPáginas() {
        return páginas;
    }

    public void setPáginas(String páginas) {
        this.páginas = páginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "LivroDto{" +
                "titulo='" + titulo + '\'' +
                ", páginas='" + páginas + '\'' +
                ", editora='" + editora + '\'' +
                ", estoque='" + estoque + '\'' +
                '}';
    }
}
