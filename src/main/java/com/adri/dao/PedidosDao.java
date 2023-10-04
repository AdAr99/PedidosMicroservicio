package com.adri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.model.Pedido;

public interface PedidosDao extends JpaRepository<Pedido, Integer> {
    
}
