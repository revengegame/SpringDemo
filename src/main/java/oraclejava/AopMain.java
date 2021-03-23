package oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.drawing.model.Circle;
import com.oraclejava.drawing.model.Triangle;
import com.oraclejava.drawing.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("SpringConfig2.xml");
		
		ShapeService shapeService=(ShapeService) ctx.getBean("shapeService");
		
		Circle circle=shapeService.getCircle();
		Triangle triangle=shapeService.getTriangle();
		
		System.out.println(circle.getName());
		System.out.println(triangle.getName());
		
		ctx.close();
	}

}
