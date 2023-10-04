package com.adri.service;

import java.util.List;

import com.adri.model.Pedido;

public interface PedidosService {
    void alta(int idpedido, int codigoproducto, int unidades);
    List<Pedido> lista();
}
