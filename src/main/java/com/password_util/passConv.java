package com.password_util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class passConv {
	
	public static String encode(String txt) {
		Encoder encoder=Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	
	public static String decode(String encoderTxt) {
		Decoder decoder=Base64.getDecoder();
		byte[] decode=decoder.decode(encoderTxt);
		return new String(decode);
	}

	public static void main(String[] args) {
//		passConv conv=new passConv();
//		String name=conv.encode("Sagar chimankar");
//		System.out.println(name);
//		
//		String str=conv.decode(name);
//		System.out.println(str);
	}

}
