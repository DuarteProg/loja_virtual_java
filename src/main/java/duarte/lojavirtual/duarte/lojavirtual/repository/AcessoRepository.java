package duarte.lojavirtual.duarte.lojavirtual.repository;

import duarte.lojavirtual.duarte.lojavirtual.model.Acesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long> {
}
