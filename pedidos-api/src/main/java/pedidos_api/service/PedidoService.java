package pedidos_api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pedidos_api.entity.Pedido;

@Service
public class PedidoService {
    private final Logger logger = LoggerFactory.getLogger(PedidoService.class);

    @Value("${spring.rabbitmq.template.exchange}")
    private String exchangeName;

    private final RabbitTemplate rabbitTemplate;

    public PedidoService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public Pedido enfileirarPedido(Pedido pedido) {
        rabbitTemplate.convertAndSend(exchangeName, "", pedido);
        logger.info("Pedido enfileirado: {}", pedido.toString());
        return pedido;
    }
}
