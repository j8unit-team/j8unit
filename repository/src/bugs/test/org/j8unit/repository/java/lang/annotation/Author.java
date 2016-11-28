package org.j8unit.repository.java.lang.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.function.Function;

/**
 * A simple {@linkplain Repeatable repeatable} annotation naming an author of a java component.
 *
 * This annotation shall be considered by javadoc (and similar tools) (see {@link Documented}), is suitable for a type
 * context (see {@link Target}, {@link java.lang.annotation.ElementType#TYPE TYPE}), and may be read reflectively (see
 * {@link Retention}, {@link java.lang.annotation.RetentionPolicy#RUNTIME RUNTIME}).
 *
 * Further, there is a small utility function to generated the acronym of a given author (see {@link #INITIALS}).
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
@Repeatable(Authors.class)
public abstract @interface Author {

    /**
     * The name of the author.
     */
    public abstract String value();

    /**
     * Utility function to generated the acronym of a given author. It computes the upper-case presentation of each
     * word's first letter.
     */
    public static final Function<Author, String> INITIALS = author -> Arrays.stream(author.value().split("\\s+")) //
                                                                            .map(w -> w.charAt(0)) //
                                                                            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) //
                                                                            .toString() //
                                                                            .toUpperCase();

}
