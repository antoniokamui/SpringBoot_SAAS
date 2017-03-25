package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "conexao_usuario", schema = "public", catalog = "fiapdb")
@IdClass(ConexaoUsuarioEntityPK.class)
public class ConexaoUsuarioEntity {
    private int idUsuario;
    private int idConexoes;

    @Id
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Id
    @Column(name = "id_conexoes", nullable = false)
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

        ConexaoUsuarioEntity that = (ConexaoUsuarioEntity) o;

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
