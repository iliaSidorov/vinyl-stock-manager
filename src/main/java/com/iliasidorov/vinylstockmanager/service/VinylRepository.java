package com.iliasidorov.vinylstockmanager.service;

import com.iliasidorov.vinylstockmanager.model.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinylRepository extends JpaRepository <Vinyl, Long> {
}
