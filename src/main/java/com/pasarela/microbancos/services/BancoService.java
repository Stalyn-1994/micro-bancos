package com.pasarela.microbancos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasarela.microbancos.models.Banco;
import com.pasarela.microbancos.repositories.BancoRepository;

@Service
public class BancoService {

    @Autowired
	private BancoRepository bancoRepository;
		
	public List<Banco> getAllPersonas (){
		return bancoRepository.findAll();
	}

}
