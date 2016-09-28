package com.mycompany.myapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")   //logger.info("/member/login") 중복을 줄여주기 위한 코드
public class MemberController {
   private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
   
   @RequestMapping("/join")   //http://localhost:8080/myapp/Member/join
   public String join() {
	   logger.info("join 요청 처리");
	   return "member/join";
   }
   
   @RequestMapping("/login")   //http://localhost:8080/myapp/Member/login
   public String login() {
	   logger.info("login 요청 처리");
	   return "member/login";
   }
   
   @RequestMapping("/logout")   //http://localhost:8080/myapp/Member/logout
   public String logout() {
	   logger.info("logout 요청 처리");
	   return "member/logout";
   }
   
   @RequestMapping("/withdraw")   //http://localhost:8080/myapp/Member/withdraw
   public String withdraw() {
	   logger.info("withdraw 요청 처리");
	   return "member/withdraw";
   }
   
}
