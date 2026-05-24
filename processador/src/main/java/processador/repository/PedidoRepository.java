package processador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import processador.entity.Pedido;

import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
}
