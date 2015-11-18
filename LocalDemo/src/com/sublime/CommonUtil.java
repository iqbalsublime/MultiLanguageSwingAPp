package com.sublime;

import java.util.Locale;

public class CommonUtil {
	
	
	
	private static Locale locale = null;
	private static String password = null;
	private static String MACAddress = null;
	private static String sessionID = null;
	private static String leftThumb = null;
	private static String rightThumb = null;
	private static String leftIndex = null;
	private static String rightIndex = null;
	public static Locale getLocale() {
		return locale;
	}
	public static void setLocale(Locale locale) {
		CommonUtil.locale = locale;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		CommonUtil.password = password;
	}
	public static String getMACAddress() {
		return MACAddress;
	}
	public static void setMACAddress(String mACAddress) {
		MACAddress = mACAddress;
	}
	public static String getSessionID() {
		return sessionID;
	}
	public static void setSessionID(String sessionID) {
		CommonUtil.sessionID = sessionID;
	}
	public static String getLeftThumb() {
		return leftThumb;
	}
	public static void setLeftThumb(String leftThumb) {
		CommonUtil.leftThumb = leftThumb;
	}
	public static String getRightThumb() {
		return rightThumb;
	}
	public static void setRightThumb(String rightThumb) {
		CommonUtil.rightThumb = rightThumb;
	}
	public static String getLeftIndex() {
		return leftIndex;
	}
	public static void setLeftIndex(String leftIndex) {
		CommonUtil.leftIndex = leftIndex;
	}
	public static String getRightIndex() {
		return rightIndex;
	}
	public static void setRightIndex(String rightIndex) {
		CommonUtil.rightIndex = rightIndex;
	}
	
	
	
	
}


