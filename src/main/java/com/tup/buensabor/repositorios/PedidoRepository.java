package com.tup.buensabor.repositorios;

import com.tup.buensabor.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
