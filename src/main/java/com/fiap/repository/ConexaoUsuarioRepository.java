package com.fiap.repository;

import com.fiap.entity.ConexaoUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by logonrm on 25/03/2017.
 */
@Repository
public interface ConexaoUsuarioRepository extends JpaRepository<ConexaoUsuarioEntity, Long> {
}
