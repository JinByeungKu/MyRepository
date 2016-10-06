package com.mycompany.myapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam09")
public class Exam09Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam09Controller.class);

	private A a;
	public void setA(A a) {
		logger.info("setA() 실행");
		this.a = a;
	}
	
	private B b;
	public void setB(B b) {
		logger.info("setB() 실행");
		this.b = b;
	}
	
	private ServiceA serviceA;
	public void setServiceA(ServiceA serviceA) {
		logger.info("ServiceA() 실행");
		this.serviceA = serviceA;
	}
	
	private ServiceB serviceB;
	public void setServiceB(ServiceB serviceB) {
		logger.info("ServiceB() 실행");
		this.serviceB = serviceB;
	}
	
	private ServiceC serviceC;
	public void setServiceC(ServiceC serviceC) {
		logger.info("ServiceC() 실행");
		this.serviceC = serviceC;
	}

	public Exam09Controller() {
		logger.info("Exam09Controller 객체 생성");
	}
	
	@RequestMapping("/index")
		public String index() {
			logger.info("index 처리");
			return "exam09/index";
	}
	
	@RequestMapping("/method1")
	public String method1() {
		logger.info("method1 처리");
		a.method();
		b.method();
		serviceA.method();
		serviceB.method();
		serviceC.method();
		return "redirect:/exam09/index";
	}
}