package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.OBJ_ADAPTER class org.omg.CORBA.OBJ_ADAPTER}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link OBJ_ADAPTERClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.OBJ_ADAPTER class org.omg.CORBA.OBJ_ADAPTER (the hereby targeted class-under-test class)
 * @see OBJ_ADAPTERClassTests OBJ_ADAPTERClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OBJ_ADAPTERTests<SUT extends org.omg.CORBA.OBJ_ADAPTER>
extends SystemExceptionTests<SUT> {

}
