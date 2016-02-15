package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.CurrentHelper class
 * org.omg.PortableServer.CurrentHelper}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CurrentHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.CurrentHelper class org.omg.PortableServer.CurrentHelper (the hereby targeted
 *      class-under-test class)
 * @see CurrentHelperClassTests CurrentHelperClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentHelperTests<SUT extends org.omg.PortableServer.CurrentHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
