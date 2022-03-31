package JFS.Productapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appdri {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		NormalCC normalc = context.getBean(NormalCC.class);
		normalc.displaycall();
	
//	     NormalCCL nmalcc = context.getBean(NormalCCL.class);
//	     nmalcc.displaycallC();
//		returntype retu = context.getBean(returntype.class);
//		int x= retu.retut();
	}
}
