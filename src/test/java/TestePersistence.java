import br.com.livraria.util.JPAUtil;
import org.junit.Test;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class TestePersistence {

    @Test
    public void deveRetornarUmaInstanciaDeEntityManager(){
        JPAUtil.getEmf();
    }

}
