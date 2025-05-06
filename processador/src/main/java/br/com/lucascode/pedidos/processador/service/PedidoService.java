package br.com.lucascode.pedidos.processador.service;

import br.com.lucascode.pedidos.processador.entity.ItemPedido;
import br.com.lucascode.pedidos.processador.entity.Pedido;
import br.com.lucascode.pedidos.processador.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final ProdutoService produtoService;
    private final ItemPedidoService itemPedidoService;

    public PedidoService(PedidoRepository pedidoRepository, ProdutoService produtoService, ItemPedidoService itemPedidoService) {
        this.pedidoRepository = pedidoRepository;
        this.produtoService = produtoService;
        this.itemPedidoService = itemPedidoService;
    }

    public void save(Pedido pedido){

        //salvar produtos
        produtoService.save(pedido.getItens());

        //sakvabdi is utebs do pedido
        List<ItemPedido> itemPedidos = itemPedidoService.save(pedido.getItens());

        //salvamos o pedido
        pedidoRepository.save(pedido);

        //atualiza o item pedido definindo o pedido ao qual ele faz parte
        itemPedidoService.updatedItemPedido(itemPedidos, pedido);

        logger.info("Pedido salvo: {}", pedido.toString());

    }
}
