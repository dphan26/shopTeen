package com.example.shopTeen.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MySecurity {
	public static String EncryptPassword(String password) {
		String rs = password;
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			 byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

				// bytes to hex
		        StringBuilder sb = new StringBuilder();
		        for (byte b : hashInBytes) {
		            sb.append(String.format("%02x", b));
		        }
		        rs = sb.toString();
		        System.out.println(rs);
		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
}
