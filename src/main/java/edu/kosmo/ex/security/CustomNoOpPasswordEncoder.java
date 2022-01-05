package edu.kosmo.ex.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder { //암호화 안한 것

	public String encode(CharSequence rawPassword) { //암호화과정

		log.warn("before encode :" + rawPassword);

		return rawPassword.toString();
	}
	//원래 있던 것과 입력한 것을 비교하는 것.
	public boolean matches(CharSequence rawPassword, String encodedPassword) {

		log.warn("matches: " + rawPassword + ":" + encodedPassword);

		return rawPassword.toString().equals(encodedPassword);
	}

}
