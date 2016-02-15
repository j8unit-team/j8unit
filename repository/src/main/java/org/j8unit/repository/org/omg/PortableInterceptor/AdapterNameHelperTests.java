package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.AdapterNameHelper class
 * org.omg.PortableInterceptor.AdapterNameHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AdapterNameHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.AdapterNameHelper class org.omg.PortableInterceptor.AdapterNameHelper (the hereby
 *      targeted class-under-test class)
 * @see AdapterNameHelperClassTests AdapterNameHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterNameHelperTests<SUT extends org.omg.PortableInterceptor.AdapterNameHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
