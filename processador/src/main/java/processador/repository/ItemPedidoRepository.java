package processador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import processador.entity.ItemPedido;

import java.util.UUID;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID> {
}
