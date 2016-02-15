package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.NO_IMPLEMENT class org.omg.CORBA.NO_IMPLEMENT}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link NO_IMPLEMENTClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.NO_IMPLEMENT class org.omg.CORBA.NO_IMPLEMENT (the hereby targeted class-under-test class)
 * @see NO_IMPLEMENTClassTests NO_IMPLEMENTClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NO_IMPLEMENTTests<SUT extends org.omg.CORBA.NO_IMPLEMENT>
extends SystemExceptionTests<SUT> {

}
