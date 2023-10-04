package com.adri.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adri.dao.PedidosDao;
import com.adri.model.Pedido;

/**
 * @author Adrian Armesto
 * 
 * @see PedidosServices
 * @see PedidosDao
 * @see RestTemplate
 * 
 * Clase que implementa la interfaz con los metodos listar, actualizar y obtener el precio
 * 
 * @param alta Recibimos los parametros del pedido, buscamos el precio del producto, creamos el pedido y le restamos el stock al producto
 * @param lista Listamos todos los pedidos que tenemos
 * 
 *  */

@Service
public class PedidosServiceImpl implements PedidosService{

    @Autowired
    PedidosDao dao;

    @Autowired
    RestTemplate template;

    String url = "http://localhost:8080/";

    @Override
    public void alta(int idpedido, int codigoproducto, int unidades) {

        LocalDateTime hoy = LocalDateTime.now();
 
        Double precio = (template.getForObject(url+"producto/"+codigoproducto, Double.class)*unidades);

        Pedido pedidoN =new Pedido(
            idpedido,
            codigoproducto,
            unidades,
            precio,
            hoy
        );

        dao.save(pedidoN);

        template.put(url+"producto/"+codigoproducto+"/"+unidades, null);

    }

    @Override
    public List<Pedido> lista() {
        return dao.findAll();
    }
    
}
