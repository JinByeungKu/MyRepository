package com.mycompany.myapp1.exam04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return"exam04/index";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinform() {
		logger.info("joinForm 요청 처리");
		return"exam04/joinform";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(Member member) {
		logger.info("join 요청 처리");
		logger.info("bon: " + member.getBno());
		logger.info("btitle: " + member.getBtitle());
		logger.info("bcontent: " + member.getBcontent());
		logger.info("writer: " + member.getWriter());
		return "exam04/index";
	}
	

}
