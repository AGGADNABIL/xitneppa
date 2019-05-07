/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyba.appentix.business.referentiel.model;


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
@Table(name = "PROFIL_ACC")
@TableGenerator(name = "PkGen", table = "sequence_generator", pkColumnName = "GEN_NAME", pkColumnValue = "PROFIL_ACC_Gen", valueColumnName = "GEN_VALUE", initialValue = 0, allocationSize = 1)

public class ProfilAcc extends GenericEntity implements ITracable {
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen")
	@Column(name = "id")
    private Long id;  
    @Column(name = "CODE_PRO_ACC", length = 10)
    private String codeProAcc;
    @Column(name = "LIB_PRO", length = 60)
    private String libPro;
    @Column(name = "TYPE_PRO", length = 1)
    private String typePro;
	@Column(name = "STATUT")
    @Enumerated(EnumType.STRING)
    private EntityStatus statut;
    
    public ProfilAcc() {
    }
    
	public ProfilAcc(Long id) {
		super();
		this.id = id;
	}
    
	public ProfilAcc(Long id, String codeProAcc, String libPro, String typePro,
			EntityStatus statut) {
		super();
		this.id = id;
		this.codeProAcc = codeProAcc;
		this.libPro = libPro;
		this.typePro = typePro;
		this.statut = statut;
	}
    
	public Long getId() {
		return id;
	}
    
	public void setId(Long id) {
		this.id = id;
	}
    
	public String getCodeProAcc() {
		return codeProAcc;
	}

	public void setCodeProAcc(String codeProAcc) {
		this.codeProAcc = codeProAcc;
	}

	public String getLibPro() {
		return libPro;
	}

	public void setLibPro(String libPro) {
		this.libPro = libPro;
	}

	public String getTypePro() {
		return typePro;
	}

	public void setTypePro(String typePro) {
		this.typePro = typePro;
	}

	public EntityStatus getStatut() {
		return statut;
	}

	public void setStatut(EntityStatus statut) {
		this.statut = statut;
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
