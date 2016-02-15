package org.j8unit.repository.javax.jws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.jws.Oneway interface javax.jws.Oneway}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link OnewayClassTests}.
 * </p>
 *
 * @see javax.jws.Oneway interface javax.jws.Oneway (the hereby targeted class-under-test class)
 * @see OnewayClassTests OnewayClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OnewayTests<SUT extends javax.jws.Oneway>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
