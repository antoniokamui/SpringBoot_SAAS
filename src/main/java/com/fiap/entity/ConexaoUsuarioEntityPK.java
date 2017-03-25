package com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by logonrm on 25/03/2017.
 */
public class ConexaoUsuarioEntityPK implements Serializable {
    private int idUsuario;
    private int idConexoes;

    @Column(name = "id_usuario", nullable = false)
    @Id
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "id_conexoes", nullable = false)
    @Id
    public int getIdConexoes() {
        return idConexoes;
    }

    public void setIdConexoes(int idConexoes) {
        this.idConexoes = idConexoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConexaoUsuarioEntityPK that = (ConexaoUsuarioEntityPK) o;

        if (idUsuario != that.idUsuario) return false;
        if (idConexoes != that.idConexoes) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idConexoes;
        return result;
    }
}
