package com.example.demo.service;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ClienteRepository extends JpaRepository<Cliente, Long> {
}
