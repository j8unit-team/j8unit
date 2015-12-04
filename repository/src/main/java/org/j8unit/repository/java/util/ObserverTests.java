package org.j8unit.repository.java.util;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Observer interface java.util.Observer}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.ObserverClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObserverTests<SUT extends java.util.Observer>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Observer#update(java.util.Observable,java.lang.Object) public abstract void
     * java.util.Observer.update(java.util.Observable,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_Observable_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
