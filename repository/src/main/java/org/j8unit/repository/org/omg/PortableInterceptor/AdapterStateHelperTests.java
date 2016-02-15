package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.AdapterStateHelper class
 * org.omg.PortableInterceptor.AdapterStateHelper}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AdapterStateHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.AdapterStateHelper class org.omg.PortableInterceptor.AdapterStateHelper (the hereby
 *      targeted class-under-test class)
 * @see AdapterStateHelperClassTests AdapterStateHelperClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterStateHelperTests<SUT extends org.omg.PortableInterceptor.AdapterStateHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
