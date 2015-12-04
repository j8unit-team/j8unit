package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.SystemColor class java.awt.SystemColor}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.SystemColorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SystemColorTests<SUT extends java.awt.SystemColor>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.awt.ColorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.SystemColor#toString() public java.lang.String java.awt.SystemColor.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
