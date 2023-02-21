package it.rk.jsonapiapp;

import java.util.Base64;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Base64EncodingDecoding {
	public static void main(String[] args) throws JsonProcessingException {

		String originalInput = "HelloWorld";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

		byte[] a = Base64.getDecoder().decode(encodedString);

		System.out.println("==========Encoding and Decoding with Base64===========");
		System.out.println("Input String:" + originalInput);
		System.out.println("Encoded Data:"+encodedString);
		System.out.println("Decoded Data as String:"+new String(Base64.getDecoder().decode(encodedString.getBytes())));

	}
}