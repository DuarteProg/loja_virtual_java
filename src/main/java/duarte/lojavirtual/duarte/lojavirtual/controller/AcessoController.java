package duarte.lojavirtual.duarte.lojavirtual.controller;

import duarte.lojavirtual.duarte.lojavirtual.model.Acesso;
import duarte.lojavirtual.duarte.lojavirtual.repository.AcessoRepository;
import duarte.lojavirtual.duarte.lojavirtual.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @Autowired
    private AcessoRepository acessoRepository;

    @ResponseBody
    @PostMapping(value = "**/salvarAcesso")
    public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso) {

        Acesso acessoSalvo = acessoService.save(acesso);

        return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "**/deteleAcesso")
    public ResponseEntity<Acesso> deteleAcesso(@RequestBody Acesso acesso) {

        acessoRepository.deleteById(acesso.getId());

        return new ResponseEntity("Acesso Removido", HttpStatus.OK);
    }

    @DeleteMapping(value = "**/deteleAcessoPorId/{id}")
    public ResponseEntity<?> deteleAcessoPorId(@PathVariable("id") Long id) {

        acessoRepository.deleteById(id);

        return new ResponseEntity("Acesso Removido", HttpStatus.OK);
    }

    @GetMapping(value = "**/obterAcesso/{id}")
    public ResponseEntity<Acesso> obterAcesso(@PathVariable("id") Long id) {

      Acesso acesso = acessoRepository.findById(id).get();

        return new ResponseEntity<Acesso>(acesso, HttpStatus.OK);
    }

    @GetMapping(value = "**/buscarPorDesc/{desc}")
    public ResponseEntity<List<Acesso>> buscarPorDesc(@PathVariable("desc") String desc) {

        List<Acesso> acesso = acessoRepository.buscarAcessoDesc(desc);

        return new ResponseEntity<List<Acesso>>(acesso, HttpStatus.OK);
    }
}
