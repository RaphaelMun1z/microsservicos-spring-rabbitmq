package processador.service;

import org.springframework.stereotype.Service;
import processador.entity.ItemPedido;
import processador.repository.PedidoRepository;
import processador.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void save(List<ItemPedido> itens) {
        itens.forEach(item -> {
            produtoRepository.save(item.getProduto());
        });
    }
}
