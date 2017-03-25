package com.fiap.controller;

import com.fiap.entity.ConexaoUsuarioEntity;
import com.fiap.entity.ConexoesEntity;
import com.fiap.repository.ConexaoUsuarioRepository;
import com.fiap.repository.ConexoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by logonrm on 25/03/2017.
 */
@RestController
@RequestMapping("/conexaousuario")
public class ConexaoUsuarioController {

    @Autowired
    ConexaoUsuarioRepository repository;

    @RequestMapping("/listar")
    public List<ConexaoUsuarioEntity> listar(){
        return repository.findAll();
    }
}
