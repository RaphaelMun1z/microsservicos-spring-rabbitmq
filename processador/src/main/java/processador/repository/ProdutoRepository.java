package processador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import processador.entity.Produto;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
