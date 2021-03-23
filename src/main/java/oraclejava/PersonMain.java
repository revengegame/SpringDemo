package oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new
				ClassPathXmlApplicationContext("SpringConfig.xml");
		Person p = (Person)ctx.getBean("person");
		String name = p.getName();
		int age = p.getAge();
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		
		ctx.close();
	}

}
