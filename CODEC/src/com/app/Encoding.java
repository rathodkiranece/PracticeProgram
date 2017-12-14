package com.app;

import org.apache.commons.codec.binary.Base64;

public class Encoding {
	public static void main(String[] args) {
	//ENCODING
		
		String msg="kiran";
		byte[] a=msg.getBytes();
		byte[] b=Base64.encodeBase64(a);
		String enc=new String(b);
		System.out.println(enc);
		//DECODING for String
		byte[] c=enc.getBytes();
		byte[] d=Base64.decodeBase64(c);
		String nrml=new String(d);
		System.out.println(nrml);
		}
}
