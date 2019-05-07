package com.tyba.technicalServices.reporting.impl;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import com.tyba.technicalServices.exception.TechnicalException;
import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;
import com.tyba.technicalServices.reporting.IReportExporter;
import com.tyba.technicalServices.reporting.ReportExportException;
import com.tyba.technicalServices.reporting.ReportSpecification;
import com.tyba.technicalServices.reporting.ReportType;

public class JasperReportExporter implements IReportExporter {

	private ILogger logger = SL4JLogger.getInstance(JasperReportExporter.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tyba.framework.technicalServices.reporting.IReportExporter#export(
	 * com.tyba.framework.technicalServices.reporting.ReportSpecification,
	 * java.util.List, com.tyba.framework.technicalServices.reporting.ReportType)
	 */

	public void export(ReportSpecification reportSpec, Collection beanList,
			ReportType reportType) throws ReportExportException {

		try {
			InputStream inputStream = null;

			inputStream = getClass().getClassLoader().getResourceAsStream(
					reportSpec.getModel());

			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(
					beanList);

			Map<String, Object> dataMap = new HashMap<String, Object>();

			JasperDesign jasperDesign;
			jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, dataMap, beanColDataSource);

			if (reportSpec.getOutputFile() != null) {
				export(jasperPrint, reportSpec.getOutputFile(), reportType);
			} else {
				export(jasperPrint, reportSpec.getOutputStream(), reportType);
			}

		} catch (JRException e) {
			logger.error("jasperReport export problem", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void export(JasperPrint jasperPrint, String exportFile,
			ReportType reportType) throws JRException {

		if (reportType.equals(ReportType.PDF)) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, exportFile
					+ ".pdf");

		}
		if (reportType.equals(ReportType.PPT)) {
			JRPptxExporter  exporter = new JRPptxExporter ();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, exportFile+ ".csv");
            exporter.exportReport();
		}
		if (reportType.equals(ReportType.DOCX)) {
			JRDocxExporter  exporter = new  JRDocxExporter ();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, exportFile+ ".docx");
            exporter.exportReport();
		}
		if (reportType.equals(ReportType.CSV)) {
			JRCsvExporter exporter = new JRCsvExporter();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, exportFile+ ".csv");
            exporter.exportReport();
		}
		
		 

		if (reportType.equals(ReportType.HTML)) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint, exportFile
					+ ".html");
		}

		if (reportType.equals(ReportType.XML)) {
			JasperExportManager.exportReportToXmlFile(jasperPrint, exportFile
					+ ".xml", false);
		}

		if (reportType.equals(ReportType.XLS)) {
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE, exportFile
					+ ".xls");
			// excel parameter
			exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
					Boolean.FALSE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
					Boolean.TRUE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.FALSE);

			exporter.exportReport();
		}

	}

	private void export(JasperPrint jasperPrint, OutputStream outputStream,
			ReportType reportType) throws JRException {

		if (reportType.equals(ReportType.PDF)) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, outputStream
					+ ".pdf");

		}
		if (reportType.equals(ReportType.CSV)) {
			JRCsvExporter exporter = new JRCsvExporter();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
            exporter.exportReport();
		}
		if (reportType.equals(ReportType.PPT)) {
			JRPptxExporter  exporter = new JRPptxExporter ();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
            exporter.exportReport();
		}
		if (reportType.equals(ReportType.DOCX)) {
			JRDocxExporter  exporter = new  JRDocxExporter ();
	        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
            exporter.exportReport();
		}
		if (reportType.equals(ReportType.HTML)) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,
					outputStream + ".html");
		}

		if (reportType.equals(ReportType.XLS)) {
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					outputStream);
			// excel parameter
			exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
					Boolean.FALSE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
					Boolean.TRUE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.FALSE);

			exporter.exportReport();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					outputStream);
			// excel parameter
			exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
					Boolean.FALSE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
					Boolean.TRUE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.FALSE);

			exporter.exportReport();
		}

		if (reportType.equals(ReportType.XML)) {
			JasperExportManager.exportReportToXmlStream(jasperPrint,
					outputStream);
		}

		if (reportType.equals(ReportType.HTML)) {
			throw new TechnicalException("not implemented");
		}

		
	}

}
