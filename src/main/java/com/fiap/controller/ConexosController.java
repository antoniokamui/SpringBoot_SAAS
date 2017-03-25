package com.fiap.controller;

import com.fiap.repository.ConexoesRepository;
import com.fiap.entity.ConexoesEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by logonrm on 25/03/2017.
 */
@RestController
@RequestMapping("/conexoes")
public class ConexosController {
    ConexoesRepository repository;

    @RequestMapping("/listar")
    public List<ConexoesEntity> listar(){
        return repository.findAll();
    }
}
