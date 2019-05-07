/**
 * Description :
 *  Interface pour les conversions
 *  
 * <TABLE>
 *   <TR>
 *     <TD><B>Attributs CVS :</B></TD>
 *     <TD>R�sum� : $Id: ConvertUtil.java,v 1.1.6.1 2010/04/09 17:59:38 slakhlifi Exp $</TD>
 *   </TR>
 *   <TR>
 *     <TD><I>Nom du fichier :</I></TD>
 *     <TD>$Header: /ArchCVS/d_pvc/pvc/sofrecom-fwk/src/main/java/com/sofrecom/fwk/utils/ConvertUtil.java,v 1.1.6.1 2010/04/09 17:59:38 slakhlifi Exp $</TD>
 *   </TR>
 *   <TR>
 *     <TD><I>Modifi� le :</I></TD>
 *     <TD>$Date: 2010/04/09 17:59:38 $ par $Author: slakhlifi $ </TD>
 *   </TR>
 *   <TR>
 *     <TD><I>Logs :</I></TD>
 *     <TD>$Log: ConvertUtil.java,v $
 *     <TD>Revision 1.1.6.1  2010/04/09 17:59:38  slakhlifi
 *     <TD>*** empty log message ***
 *     <TD>
 *     <TD>Revision 1.1  2009/11/19 09:27:37  slakhlifi
 *     <TD>*** empty log message ***
 *     <TD>
 *     <TD>Revision 1.1.1.1  2009/11/09 12:10:58  abenchekroun
 *     <TD>init
 *     <TD>
 *     <TD>Revision 1.2.16.2  2009/06/30 11:43:46  bri
 *     <TD>*** empty log message ***
 *     <TD>
 *     <TD>Revision 1.2.16.1  2009/06/03 16:53:39  bri
 *     <TD>*** empty log message ***
 *     <TD>
 *     <TD>Revision 1.2  2008/05/27 10:28:18  dom
 *     <TD>Acte de Vente 27/05
 *     <TD>
 *     <TD>Revision 1.1  2008/04/16 14:49:21  lnt
 *     <TD>*** empty log message ***
 *     <TD>
 *     <TD>Revision 1.1  2008/03/10 08:30:17  alsa
 *     <TD>Migration du prototype vers le projet de d�veloppement
 *     <TD>
 *     <TD>Revision 1.1  2008/02/29 15:39:30  asu
 *     <TD>ASU - D�but de cr�ation des JSP de PSEM
 *     <TD>
 *     <TD></TD>
 *   </TR>
 * </TABLE>
 */
package com.tyba.technicalServices.tools;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.omg.CORBA.SystemException;

import com.tyba.technicalServices.exception.TechnicalException;
import com.tyba.technicalServices.log.ILogger;
import com.tyba.technicalServices.log.impl.SL4JLogger;

public class ConvertUtil {

	public static final String FORMAT_DEFAUT = "yyyy-MM-dd";
	public static final String FRENCH_DEFAUT = "dd/MM/yyyy";
	public static final String FRENCH_DEFAUT_BIS = "dd/MM/yyyy HH:mm:ss";
	public static final String FORMAT_DATE = "ddMMyyyy";
	public static final String SQL_DEFAUT = "yyyy-MM-dd HH:mm:ss";
	private static ILogger logger = SL4JLogger.getInstance(ConvertUtil.class);


	//  ------------------------------------------------------------------------
	//	--------------FROM STRING TO SPECIFIC TYPES ----------------------------
	//	------------------------------------------------------------------------

	/**
	 * M�thode permettant de convertir un String en Date<br>
	 * @param data
	 * @return Date
	 * @throws SystemException
	 */
	public static Date stringToDate(String data) {
		return stringToDate(data, FRENCH_DEFAUT);
	}

	/**
	 * M�thode permettant de convertir un String en Date
	 * @param data
	 * @param pattern
	 * @return Date
	 * @throws TechnicalException
	 */
	public static Date stringToDate(String data, String pattern) {

		if (data == null || data.equals(""))
			return null;

		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		Date res = null;
		try {
			res = formatter.parse(data);
		} catch (ParseException e) {
			logger.error(e.getMessage(),e);
		}
		return res;
	}

	/**
	 * M�thode permettant de convertir un String en Date
	 * @param data
	 * @return Date
	 */
	public static java.sql.Date stringToSqlDate(String data) {
		return stringToSqlDate(data, FRENCH_DEFAUT);
	}

	/**
	 * M�thode permettant de convertir un String en Date Sql
	 * @param data
	 * @param pattern
	 * @return java.sql.Date
	 */
	public static java.sql.Date stringToSqlDate(String data, String pattern) {

		if (data == null || data.equals("") || data.length() != pattern.length())
			return null;

		java.sql.Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		ParsePosition pp = new ParsePosition(0);
		date = new java.sql.Date(sdf.parse(data, pp).getTime());

		return date;
	}
	
	   /**
     * methode convertissant une date en string
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        return dateToString(date, FRENCH_DEFAUT);
    }
    
    /**
     * methode convertissant une date en string
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        
        if (date == null)
            return null;
            
        String st = new String();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        st = sdf.format(date);
        return st;
    }
    
    /**
     * Methode utilis�e pour convertir un String en un long
     * 
     * @param String s
     * @return long l
     */
    public static Long stringToLong(String s) {
        Long l = null;
        if (s != null && s.length() != 0)
            l = Long.valueOf(s);
        return l;
    }
    
    public static Date roundDateToLower(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal.getTime();
	}

	public static Date roundDateToUpper(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);

		return cal.getTime();
	}
    

}
