package com.baozi.store.dto;

public record PedidoRequest(Long clienteId, Long produtoId, Integer quantidade) {
}
