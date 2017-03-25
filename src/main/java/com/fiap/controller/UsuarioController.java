package com.fiap.controller;

/**
 * Created by logonrm on 25/03/2017.
 */

import com.fiap.repository.UsuarioRepository;
import com.fiap.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @RequestMapping("/listar")
    public List<UsuarioEntity> listar(){
        return repository.findAll();
    }
}
