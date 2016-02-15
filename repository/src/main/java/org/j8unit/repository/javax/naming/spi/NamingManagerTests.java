package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.spi.NamingManager class javax.naming.spi.NamingManager}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link NamingManagerClassTests}.
 * </p>
 *
 * @see javax.naming.spi.NamingManager class javax.naming.spi.NamingManager (the hereby targeted class-under-test class)
 * @see NamingManagerClassTests NamingManagerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingManagerTests<SUT extends javax.naming.spi.NamingManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
