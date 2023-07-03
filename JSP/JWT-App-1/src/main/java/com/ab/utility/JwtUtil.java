package com.ab.utility;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	public static String generateToken(String id, String subject, String secretKey) {
		return Jwts.builder()
				.setId(id).setSubject(subject).setIssuer("Abhishek")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(secretKey.getBytes()))
				.compact();
				
	}
	
	public static Claims getClaims(String secretKey, String token) {
		return Jwts.parser().setSigningKey(Base64.getEncoder().encode(secretKey.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}
	
	public static Boolean isTokenValid(String secretKey, String token) {
		Date tokenExpiryTime = getClaims(secretKey, token).getExpiration();
		Date sysDate = new Date();
		return sysDate.before(tokenExpiryTime);
	}

}
