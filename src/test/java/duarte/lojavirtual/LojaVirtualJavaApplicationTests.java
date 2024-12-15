package duarte.lojavirtual;

import duarte.lojavirtual.duarte.lojavirtual.LojaVirtualJavaApplication;
import duarte.lojavirtual.duarte.lojavirtual.model.Acesso;
import duarte.lojavirtual.duarte.lojavirtual.repository.AcessoRepository;
import duarte.lojavirtual.duarte.lojavirtual.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualJavaApplication.class)
public class LojaVirtualJavaApplicationTests {

    @Autowired
    private AcessoService acessoService;


    @Test
    public void testCadastraAcesso() {

        Acesso acesso = new Acesso();

        acesso.setDescricao("ROLE_ADMIN");

        acessoService.save(acesso);
    }

}
