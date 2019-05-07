package com.tyba.technicalServices.reporting;

import java.util.Collection;

public interface IReportExporter {
	/**
	 * export la liste  "beanList" dans un fichier ou un "outputstream" (reportSpec) selon un model ((reportSpec) dans une sortie "reportType"  (pdf, xsl,...)
	 * @param reportSpec
	 * @param beanList
	 * @param reportType
	 */
	void export(ReportSpecification reportSpec, Collection beanList, ReportType reportType);
   
}
