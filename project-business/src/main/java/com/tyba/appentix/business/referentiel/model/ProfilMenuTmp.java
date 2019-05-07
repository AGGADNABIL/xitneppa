/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyba.appentix.business.referentiel.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;

/**
 *
 */

@Entity
@Table(name = "PROFIL_MENU_TMP")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "PROFIL_MENU_TMP_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)

public class ProfilMenuTmp extends GenericEntity implements ITracable {
    private static final long serialVersionUID = 1L;
    
    @Id
   	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
   	@Column(name = "ID_PROFIL")   
    private Long idProfil;
    @Column(name = "SOC_PRO_MEN", length = 6)
    private String socProMen;
    @Column(name = "CODE_PRO", length = 8)
    private String codePro;
    @Column(name = "ROOT_MENU", length = 20)
    private String rootMenu;
    @Column(name = "LIB_MENU", length = 60)
    private String libMenu;
    @Column(name = "DROIT", length = 1)
    private String droit;
    @Column(name = "MENU_MENU", length = 20)
    private String menuMenu;
    @Column(name = "RANG")
    private BigInteger rang;
    @Column(name = "FORMA", length = 8)
    private String forma;
    @Column(name = "VALID", length = 1)
    private String valid;
    @Column(name = "APPLIC", length = 20)
    private String applic;
    @Column(name = "N_LEVEL")
    private BigInteger nLevel;

    public ProfilMenuTmp() {
    }

    public ProfilMenuTmp(Long idProfil) {
        this.idProfil = idProfil;
    }

    public Long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(Long idProfil) {
        this.idProfil = idProfil;
    }

    public String getSocProMen() {
        return socProMen;
    }

    public void setSocProMen(String socProMen) {
        this.socProMen = socProMen;
    }

    public String getCodePro() {
        return codePro;
    }

    public void setCodePro(String codePro) {
        this.codePro = codePro;
    }

    public String getRootMenu() {
        return rootMenu;
    }

    public void setRootMenu(String rootMenu) {
        this.rootMenu = rootMenu;
    }

    public String getLibMenu() {
        return libMenu;
    }

    public void setLibMenu(String libMenu) {
        this.libMenu = libMenu;
    }

    public String getDroit() {
        return droit;
    }

    public void setDroit(String droit) {
        this.droit = droit;
    }

    public String getMenuMenu() {
        return menuMenu;
    }

    public void setMenuMenu(String menuMenu) {
        this.menuMenu = menuMenu;
    }

    public BigInteger getRang() {
        return rang;
    }

    public void setRang(BigInteger rang) {
        this.rang = rang;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getApplic() {
        return applic;
    }

    public void setApplic(String applic) {
        this.applic = applic;
    }

    public BigInteger getNLevel() {
        return nLevel;
    }

    public void setNLevel(BigInteger nLevel) {
        this.nLevel = nLevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfil != null ? idProfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfilMenuTmp)) {
            return false;
        }
        ProfilMenuTmp other = (ProfilMenuTmp) object;
        if ((this.idProfil == null && other.idProfil != null) || (this.idProfil != null && !this.idProfil.equals(other.idProfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tyba.ucad.model.ProfilMenuTmp[ idProfil=" + idProfil + " ]";
    }

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idProfil;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return "ProfilMenuTmp";
	}
    
}
