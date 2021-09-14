package com.pasarela.microbancos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasarela.microbancos.models.Banco;

public interface BancoRepository extends JpaRepository<Banco, Integer>{ }
