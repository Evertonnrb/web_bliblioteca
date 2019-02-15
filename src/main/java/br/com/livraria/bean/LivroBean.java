package br.com.livraria.bean;

import br.com.livraria.dao.LivroDao;
import br.com.livraria.interfaces.LivroDaoImpl;
import br.com.livraria.model.Livro;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
@ManagedBean
@ViewScoped
public class LivroBean {

    private Livro livro = new Livro();
    private LivroDaoImpl livroDao = new LivroDao();

    public String novo(){
        livro = new Livro();
        return "";
    }

    public void removerLivro(){
        livroDao.remover(livro);
    }

    public void atualizarLivro(){
        livroDao.atualizar(livro);
    }

    public void cadastrarLivro(){
        livroDao.salvar(livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
