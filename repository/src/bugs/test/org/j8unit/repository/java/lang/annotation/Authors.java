package org.j8unit.repository.java.lang.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * In order to make {@link Author} annotation repeatable, this is the according containing annotation type.
 *
 * @see {@link http://docs.oracle.com/javase/tutorial/java/annotations/repeating.html}
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public abstract @interface Authors {

    public abstract Author[] value();

}
