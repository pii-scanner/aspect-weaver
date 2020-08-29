package com.citi.cpb;
import java.lang.annotation.Annotation;
import com.citi.cpb.annotations.*;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.SoftException;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;
import java.lang.reflect.Field;
import java.lang.reflect.Executable;
//import java.lang.reflect.Executable.getParameters;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import org.apache.commons.logging.*;

@Aspect
public class Try {
	
	private static final Log logg = LogFactory.getLog(Try.class);

	
	@Around("call(* org.slf4j.Logger.*(..))||call(* org.apache.logging.log4j.Logger.*(..))")
	
	public Object LoggerMethodExecuted(ProceedingJoinPoint pjp) throws Throwable {
	
		
		Object[] args = pjp.getArgs();
		StringBuilder str=new StringBuilder(); 
		if (args != null) {
			str.append(args[0].toString());
			if (args.length == 1) {
				
			} else if (args.length > 1) {
				
				for (int j = 1; j < args.length; j++) {
					if (args[j].getClass() != String.class) {
						Object c = args[j];
						Class cl=c.getClass();
						
						System.out.println(cl);
						Field[] f = c.getClass().getDeclaredFields();
						for (int i = 0; i < f.length; i++) {
							try {
								Field x = f[i];
								if (x.isAnnotationPresent(com.citi.cpb.annotations.NPII.class)) {
									Object value=x.get(args[j]);
									str.append(x.getName()+"="+((String)value)+",");
								} else {
									str.append(x.getName() + "= **Redacted**");
								}
								
							} catch (IllegalArgumentException | IllegalAccessException e) {

							}
						}
					} else {
						str.append(args[j].getClass().getName());
					}
				}
			}
		}
		logg.info(str);
		return null;
	}
	
}
