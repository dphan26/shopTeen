package com.example.shopTeen.util;

public class MyConvert {
public static String convertUrl (String url) {
	String rs = url.replace(" ", "-");
	return rs;
}
}
