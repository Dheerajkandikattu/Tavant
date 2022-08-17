package com.org.tav.JunitDemo;

public class StringUtils {
	public static boolean isPalindrom(String text)
	{
		var cleaned =text.replaceAll("\\s+","").toLowerCase();
		var plain =new StringBuilder(cleaned);
		var reversed=plain.reverse().toString();
		return reversed.equals(cleaned);
	}

}
