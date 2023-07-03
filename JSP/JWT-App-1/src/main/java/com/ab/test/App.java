package com.ab.test;

import com.ab.utility.JwtUtil;

import io.jsonwebtoken.Claims;

public class App {
	public static void main(String[] args) {
		String token = JwtUtil.generateToken("5435AA","RAJA","123456");
		System.out.println("Key: " + token);
		
		System.out.println("================================================");
		Claims claims = JwtUtil.getClaims("123456", token);
		
		System.out.println("Subject (User Name) " + claims.getSubject());
		System.out.println("Client Id " + claims.getId());
		System.out.println("Expiry Date/Time " + claims.getExpiration());
		System.out.println("Issuer Date/Time " + claims.getIssuedAt());
		
		System.out.println("Is this token Valid: " + JwtUtil.isTokenValid("123456", token));
		
	}
	
	
	
}
