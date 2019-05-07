/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyba.appentix.business.referentiel.model;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;










import com.tyba.appentix.business.common.EntityStatus;
import com.tyba.technicalServices.audit.impl.ITracable;
import com.tyba.technicalServices.dao.impl.GenericEntity;




@Entity
@Table(name = "PROFIL_MENU")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "PROFIL_MENU_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)

public class ProfilMenu extends GenericEntity implements ITracable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3560303773889979583L;

    @Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "id")
    private Long id;
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
    private String rang;
    @Basic(optional = false)
    @Column(name = "FORMA", nullable = false, length = 100)
    private String forma;
    @Column(name = "VALID", length = 1)
    private String valid;
    @Column(name = "APPLIC", length = 20)
    private String applic;
    @Column(name = "LIB_ACTION", length = 50)
    private String libAction;
    @Column(name = "STATUT")
    @Enumerated(EnumType.STRING)
    private EntityStatus statut;
    
    public ProfilMenu(){}

	public ProfilMenu(Long id) {
		super();
		this.id = id;
	}

	public ProfilMenu(Long id, String codePro, String rootMenu, String libMenu,
			String droit, String menuMenu, String rang, String forma,
			String valid, String applic, String libAction, EntityStatus statut) {
		super();
		this.id = id;
		this.codePro = codePro;
		this.rootMenu = rootMenu;
		this.libMenu = libMenu;
		this.droit = droit;
		this.menuMenu = menuMenu;
		this.rang = rang;
		this.forma = forma;
		this.valid = valid;
		this.applic = applic;
		this.libAction = libAction;
		this.statut = statut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
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

	public String getLibAction() {
		return libAction;
	}

	public void setLibAction(String libAction) {
		this.libAction = libAction;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getTraceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameEntity() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
    

    
}
