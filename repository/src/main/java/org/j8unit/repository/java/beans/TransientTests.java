package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.Transient interface java.beans.Transient}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.TransientClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransientTests<SUT extends java.beans.Transient>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.Transient#value() public abstract boolean java.beans.Transient.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}