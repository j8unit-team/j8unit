package org.j8unit.repository.java.rmi;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.Remote interface java.rmi.Remote}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.RemoteClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteTests<SUT extends java.rmi.Remote>
extends J8UnitTest<SUT> {

}
