package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ORBIdHelper class
 * org.omg.PortableInterceptor.ORBIdHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ORBIdHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ORBIdHelper class org.omg.PortableInterceptor.ORBIdHelper (the hereby targeted
 *      class-under-test class)
 * @see ORBIdHelperClassTests ORBIdHelperClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBIdHelperTests<SUT extends org.omg.PortableInterceptor.ORBIdHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
