package br.com.livraria.dao;

import br.com.livraria.excpetions.LivroException;
import br.com.livraria.interfaces.LivroDaoImpl;
import br.com.livraria.model.Livro;
import br.com.livraria.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class LivroDao implements LivroDaoImpl {

    private EntityManager em = JPAUtil.getEmf();
    private EntityTransaction transaction = em.getTransaction();

    @Override
    public boolean salvar(Livro livro)  throws LivroException{
        transaction.begin();
        em.persist(livro);
        transaction.commit();
        return true;
    }

    @Override
    public Livro atualizar(Livro livro) {

        return null;
    }

    @Override
    public boolean remover(Livro livro) {

        return false;
    }

    @Override
    public List<Livro> listar() {
        return null;
    }

    @Override
    public List<Livro> buscarPorIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Livro> buscarPorTitulo(String titulo) {
        return null;
    }

    @Override
    public Livro buscarPorId(Long id) {
        Livro livro = em.find(Livro.class,id);
        return livro;
    }
}
