package com.pasarela.microbancos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasarela.microbancos.models.Bancos;

public interface BancosRepository extends JpaRepository<Bancos, Integer>{ }
