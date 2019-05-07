package com.tyba.technicalServices.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * classe uttilitaire
 * @author TYBASOFT
 *
 */
public class Utils {
	/**
	 * convert to SHA1
	 * @param input
	 * @return
	 */
	public static String toSHA1(String input) {
		byte[] convertme = input.getBytes();
	    MessageDigest md = null;
	    try {
	        md = MessageDigest.getInstance("SHA-1");
	    }
	    catch(NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } 
	    return byteArrayToHexString(md.digest(convertme));
	}
	private  static String byteArrayToHexString(byte[] b) {
		  String result = "";
		  for (int i=0; i < b.length; i++) {
		    result +=
		          Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
		  }
		  return result;
		}
	public static void main(String[] args) {
		System.out.println(toSHA1("fffffffffffffff"));
	}
}
