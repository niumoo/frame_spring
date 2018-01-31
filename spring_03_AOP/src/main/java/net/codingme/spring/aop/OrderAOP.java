package net.codingme.spring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * <p>Description：Order的增强类
 * @author  NiuJinpeng
 * @date    2018年2月18日下午7:46:10
 */
@Aspect
public class OrderAOP {
	/**
	 * 在方法上面使用注解完成增强操作
	 */
	
	// 前置增强
	@Before("execution(* net.codingme.spring.aop.Order.*(..))")
	public void before() {
		System.out.println("前置增强..........");
	}
	
	// 后置增强
	public void after() {
		System.out.println("后置增强..........");
	}

	// 环绕增强
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// 方法之前
		System.out.println("环绕增强-之前......");
		
		// 执行被增强的方法
		proceedingJoinPoint.proceed();
		
		// 方法之后
		System.out.println("环绕增强-之后......");
	}
}

















