package br.com.livraria.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
@Entity
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "isbn", nullable = false, length = 13)
    private String isbn;
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
    @Column(name = "edicao", precision = 10)
    private Integer edicao;
    @Column(name = "descricao", length = 200)
    private String descricao;
    @Column(name = "publicacao", nullable = false, length = 10)
    private String publicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", edicao=" + edicao +
                ", descricao='" + descricao + '\'' +
                ", publicacao='" + publicacao + '\'' +
                '}';
    }
}
