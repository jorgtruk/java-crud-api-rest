package com.jorgt.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorgt.apirest.apirest.Entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
