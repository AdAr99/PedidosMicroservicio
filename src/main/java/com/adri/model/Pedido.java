package com.adri.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    private int idpedido;
    private int codigoproducto;
    private int unidades;
    private double total;
    private LocalDateTime fecha;
    
    public Pedido() {
    }

    public Pedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public Pedido(int idpedido, int codigoproducto, int unidades, double total, LocalDateTime fecha) {
        this.idpedido = idpedido;
        this.codigoproducto = codigoproducto;
        this.unidades = unidades;
        this.total = total;
        this.fecha = fecha;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    

    
    
}
