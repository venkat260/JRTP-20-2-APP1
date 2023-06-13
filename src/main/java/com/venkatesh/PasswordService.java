package com.venkatesh;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;



public class PasswordService {
	
	int x=10;

	public static String passwordEncoder(String txt) {

		Encoder encoder = Base64.getEncoder();

		String encodeToString = encoder.encodeToString(txt.getBytes());
		return encodeToString;

	}

	public static String decoder(String encodeToString) {

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeToString);
		return new String(decode);

	}

	public static void main(String[] args) {

		String passwordEncoder = PasswordService.passwordEncoder("lavan");
		System.out.println(passwordEncoder);

		String decoder = PasswordService.decoder(passwordEncoder);

		System.out.println(decoder);

	}

}
