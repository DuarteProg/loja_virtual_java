package duarte.lojavirtual;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import duarte.lojavirtual.duarte.lojavirtual.ExceptionCustomJava;
import duarte.lojavirtual.duarte.lojavirtual.LojaVirtualJavaApplication;
import duarte.lojavirtual.duarte.lojavirtual.controller.AcessoController;
import duarte.lojavirtual.duarte.lojavirtual.model.Acesso;
import duarte.lojavirtual.duarte.lojavirtual.service.AcessoService;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = LojaVirtualJavaApplication.class)
public class LojaVirtualJavaApplicationTests {

    @Autowired
    private AcessoService acessoService;

    @Autowired
    private AcessoController acessoController;

    @Autowired
    private WebApplicationContext wac;

    @Test
    public void testRestApiCadastroAcesso() throws Exception {
        DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
        MockMvc mockMvc = builder.build();

        Acesso acesso = new Acesso();

        acesso.setDescricao("ROLE_COMPRADOR");

        ObjectMapper objectMapper = new ObjectMapper();

        ResultActions resultActions = mockMvc
                .perform(MockMvcRequestBuilders.post("/salvarAcesso")
                        .content(objectMapper.writeValueAsString(acesso))
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testCadastraAcesso() throws ExceptionCustomJava {

        Acesso acesso = new Acesso();

        acesso.setDescricao("ROLE_ADMIN");

        acesso = acessoController.salvarAcesso(acesso).getBody();

        assertEquals(true, acesso.getId() > 0);
    }

}
