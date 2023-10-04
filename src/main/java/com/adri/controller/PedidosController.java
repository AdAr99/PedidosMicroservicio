package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Pedido;
import com.adri.service.PedidosService;

@RestController
public class PedidosController {
    
    @Autowired
    PedidosService service;

    @PostMapping(value = "pedido/{idpedido}/{codigoproducto}/{unidades}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void alta(@PathVariable int idpedido,@PathVariable int codigoproducto,@PathVariable int unidades){
        service.alta(idpedido, codigoproducto, unidades);
    }

    @GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> lista(){
        return service.lista();
    }

}
