package org.j8unit.repository.java.security.interfaces;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.interfaces.DSAKey interface java.security.interfaces.DSAKey}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.interfaces.DSAKeyClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DSAKeyTests<SUT extends java.security.interfaces.DSAKey>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.interfaces.DSAKey#getParams() public abstract
     * java.security.interfaces.DSAParams java.security.interfaces.DSAKey.getParams()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParams()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
