/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyba.appentix.business.referentiel.model;

import javax.persistence.Basic;
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
@Table(name = "MENUS2")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "MENUS2_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)




public class Menus2 extends GenericEntity implements ITracable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "CD_ID")
    private Long cdId;
    @Column(name = "CD_APPL", length = 10)
    private String cdAppl;
    @Basic(optional = false)
    @Column(name = "CD_FORM", nullable = false, length = 30)
    private String cdForm;
    @Column(name = "CD_NVAU", length = 30)
    private String cdNvau;
    @Column(name = "CD_ENVI", length = 1)
    private String cdEnvi;
    @Column(name = "TY_CONN", length = 1)
    private String tyConn;
    @Column(name = "CD_RANG")
    private Short cdRang;
    @Column(name = "CD_ROOT", length = 20)
    private String cdRoot;
    @Column(name = "CD_MENU", length = 20)
    private String cdMenu;
    @Column(name = "LIB_MENU", length = 60)
    private String libMenu;
    @Column(name = "MENU", length = 50)
    private String menu;
    @Column(name = "CD_COMENT", length = 500)
    private String cdComent;
    @Column(name = "TOPTEN", length = 1)
    private String topten;

    public Menus2() {
    }

    public Menus2(Long cdId) {
        this.cdId = cdId;
    }

    public Menus2(Long cdId, String cdForm) {
        this.cdId = cdId;
        this.cdForm = cdForm;
    }

    public Long getCdId() {
        return cdId;
    }

    public void setCdId(Long cdId) {
        this.cdId = cdId;
    }

    public String getCdAppl() {
        return cdAppl;
    }

    public void setCdAppl(String cdAppl) {
        this.cdAppl = cdAppl;
    }

    public String getCdForm() {
        return cdForm;
    }

    public void setCdForm(String cdForm) {
        this.cdForm = cdForm;
    }

    public String getCdNvau() {
        return cdNvau;
    }

    public void setCdNvau(String cdNvau) {
        this.cdNvau = cdNvau;
    }

    public String getCdEnvi() {
        return cdEnvi;
    }

    public void setCdEnvi(String cdEnvi) {
        this.cdEnvi = cdEnvi;
    }

    public String getTyConn() {
        return tyConn;
    }

    public void setTyConn(String tyConn) {
        this.tyConn = tyConn;
    }

    public Short getCdRang() {
        return cdRang;
    }

    public void setCdRang(Short cdRang) {
        this.cdRang = cdRang;
    }

    public String getCdRoot() {
        return cdRoot;
    }

    public void setCdRoot(String cdRoot) {
        this.cdRoot = cdRoot;
    }

    public String getCdMenu() {
        return cdMenu;
    }

    public void setCdMenu(String cdMenu) {
        this.cdMenu = cdMenu;
    }

    public String getLibMenu() {
        return libMenu;
    }

    public void setLibMenu(String libMenu) {
        this.libMenu = libMenu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCdComent() {
        return cdComent;
    }

    public void setCdComent(String cdComent) {
        this.cdComent = cdComent;
    }

    public String getTopten() {
        return topten;
    }

    public void setTopten(String topten) {
        this.topten = topten;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdId != null ? cdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menus2)) {
            return false;
        }
        Menus2 other = (Menus2) object;
        if ((this.cdId == null && other.cdId != null) || (this.cdId != null && !this.cdId.equals(other.cdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tyba.ucad.model.Menus2[ cdId=" + cdId + " ]";
    }

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return cdId;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return "Menus2";
	}
    
}
