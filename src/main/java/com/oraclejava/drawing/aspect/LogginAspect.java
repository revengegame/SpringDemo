package com.oraclejava.drawing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//execution실행하기 위해 필요
@Aspect
public class LogginAspect {
	
	//execution뒤가 실행되기 전에
	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Logging Advice is running");
	}

}
