package com.mycompany.myapp1.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index 요청 처리");
		return"test/index";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinform() {
		logger.info("joinForm 요청 처리");
		return"test/joinform";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(Member member) {
		logger.info("join 요청 처리");
		logger.info("bon: " + member.getBno());
		logger.info("btitle: " + member.getBtitle());
		logger.info("bcontent: " + member.getBcontent());
		logger.info("writer: " + member.getWriter());
		return "test/index";
		
	}
}
