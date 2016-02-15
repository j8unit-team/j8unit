package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.PERSIST_STORE class org.omg.CORBA.PERSIST_STORE}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PERSIST_STOREClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.PERSIST_STORE class org.omg.CORBA.PERSIST_STORE (the hereby targeted class-under-test class)
 * @see PERSIST_STOREClassTests PERSIST_STOREClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PERSIST_STORETests<SUT extends org.omg.CORBA.PERSIST_STORE>
extends SystemExceptionTests<SUT> {

}
