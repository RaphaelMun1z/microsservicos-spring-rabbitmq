package processador.service;

import org.springframework.stereotype.Service;
import processador.entity.ItemPedido;
import processador.entity.Pedido;
import processador.repository.ItemPedidoRepository;

import java.util.List;

@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public List<ItemPedido> save(List<ItemPedido> itens) {
        return itemPedidoRepository.saveAll(itens);
    }

    public void save(ItemPedido item) {
        itemPedidoRepository.save(item);
    }

    public void updatedItemPedido(List<ItemPedido> itensPedido, Pedido pedido) {
        itensPedido.forEach(item -> {
            item.setPedido(pedido);
            this.save(item);
        });
    }
}
