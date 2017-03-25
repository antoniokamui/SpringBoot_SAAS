package com.fiap.controller;

import com.fiap.entity.ConexoesEntity;
import com.fiap.entity.UsuarioEntity;
import com.fiap.repository.ConexoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by logonrm on 25/03/2017.
 */
@RestController
@RequestMapping("/conexoes")
public class ConexoesController {
    @Autowired
    ConexoesRepository repository;

    @RequestMapping("/listar")
    public List<ConexoesEntity> listar(){
        return repository.findAll();
    }

    @RequestMapping("/cadastrar")
    public void cadastrar(ConexoesEntity conexE){
        repository.save(conexE);
    }
}

