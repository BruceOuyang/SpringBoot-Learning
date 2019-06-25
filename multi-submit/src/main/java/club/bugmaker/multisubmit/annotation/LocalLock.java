package club.bugmaker.multisubmit.annotation;

import java.lang.annotation.*;

/**
 * LocalLock 锁的注解
 *
 * @Author Bruce
 * @Date 2019/6/25 18:12
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LocalLock {

    String key() default "";

    /**
     * 过期时间 TODO 由于用的 guava 暂时就忽略这属性吧 集成 redis 需要用到
     * @return
     */
    int expire() default 5;
}
