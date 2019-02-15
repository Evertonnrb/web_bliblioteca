import br.com.livraria.dao.LivroDao;
import br.com.livraria.excpetions.LivroException;
import br.com.livraria.interfaces.LivroDaoImpl;
import br.com.livraria.model.Livro;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class TestesLivro {

    LivroDao dao = new LivroDao();

    @Test
    public void deveCastrarLivros()throws LivroException {
        Livro livro = new Livro();
        livro.setIsbn("123-0000-00-x");
        livro.setDescricao("livros de testes");
        livro.setPublicacao("2019");
        livro.setTitulo("Testes e t");
        livro.setEdicao(2);
        Livro livro2 = new Livro();
        livro2.setIsbn("111-2222-00-x");
        livro2.setDescricao("Livro por encomenda");
        livro2.setPublicacao("2018");
        livro2.setTitulo("Publicado");
        livro2.setEdicao(1);
        Livro livro3 = new Livro();
        livro3.setIsbn("003-ia00-00-x");
        livro3.setDescricao("IA");
        livro3.setPublicacao("2019");
        livro3.setTitulo("IA");
        livro3.setEdicao(3);
        Livro livro4 = new Livro();
        livro4.setIsbn("z23-0000-00-x");
        livro4.setDescricao("SGBD");
        livro4.setPublicacao("2018");
        livro4.setTitulo("sgbd oravcle");
        livro4.setEdicao(1);

        dao.salvar(livro);
        dao.salvar(livro2);
        dao.salvar(livro3);
        dao.salvar(livro4);
        dao.salvar(livro);
    }

    @Test
    public void insereNovoLivroParaExclusao() throws LivroException {
        Livro livro = new Livro();
        livro.setIsbn("0000000");
        livro.setTitulo("teste");
        livro.setEdicao(0);
        livro.setPublicacao("1986");
        LivroDaoImpl livroDao = new LivroDao();
        livroDao.salvar(livro);
    }

    @Test
    public void deveBuscarLivro(){
        Livro livro = dao.buscarPorId(4L);
        System.out.println(livro.toString());
    }

    @Test
    public void deveAtuallizarLivro(){
        Livro livroAchado = dao.buscarPorId(4L);
        livroAchado.setTitulo("livro achado");
        livroAchado.setIsbn("XXX-0000-22");
        dao.atualizar(livroAchado);
    }

    @Test
    public void deveListarTodosLivros(){
        List<Livro> ls = dao.listar();
        for(Livro livro : ls){
            System.out.println(livro.toString());
        }
    }

    @Test
    public void deveBuscarPorIsbn(){
      Livro livro = dao.buscarPorIsbn("XXX-0000-22");
        System.out.println(livro);
    }

    @Test
    public void deveRemoverLivro(){
        Livro l = dao.buscarPorId(9L);
        dao.remover(l);
    }

}
