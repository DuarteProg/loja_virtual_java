package duarte.lojavirtual.duarte.lojavirtual.service;

import duarte.lojavirtual.duarte.lojavirtual.model.Acesso;
import duarte.lojavirtual.duarte.lojavirtual.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso) {

        return acessoRepository.save(acesso);
    }

}
