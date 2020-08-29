//package com.citi.cpb;
//
//import java.lang.annotation.Annotation;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.SoftException;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.reflect.MethodSignature;
//import java.lang.reflect.Field;
//import java.lang.reflect.Modifier;
//import com.citi.cpb.annotations.*;
//@Aspect
//public class AspectIntercept {
////	@Around("call(* org.apache.logging.log4j.Logger.*(..))")
//	@Around("call(* org.slf4j.Logger.*(..))")
//
//	public Object LoggerMethodExecuted(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("parameter");
//
//		Object[] args = pjp.getArgs();
//		if (args != null) {
//			if (args.length == 1) {
//				return pjp.proceed(args);
//			} else if (args.length > 1) {
//				Object redactedArgs[]=new Object[args.length];
//				System.arraycopy(args, 0, redactedArgs, 0, args.length);
//                
//				for (int j = 1; j < args.length; j++) {
//					if (args[j].getClass() != String.class) {
//						Object c = args[j];
//						Field[] ff = c.getClass().getDeclaredFields();
//						Field[]f=ff;
//						for (int i = 0; i < f.length; i++) {
//							try {
//								Field x = f[i];
//								if (x.isAnnotationPresent(com.citi.cpb.annotations.NPII.class)) {
////									Object value = x.get(redactedArgs[j]);
//									
//								} else {
//									x.set(redactedArgs[j], " |Redacted|");
//									System.out.println(x.getName() + " is Redacted");
//								}
//								
//							} catch (IllegalArgumentException | IllegalAccessException e) {
//
//							}
//						}
//					} else {
//						
//					}
//				}
////				return pjp.proceed(redactedArgs);
//			}
//		}
//		return pjp.proceed(args);
//	}
//}
////
//////Field []f=pjp.getThis().getClass().getDeclaredFields();
//////System.out.println(f.length);
////
//////MethodSignature signature = (MethodSignature) pjp.getSignature();
//////String methodName = signature.getMethod().getName();
//////Class<?>[] parameterTypes = signature.getMethod().getParameterTypes();
//////
//////
//////String mname=signature.getMethod().getDeclaringClass().getSimpleName();
//////System.out.println(signature.getMethod().getParameterCount()); //2
//////
//////for(Class c :parameterTypes) {
//////	System.out.println(c.getName());
//////	System.out.println(c.getDeclaredAnnotations().getClass().getName()+"###");
//////	for (Annotation a:c.getDeclaredAnnotations())
//////	{
//////		System.out.println(a.toString()+"****");
//////	}
//////}
//////Annotation[][] annotations;
//////try 
//////{
//////    annotations = pjp.getTarget().getClass().getMethod(methodName, parameterTypes).getParameterAnnotations();
//////} 
//////catch (Exception e) {
//////    throw new SoftException(e);
//////}
//////System.out.println(annotations);
//////for (int i = 0; i < args.length; i++) {
//////	
////////	System.out.printf("With argument of type %s and value %s. \n", args[i].getClass().toString(), args[i]);
//////	System.out.println(args[i].getClass().getAnnotation(com.citi.cpb.annotations.NPII.class));
//////       if (args[i].getClass().isAnnotationPresent(com.citi.cpb.annotations.NPII.class)) {
//////            Object raw = args[i];
//////            if (raw instanceof String) {
//////                args[i] = ((String) raw);
//////            }
//////        }
//////        else
//////        {
//////        	args[i]="|Redacted|";
//////        }	        
//////}