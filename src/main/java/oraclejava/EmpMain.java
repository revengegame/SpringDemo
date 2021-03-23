package oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Employee emp = (Employee)ctx.getBean("go");
		System.out.println("이름 : " + emp.getName() +emp.toString());
		System.out.println("주소 : " + emp.getAddress());
				
		
		ctx.close();
	}

}
