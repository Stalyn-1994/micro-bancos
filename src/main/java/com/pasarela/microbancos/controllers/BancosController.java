package com.pasarela.microbancos.controllers;

import java.util.List;

import com.pasarela.microbancos.models.Bancos;
import com.pasarela.microbancos.services.BancosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/")
public class BancosController {
    
    @Autowired
	private BancosService bancoService;

    @GetMapping
	private ResponseEntity<List<Bancos>> listarTodasLasPersona (){	
		return ResponseEntity.ok(bancoService.getAllPersonas());			
	}

}
