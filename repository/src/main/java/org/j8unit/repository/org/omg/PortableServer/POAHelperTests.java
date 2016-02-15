package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POAHelper class org.omg.PortableServer.POAHelper}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link POAHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POAHelper class org.omg.PortableServer.POAHelper (the hereby targeted class-under-test
 *      class)
 * @see POAHelperClassTests POAHelperClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface POAHelperTests<SUT extends org.omg.PortableServer.POAHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
