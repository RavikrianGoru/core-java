package in.nareshit.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Product {
	
	//attributes
	int prodId(); //required
	String objName() default "NO"; //optional
	ObjType objType() default ObjType.NEW; //optional

}
