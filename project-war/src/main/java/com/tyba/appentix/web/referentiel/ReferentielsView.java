/*
* ReferentielsView.java
*
* Copyright (c) 1990-2014 TYBASOFT, Inc. All Rights Reserved.
*/
package com.tyba.appentix.web.referentiel;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



import org.primefaces.context.RequestContext;


import org.primefaces.model.TreeNode;

import com.tyba.technicalServices.web.BaseMBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ReferentielsView.
 *
 * @version 1.0 24 nov. 2014
 * @author TYBASOFT
 */
@ManagedBean(name = "ReferentielsView")
@ApplicationScoped
public class ReferentielsView extends BaseMBean {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The root. */
	private TreeNode root;

	/** The selected node. */
	private TreeNode selectedNode;

	/** The view. */
	private String view;

	

	/* (non-Javadoc)
	 * @see com.tyba.technicalServices.web.BaseMBean#init()
	 */
	@Override
	public void init() {
		super.init();
		view = "ref_view_pays";
	}

	/**
	 * Gets the root.
	 *
	 * @return the root
	 */
	public TreeNode getRoot() {
		return root;
	}

	/**
	 * Gets the selected node.
	 *
	 * @return the selected node
	 */
	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	/**
	 * Sets the selected node.
	 *
	 * @param selectedNode the new selected node
	 */
	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	

	/**
	 * Instantiates a new referentiels view.
	 */
	public ReferentielsView() {

	}


	/**
	 * Navigation.
	 */
	public void navigation() {
		RequestContext context = RequestContext.getCurrentInstance();
		if (view.equals("ref_view_pays") || view.equals("ref_view_devise") || view.equals("autocar"))
			context.update("referentiel:ref_view");

	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public String getView() {
		return view;
	}

	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	public void setView(String view) {
		this.view = view;
	}

}
