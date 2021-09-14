package com.pasarela.microbancos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasarela.microbancos.models.Bancos;
import com.pasarela.microbancos.repositories.BancosRepository;

@Service
public class BancosService {

    @Autowired
	private BancosRepository bancoRepository;
		
	public List<Bancos> getAllPersonas (){
		return bancoRepository.findAll();
	}

}
