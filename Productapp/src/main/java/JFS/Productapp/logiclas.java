package JFS.Productapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class logiclas {
	@Before(value = "execution(public void displaycall())")
	public void beforedislog(JoinPoint join) {
		System.out.println("Before log info used "+join.getSignature().getName());
	}

	@After("execution(public void displaycall())")
	public void afterdislog(JoinPoint join) {
		System.out.println("after log used info"+join.getStaticPart());
		System.out.println("info"+join.getThis());
	}

//	@AfterReturning(value ="execution(public int retut())",returning="num")	
//	
//		public void afterrtdis() {
//		System.out.println("after returning");
//			
//		}
//	@Around(value = "execution(public void displaycall())")
//	public void aroundao() {
//		System.out.println(" only around info");
//	}

//	@Pointcut("execution(* NormalCC.*(..))")
//	public void selectcut() {
//
//	}
//
//	@Around("selectcut()")
//	public void aroundpoint() {
//		System.out.println("point cut used in around");
//
//	}

}
