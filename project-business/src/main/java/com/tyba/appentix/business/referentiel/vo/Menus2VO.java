package com.tyba.appentix.business.referentiel.vo;


import com.sun.istack.NotNull;
import com.tyba.appentix.business.referentiel.model.Menus2;
import com.tyba.appentix.business.referentiel.vo.transformer.Menus2VOTransformer;
import com.tyba.technicalServices.core.ITransformer;
import com.tyba.technicalServices.core.ValueObject;
import com.tyba.technicalServices.web.ISearchResultVO;

public class Menus2VO implements ValueObject, ISearchResultVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
    private Long cdId;
    private String cdAppl;
	@NotNull
    private String cdForm;
	@NotNull
    private String cdNvau;
 
    private String cdEnvi;

    private String tyConn;
	@NotNull
    private Short cdRang;
    
    private String cdRoot;
	@NotNull
    private String cdMenu;
	@NotNull
    private String libMenu;
	@NotNull
    private String menu;
    
    private String cdComent;

    private String topten;
	

	@Override
	public String getIdForSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITransformer<Menus2, Menus2VO> getTransformer() {
		// TODO Auto-generated method stub
		return new Menus2VOTransformer();
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

}
