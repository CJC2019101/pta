package PTA.bGrade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author JianfeiChen
 * @date 2020/4/27 9:25
 * @Description 描述注解
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface Description {
    String desc() default "";
}
