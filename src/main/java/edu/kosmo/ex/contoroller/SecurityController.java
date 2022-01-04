package edu.kosmo.ex.contoroller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;


@Log4j
@RequestMapping("/security/*")
@Controller
public class SecurityController {
	
	@GetMapping("/all")
	public String all() {
		System.out.println("do all acess everybody");
		
		return "/security/all";
	}
	@GetMapping("/member")
	public String member() {
		System.out.println("login member");
		
		return "/security/member";
	}
	/*@GetMapping("/admin")
	public String admin() {
		log.info("login admin");
		
		return "/security/admin";
	}*/
	
	@GetMapping("/admin")
	public void admin() { //void로 적어줘도 경로명을 읽어 준다 security/admin 해줌
		System.out.println("login admin");
		log.info("");
	}
	
	@GetMapping("/accessError")
	public void accessEorror(Model model) {
		System.out.println("accessError");
		
		
		model.addAttribute("msg","ACCESS Denied(403 에러)"); //리턴값이 void이므로 
	}
	
}
