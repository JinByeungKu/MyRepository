package com.mycompany.myapp1.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceB {
		private static final Logger logger = LoggerFactory.getLogger(ServiceB.class);
		
		public ServiceB() {
			logger.info("ServiceA 객체 생성");
		}
		
		public void method() {
			logger.info("method 실행");
	}
}