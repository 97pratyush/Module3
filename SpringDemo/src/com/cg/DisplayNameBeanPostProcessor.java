package com.cg;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		/* System.out.println("Post process after initialization!" + beanName); */
		
		if(beanName.equals("point2")) {
			((Point)bean).setX(200);
			((Point)bean).setY(100);
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		/* System.out.println("Post process before initialization!" + beanName); */
		return bean;
	}

	
}
