//package com.citi.cpb;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Modifier;
//
//public aspect AspectJInterceptor {
//    
////    pointcut LoggerMethodExecuted(): call(* org.apache.logging.log4j.Logger.*(..));
//    pointcut LoggerMethodExecuted(): call(* org.slf4j.Logger.*(..));
//    before(): LoggerMethodExecuted() {    	
//    	Object [] arguments = thisJoinPoint.getArgs();
//    	for(int i=0;i<arguments.length;i++) {
//    		Object argument=arguments[i];
//    		if(argument.getClass()!= String.class)
//    		{
//    			StringBuilder logstring = new StringBuilder();
//    			Field[] fields = argument.getClass().getDeclaredFields();
//    			for(int j=0;j<fields.length;j++) {
//    				Field field=fields[j];
//    				Object value;
//    				try {
//    					String name=field.getName();
//    					if (!Modifier.isPublic(field.getModifiers())) {
//    						field.setAccessible(true);
//    					}
//    					if(field.isAnnotationPresent(com.citi.cpb.annotations.NPII.class))
//    					{
//    						value=field.get(this);
//    						System.out.println(value.toString());
//    						logstring.append(name).append("=").append(value).append(",");
//    					}
//    					else
//    					{
//    						logstring.append("|").append(name).append(" is Redacted |,");
//    					}
//    				}
//    				catch (IllegalArgumentException | IllegalAccessException e) {
//    				}
//    			}
//    			System.out.println(logstring);
//    		}
//    	}
//    }
//}
//
