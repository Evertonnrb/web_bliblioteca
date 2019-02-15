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
    public boolean salvar(Livro livro){
        transaction.begin();
        em.persist(livro);
        transaction.commit();
        return true;
    }

    @Override
    public Livro atualizar(Livro livro) {
        transaction.begin();
        em.merge(livro);
        transaction.commit();
        return livro;
    }

    @Override
    public boolean remover(Livro livro) {
        transaction.begin();
        em.remove(livro);
        transaction.commit();
        return true;
    }

    @Override
    public List<Livro> listar() {
        List<Livro> livros = em.createQuery("from Livro ").getResultList();
        return livros;
    }

    @Override
    public Livro buscarPorIsbn(String isbn) {
        Livro livro = (Livro) em.createQuery("select livro from Livro livro where livro.isbn = "+isbn).getSingleResult();
        return livro;
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
