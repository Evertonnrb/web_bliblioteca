package br.com.livraria.interfaces;

import br.com.livraria.excpetions.LivroException;
import br.com.livraria.model.Livro;

import java.util.List;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public interface LivroDaoImpl {

    boolean salvar(Livro livro) throws LivroException;

    Livro atualizar(Livro livro);

    boolean remover(Livro livro);

    List<Livro> listar();

    List<Livro> buscarPorIsbn(String isbn);

    List<Livro> buscarPorTitulo(String titulo);

    Livro buscarPorId(Long id);
}
