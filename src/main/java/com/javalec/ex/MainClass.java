package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc); 
		MyCalcluator myCalcluator = ctx.getBean("myCalcluator", MyCalcluator.class);
		
		myCalcluator.add();
		myCalcluator.sub();
		myCalcluator.multi();
		myCalcluator.div();
	}

}
