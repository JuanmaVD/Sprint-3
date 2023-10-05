package com.tup.buensabor.repositorios;

import com.tup.buensabor.entities.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {
}
