package com.fiap.entity;

import javax.persistence.*;

/**
 * Created by logonrm on 25/03/2017.
 */
@Entity
@Table(name = "conexoes", schema = "public", catalog = "fiapdb")
public class ConexoesEntity {
    private String macaddress;
    private String ssid;
    private String password;
    private int tiposeguranca;
    private String tokensegunca;
    private int timeout;
    private String ip;
    private int id;

    @Basic
    @Column(name = "macaddress", nullable = true, length = 100)
    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    @Basic
    @Column(name = "ssid", nullable = false, length = 100)
    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "tiposeguranca", nullable = false)
    public int getTiposeguranca() {
        return tiposeguranca;
    }

    public void setTiposeguranca(int tiposeguranca) {
        this.tiposeguranca = tiposeguranca;
    }

    @Basic
    @Column(name = "tokensegunca", nullable = false, length = 50)
    public String getTokensegunca() {
        return tokensegunca;
    }

    public void setTokensegunca(String tokensegunca) {
        this.tokensegunca = tokensegunca;
    }

    @Basic
    @Column(name = "timeout", nullable = false)
    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Basic
    @Column(name = "ip", nullable = false, length = 100)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConexoesEntity that = (ConexoesEntity) o;

        if (tiposeguranca != that.tiposeguranca) return false;
        if (timeout != that.timeout) return false;
        if (id != that.id) return false;
        if (macaddress != null ? !macaddress.equals(that.macaddress) : that.macaddress != null) return false;
        if (ssid != null ? !ssid.equals(that.ssid) : that.ssid != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (tokensegunca != null ? !tokensegunca.equals(that.tokensegunca) : that.tokensegunca != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = macaddress != null ? macaddress.hashCode() : 0;
        result = 31 * result + (ssid != null ? ssid.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + tiposeguranca;
        result = 31 * result + (tokensegunca != null ? tokensegunca.hashCode() : 0);
        result = 31 * result + timeout;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
