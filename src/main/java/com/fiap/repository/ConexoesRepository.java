package com.fiap.repository;

import com.fiap.entity.ConexoesEntity;
import com.fiap.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by logonrm on 25/03/2017.
 */

public interface ConexoesRepository extends JpaRepository<ConexoesEntity, Long>  {
}
