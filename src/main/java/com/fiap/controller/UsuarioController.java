package com.fiap.controller;

/**
 * Created by logonrm on 25/03/2017.
 */

import com.fiap.entity.UsuarioEntity;
import com.fiap.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/cadastrar",method = RequestMethod.POST)
    public void cadastrar(UsuarioEntity user){
        repository.save(user);
    }
}
