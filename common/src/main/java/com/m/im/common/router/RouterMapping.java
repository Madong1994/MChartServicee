package com.m.im.common.router;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface RouterMapping {
	String url();

	String viewPath() default "";
}