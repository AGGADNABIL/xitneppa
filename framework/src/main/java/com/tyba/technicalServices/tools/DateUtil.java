package com.tyba.technicalServices.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class DateUtil {

//	private static ILogger logger = SL4JLogger.getInstance(DateUtil.class);

	public static final String FORMAT_DEFAUT = "yyyy-MM-dd";

	public static final String FRENCH_DEFAUT = "dd/MM/yyyy";

	public static final String FORMAT_DDMMYY = "dd-MM-yy";
	
	public final static String DF_DD_MM_YYYY_HH_MM = "dd/MM/yyyy HH:mm";
	
	public final static String DF_DD_MM_YYYY_A_HH_MM_SS = "dd/MM/yyyy � HH:mm:ss";

	public static String[] mois = { "janvier", "f�vrier", "mars", "avril",
			"mai", "juin", "juillet", "ao�t", "septembre", "octobre",
			"novembre", "d�cembre" };

	public static final Map<String, Integer> moisByNumList = new HashMap<String, Integer>();

	
	public static final long MS_PAR_JOUR = 1000 * 60 * 60 * 24;

	public final static String DATE_SEPARATOR = "/";

	/**
	 * M�thode permettant de r�cup�rer la date courante
	 * 
	 * @return Date
	 */
	public static Date currentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(new Date());
		return ConvertUtil.stringToDate(strDate);
	}

	/**
	 * M�thode permettant de r�cup�rer l'ann�e courant
	 * 
	 * @return int
	 */

	public static int currentYear() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		return Integer.parseInt(formatter.format(currentDate()));
	}

	/**
	 * M�thode permettant de retourner une date du type "dd/mm/yyyy" avec comme
	 * param�tre le jour, le mois et l'ann�e
	 * 
	 * @return Date
	 * @throws ParseException
	 */
	public static Date format(String day, String month, String year)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		return formatter.parse(day + "/" + month + "/" + year);
	}

	
	/**
	 * M�thode retourne vrai si les deux dates correspondent au m�me jour<br>
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isSameDay(Date date1, Date date2) {
		String jour1 = ConvertUtil.dateToString(date1, "ddMMyyyy");
		String jour2 = ConvertUtil.dateToString(date2, "ddMMyyyy");
		if (jour1.equals(jour2)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * M�thode retourne vrai si la premiere date est un jour avant le date
	 * suivante <br>
	 * 
	 * @param date1
	 * @param date2
	 * @return boolean
	 */
	public static boolean isNextDay(Date date1, Date date2) {
		if (isSameDay(date1, date2))
			return false;
		if (date1.before(date2)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * M�thode verifie si la date dateATester appartient � l'intervalle
	 * [dateLimite-jourInf j ,dateLimite+jourSup j]
	 * 
	 * @param dateATester
	 * @param dateLimite
	 * @param jourInf
	 * @param jourSup
	 * @return boolean
	 */
	public static boolean isBetween(Date dateATester, Date dateLimite,
			int jourInf, int jourSup) {
		long timeATester = dateATester.getTime();
		long timeReference = dateLimite.getTime();

		// dateATester + jourInf * jours => dateLimite
		// et dateATester - jourSup * jours - dateLimite < 24 heures
		return (timeATester - timeReference + (jourInf + 1) * MS_PAR_JOUR) > 0
				&& (timeATester - (jourSup + 1) * MS_PAR_JOUR - timeReference) < 0;

	}

	/**
	 * M�thode v�rifiant si une date est compris entre des deux dates<br>
	 * 
	 * @param dateATester
	 * @param dateInf
	 * @param dateSup
	 * @return
	 */
	public static boolean isBetween(Date dateATester, Date dateInf, Date dateSup) {
		if (DateUtil.isSameDay(dateATester, dateInf)
				|| DateUtil.isSameDay(dateATester, dateSup)) {
			return true;
		} else {
			if (dateATester.before(dateSup) && dateATester.after(dateInf)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * M�thode permettant comparer une date par rapport � la date du jour
	 * 
	 * @param date
	 * @return boolean
	 */
	public static boolean isCurrentDay(Date date) {
		return isSameDay(date, new Date());
	}

	/**
	 * M�thode permettant de v�rifier si un champ de type String est une date
	 * 
	 * @param data
	 * @param pattern
	 * @return boolean
	 */
	public static boolean isDate(String data, String pattern) {

		if (data == null || data.equals(""))
			return false;

		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = formatter.parse(data);
		} catch (ParseException e) {
			return false;
		}

		String dateReverse = formatter.format(date);

		return data.equals(dateReverse);
	}

	
	/**
	 * M�thode permettant convertir une java.util.Date en java.sql.Date
	 * 
	 * @param date
	 * @return java.sql.Date
	 */
	public static java.sql.Date toSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	/**
	 * M�thode permettant d'ajouter un nombre de jours � une date
	 * 
	 * @param date
	 *            de d�part
	 * @param nbJours
	 *            nombre de jours � ajouter
	 * @return date de d�part + nbJours
	 */
	public static java.util.Date addJours(Date date, int nbJours) {
		Calendar now = Calendar.getInstance();

		now.setTime(date);
		now.add(Calendar.DAY_OF_YEAR, nbJours);
		return now.getTime();
	}

	/**
	 * M�thode permettant d'ajouter un nombre de mois � une date
	 * 
	 * @param date
	 *            de d�part
	 * @param nbMois
	 *            nombre de mois � ajouter
	 * @return date de d�part + nbMois
	 */
	public static java.util.Date addMois(Date date, int nbMois) {
		Calendar now = Calendar.getInstance();

		now.setTime(date);
		now.add(Calendar.MONTH, nbMois);
		return now.getTime();
	}

	/**
	 * M�thode permettant d'obtenir le jour d'une date
	 * 
	 * @param date
	 *            de d�part
	 * @return jour
	 */
	public static int getDay(Date date) {
		Calendar calendar;

		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * M�thode permettant d'obtenir le mois d'une date (janvier = 1, ...)
	 * 
	 * @param date
	 *            de d�part
	 * @return mois
	 */
	public static int getMonth(Date date) {
		Calendar calendar;

		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * M�thode permettant d'obtenir l'annee d'une date
	 * 
	 * @param date
	 *            de d�part
	 * @return annee
	 */
	public static int getYear(Date date) {
		Calendar calendar;

		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * M�thode de test pour une date en cha�ne de caract�re avec le format par
	 * d�faut
	 * 
	 * @param DateUtil
	 * @return boolean
	 */
	public static boolean isDate(String sdt) {
		return DateUtil.isDate(sdt, FORMAT_DEFAUT);
	}

	
	
	public static Calendar dateCalendarCouranteDDMMYYYY() {
		Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		final String date = formatCalendar("dd/MM/yyyy", cal);
		cal = getCalendar("dd/MM/yyyy", date);
		return cal;
	}
	public static String formatCalendar(String format, Calendar fDate) {

		if (fDate == null) {
			return "";
		}

		final SimpleDateFormat sdf = new SimpleDateFormat(format);
		final String lDate = sdf.format(fDate.getTime());
		return lDate;
	}
	public static Calendar getCalendar(String fDate) {
		if (StringUtils.isEmpty(fDate)) {
			return null;
		}
		String format = null;
		final int lengthDate = fDate.length();
		fDate = fDate.replace("-", "/");
		if (lengthDate == 10) {
			format = "dd/MM/yyyy";
		} else if (lengthDate == 13) {
			format = "dd/MM/yyyy HH";
		} else if (lengthDate == 16) {
			format = "dd/MM/yyyy HH:mm";
		} else if (lengthDate == 19) {
			format = "dd/MM/yyyy HH:mm:ss";
		}
		return getCalendar(format, fDate);
	}
	public static Calendar getCalendar(String format, String fDate) {

		final Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		final SimpleDateFormat formatter = new SimpleDateFormat(format);
		final ParsePosition pos = new ParsePosition(0);
		final Date lDate = formatter.parse(fDate, pos);
		if (lDate == null) {
			throw new RuntimeException("Problem [DateUtils]-->getCalendar format:(" + format + ") fDate:(" + fDate + ")");
		}
		final Date dateHeure = new Date(lDate.getTime());
		calendar.setTime(dateHeure);
		return calendar;
	}

	public static String formatCalendarDDMMYYHHMMSSConcat(Calendar fDate) {
		return formatCalendar("ddMMyyyyHHmmss", fDate);
	}

	public static String formatDateLong(Date date) {
		DateFormat dateFormatLong = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss");
		return dateFormatLong.format(date);
	}
		
}
